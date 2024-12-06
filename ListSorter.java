import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorter {
    public static List<Integer> sortAscending(List<Integer> numbers) {
        List<Integer> sortedList = new ArrayList<>(numbers);

        Collections.sort(sortedList);

        return sortedList;
        
    }
}
