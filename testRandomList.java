import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;


public class testRandomList {

    @Test
    public void RandomListTest() {
        int size = 5;
        List<Integer> randomList = RandomListGenerator.generateRandomList(size);
        
        assertNotNull("The list should not be null", randomList);
        
        assertEquals("The size of the list should be " + size, size, randomList.size());
        
        
    }
}