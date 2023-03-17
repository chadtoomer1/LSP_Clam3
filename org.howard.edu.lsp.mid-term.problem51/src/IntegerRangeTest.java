import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IntegerRangeTest {


    @Test

    public void testContains() {

        Range range = new IntegerRange(5, 10);

        assertTrue(range.contains(7));

        assertTrue(range.contains(5));

        assertTrue(range.contains(10));

        assertFalse(range.contains(3));

        assertFalse(range.contains(12));

    }



}
