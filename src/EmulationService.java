import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;
import java.util.Timer;
import java.util.TimerTask;

public class EmulationService {
    private ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    private CosmoTripService cosmoTripService = new CosmoTripService();
    private Shuttle shuttle = cosmoTripService.getTrip();
    private Trip trip = (Trip) context.getBean("To-the-moon");

    public synchronized void startService() {
        Integer distance = trip.getDistance();
        Timer timer = new Timer();
        Road road = new Road(trip.getDistance(), timer);
        System.out.println(shuttle.getParameters() + "\n");
        System.out.println("Crew for this trip: ");

        for (Astronaut astronaut : this.shuttle.getAstronauts()) {
            System.out.println(astronaut.toString());
        }

        System.out.println("Prepare for starting...");

        try {
            wait(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Start the trip !!!");

        /*try {
            System.out.println("Now you are in " + distance.toString() + " kilometers from the moon.");
            wait(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        timer.schedule(road, 0, 2000);
    }

    class Road extends TimerTask {
        Timer timer;
        private Integer distance;

        Road(Integer distance, Timer timer) {
            this.distance = distance;
            this.timer = timer;
        }

        public void run() {
            System.out.println("Now you are in " + this.distance.toString() + " kilometers from the moon.");
            this.distance -= 200;
            if(this.distance <= 0) {
                System.out.println("You at the moon !!!");
                this.timer.cancel();
            }
        }
    }
}
