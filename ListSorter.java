import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorter {
    /**
     * Sorts a list of integers in ascending order.
     *
     * @param numbers The list of integers to sort.
     * @return A new list sorted in ascending order.
     */
    public static List<Integer> sortAscending(List<Integer> numbers) {
        List<Integer> sortedList = new ArrayList<>(numbers);

        Collections.sort(sortedList);

        return sortedList;
        
    }
}
