import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomListGenerator {
    /**
     * Generates a list of random integers.
     *
     * @param size The number of integers to generate in the list.
     * @return A list containing random integers between 0 and 99.
     * @throws IllegalArgumentException if the size is negative.
     */
    public static List<Integer> generateRandomList(int size) {
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(100);
            randomList.add(randomNumber);
        }
        return randomList;
    }
}
