package objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Astronaut {
    private String name;
    private String post;
    private int age;
}

