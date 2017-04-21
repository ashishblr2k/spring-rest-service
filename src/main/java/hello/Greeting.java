package hello;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by agup101 on 4/19/2017.
 */
@Data
@AllArgsConstructor
public class Greeting {
    private final long id;
    private final String content;
}
