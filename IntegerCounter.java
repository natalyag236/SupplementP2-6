import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A utility class for counting occurrences of integers in a list.
 */

public class IntegerCounter {
    /**
     * Counts the occurrences of each integer in a list.
     *
     * @param numbers The list of integers to process.
     * @return A map where each key is an integer, and each value is the number of occurrences.
     */
    public static Map<Integer, Integer> countOccurrences(List<Integer> numbers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (Integer number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        return frequencyMap;
    }
}

