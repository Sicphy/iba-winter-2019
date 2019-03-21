import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        CosmoTripService cosmoTripService = new CosmoTripService();
        EmulationService emulationService = new EmulationService();


        /*Astronauts astronauts = (Astronauts) context.getBean("astronauts");
        System.out.println(astronauts);
        System.out.println(astronauts.getAstronautList().getClass().getName());*/

        //System.out.println(cosmoTripService.getTrip());
        emulationService.startService();
    }
}
