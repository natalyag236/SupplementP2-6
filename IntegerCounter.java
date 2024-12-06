import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class IntegerCounter {

    public static Map<Integer, Integer> countOccurrences(List<Integer> numbers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (Integer number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        return frequencyMap;
    }
}

