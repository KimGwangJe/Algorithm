import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] temp = list.toArray(new String[list.size()]);

        List<Integer> list2 = new ArrayList<>();
        int[] temp2 = list2.stream().mapToInt(i -> i).toArray();
        Arrays.sort(temp2);
        Collections.sort(list2);
    }
}