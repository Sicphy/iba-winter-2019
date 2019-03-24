package services;

import objects.Astronaut;
import objects.Astronauts;
import objects.Shuttle;
import objects.Shuttles;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.*;

public class CosmoTripService {
    private ApplicationContext context = new AnnotationConfigApplicationContext(configs.SpacecraftConfig.class);
    private ArrayList<Astronaut> astronauts = context.getBean("astronauts", ArrayList.class); //просто посмотреть, что так можно
    private Shuttles shuttles = context.getBean("shuttles", Shuttles.class);

    private ArrayList<Astronaut> getRandomAstronauts(Shuttle shuttle) {
        ArrayList<Astronaut> crew = new ArrayList<Astronaut>();
        Random random = new Random();
        Set<Integer> generated = new HashSet<Integer>();

        while (generated.size() < shuttle.getCapaciousness()) {
            generated.add(random.nextInt(this.astronauts.size()));
        }

        for (int i: generated) {
            crew.add(this.astronauts.get(i));
        }

        return crew;
    }

    private Shuttle getRandomShuttle() {
        Random random = new Random();
        return shuttles.getShuttleList().get(random.nextInt(this.shuttles.getShuttleList().size()));
    }

    public Shuttle getTrip() {
        Shuttle shuttle = getRandomShuttle();
        ArrayList<Astronaut> crew = getRandomAstronauts(shuttle);
        shuttle.setAstronauts(crew);

        return shuttle;
    }
}

