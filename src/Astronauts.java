import java.util.ArrayList;
import java.util.List;

public class Astronauts {
    private List<Astronaut> astronautList;

    public List<Astronaut> getAstronautList() {
        return astronautList;
    }

    public void setAstronautList(List<Astronaut> astronautList) {
        this.astronautList = astronautList;
    }

    @Override
    public String toString() {
        return "Astronauts{" +
                "astronautList=" + astronautList +
                '}';
    }
}
