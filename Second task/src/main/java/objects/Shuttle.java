package objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Shuttle {
    private List<Astronaut> astronauts = null;
    private int capaciousness;
    private String name;

    public String getParameters() {
        return "Shuttle parameters: " +
                " capaciousness=" + this.capaciousness +
                ", name='" + name + '\'';
    }
}

