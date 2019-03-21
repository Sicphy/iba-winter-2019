import java.util.List;

public class Shuttle {
    private List<Astronaut> astronauts;
    private int capaciousness;
    private String name;

    public List<Astronaut> getAstronauts() {
        return astronauts;
    }

    public void setAstronauts(List<Astronaut> astronauts) {
        this.astronauts = astronauts;
    }

    public int getCapaciousness() {
        return capaciousness;
    }

    public void setCapaciousness(int capaciousness) {
        this.capaciousness = capaciousness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParameters() {
        return "Shuttle parameters: " +
                " capaciousness=" + this.capaciousness +
                ", name='" + name + '\'';
    }

    @Override
    public String toString() {
        return "Shuttle{" +
                "astronauts=" + astronauts +
                ", capaciousness=" + capaciousness +
                ", name='" + name + '\'' +
                '}';
    }
}
