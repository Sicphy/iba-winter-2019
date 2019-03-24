import objects.Astronaut;
import objects.Astronauts;
import objects.Shuttles;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.EmulationService;

public class Main {
    public static void main(String[] args) {
        EmulationService emulationService = new EmulationService();

        emulationService.startService();
    }
}
