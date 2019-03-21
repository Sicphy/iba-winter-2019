public class Trip {
    private String where;
    private Integer distance;

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
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
                "where='" + where + '\'' +
                ", distance=" + distance +
                '}';
    }
}
