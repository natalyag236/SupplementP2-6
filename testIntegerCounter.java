import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.Test;

public class TestIntegerCounter {

    @Test
    public void testCounterIntegers() {
        List<Integer> numbers = Arrays.asList(1, 5, 5, 6, 7, 4, 3, 3);
        Map<Integer, Integer> frequencyMap = IntegerCounter.countOccurrences(numbers);

        assertEquals("Count of 1 should be 1", (Integer) 1, frequencyMap.get(1));
        assertEquals("Count of 5 should be 2", (Integer) 2, frequencyMap.get(5));
        assertEquals("Count of 6 should be 1", (Integer) 1, frequencyMap.get(6));
        assertEquals("Count of 7 should be 1", (Integer) 1, frequencyMap.get(7));
        assertEquals("Count of 4 should be 1", (Integer) 1, frequencyMap.get(4));
        assertEquals("Count of 3 should be 2", (Integer) 2, frequencyMap.get(3));
        
        assertEquals("The map should contain 6 unique keys", 6, frequencyMap.size());
    }
}
