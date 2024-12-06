import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomListGenerator {
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
