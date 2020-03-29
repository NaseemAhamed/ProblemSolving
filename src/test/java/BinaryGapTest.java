import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BinaryGapTest {

    @Test
    public void testfindLongestBinaryGap()
    {
        assertEquals(0,BinaryGap.findLongestBinaryGap(15));
        assertEquals(2,BinaryGap.findLongestBinaryGap(36));
        assertEquals(0,BinaryGap.findLongestBinaryGap(32));
    }

}
