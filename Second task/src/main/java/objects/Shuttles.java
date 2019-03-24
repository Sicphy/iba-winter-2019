package objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class Shuttles {
    private List<Shuttle> shuttleList;
}

