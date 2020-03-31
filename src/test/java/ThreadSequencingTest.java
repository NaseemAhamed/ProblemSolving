import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreadSequencingTest {

    @Test
    public void testDriverFunction() {
        try {
            ThreadSequencing threadSequencing = new ThreadSequencing();
            assertEquals(asList("T1", "T2", "T3"), threadSequencing.driverFunction());
        } catch (Exception e) {
        }
    }
}
