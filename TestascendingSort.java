import static org.junit.Assert.*;
import java.sql.Array;
import java.util.List;
import org.junit.Test;

public class TestascendingSort {
    @Test
    public void testSortListAscending (){
        List<Integer> unsortedList = Array.asList(5, 2, 8, 1, 4);
        List<Integer> expectedSortedList = Array.asList(1, 2, 4, 5, 8);

        List<Integer> sortedList = ListSorter.sortAscending(unsortedList);

        assertEquals("The list should be in ascending order and sorted ", expectedSortedList, sortedList);

        
    }
}
