package objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class Astronauts {
    private List<Astronaut> astronautList;
}

