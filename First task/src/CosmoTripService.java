import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class CosmoTripService {
    private ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    private Astronauts astronauts = (Astronauts) context.getBean("astronauts");
    private Shuttles shuttles = (Shuttles) context.getBean("shuttles");

    private ArrayList<Astronaut> getRandomAstronauts(Shuttle shuttle) {
        ArrayList<Astronaut> crew = new ArrayList<Astronaut>();
        Random random = new Random();
        Set<Integer> generated = new HashSet<Integer>();

        while (generated.size() < shuttle.getCapaciousness()) {
            generated.add(random.nextInt(this.astronauts.getAstronautList().size()));
        }

        for (int i: generated) {
            crew.add(this.astronauts.getAstronautList().get(i));
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
