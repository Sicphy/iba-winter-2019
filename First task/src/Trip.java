public class Trip {
    private String  finalDestination;
    private Integer distance;

    public String getFinalDestination() {
        return finalDestination;
    }

    public void setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "finalDestination='" + finalDestination + '\'' +
                ", distance=" + distance +
                '}';
    }
}
