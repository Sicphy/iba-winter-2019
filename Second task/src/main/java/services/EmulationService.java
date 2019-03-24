package services;

import objects.Astronaut;
import objects.Shuttle;
import objects.Trip;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class EmulationService {
    private CosmoTripService cosmoTripService = new CosmoTripService();
    private Shuttle shuttle = cosmoTripService.getTrip();
    private Trip trip = new Trip();

    public void startService() {
        Scanner in = new Scanner(System.in);
        Timer timer = new Timer();
        TripTimerTask tripTimerTask = new TripTimerTask(timer);

        System.out.println("Enter final destination: ");
        this.trip.setFinalDestination(in.nextLine());
        System.out.println("Enter distance to the " + this.trip.getFinalDestination() + ": ");
        this.trip.setDistance(in.nextInt());
        System.out.println(shuttle.getParameters() + "\n");
        System.out.println("Crew for this trip: ");

        for (Astronaut astronaut : this.shuttle.getAstronauts()) {
            System.out.println(astronaut.toString());
        }

        System.out.println("Prepare for starting...");

        timer.schedule(tripTimerTask, 5000, 2000);
    }

    class TripTimerTask extends TimerTask {
        private Timer timer;
        private boolean isFirst;

        TripTimerTask(Timer timer) {
            this.timer = timer;
            this.isFirst = true;
        }

        public void run() {
            if(isFirst) {
                isFirst = false;
                System.out.println("Start the trip !!!");
            }
            System.out.println("Now you are in " + trip.getDistance().toString() + " kilometers from the "
                    + trip.getFinalDestination() + '.');
            trip.setDistance(trip.getDistance() - 200);
            if(trip.getDistance() <= 0) {
                System.out.println("You at the " + trip.getFinalDestination() + "!!!");
                this.timer.cancel();
            }
        }
    }
}

