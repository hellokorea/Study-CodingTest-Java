package Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class _02_stream {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            set.add(i);
        }

        int[] intArr = set.stream().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(intArr));

        System.out.println(set);
    }
}