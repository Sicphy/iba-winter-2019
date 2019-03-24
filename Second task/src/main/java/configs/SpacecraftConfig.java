package configs;

import objects.Astronaut;
import java.util.ArrayList;
import objects.Astronauts;
import java.util.List;
import objects.Shuttle;
import objects.Shuttles;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpacecraftConfig {
    @Bean(name="astronauts")
    public List<Astronaut> astronauts() {
        ArrayList<Astronaut> astronauts = new ArrayList<Astronaut>();

        astronauts.add(new Astronaut("Kirill", "Captain", 12));
        astronauts.add(new Astronaut("Misha", "Captain", 10));
        astronauts.add(new Astronaut("Grisha", "Assistant", 7));
        astronauts.add(new Astronaut("Dima", "Assistant", 8));
        astronauts.add(new Astronaut("Dasha", "A woman", 13));
        astronauts.add(new Astronaut("Nina", "A woman", 14));
        astronauts.add(new Astronaut("Nastya", "Cook", 15));
        astronauts.add(new Astronaut("Gena", "Cook", 9));

        return astronauts;
    }

    @Bean(name="shuttles")
    public Shuttles shuttles() {
        ArrayList<Shuttle> shuttles = new ArrayList<Shuttle>();

        shuttles.add(new Shuttle(null, 4, "Victory"));
        shuttles.add(new Shuttle(null, 4, "Trouble"));
        shuttles.add(new Shuttle(null, 4, "Titanic"));

        return new Shuttles(shuttles);
    }
}
