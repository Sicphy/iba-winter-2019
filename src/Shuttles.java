import java.util.List;

public class Shuttles {
  private List<Shuttle> shuttleList;

    public List<Shuttle> getShuttleList() {
        return shuttleList;
    }

    public void setShuttleList(List<Shuttle> shuttleList) {
        this.shuttleList = shuttleList;
    }

    @Override
    public String toString() {
        return "Shuttles{" +
                "shuttleList=" + shuttleList +
                '}';
    }
}
