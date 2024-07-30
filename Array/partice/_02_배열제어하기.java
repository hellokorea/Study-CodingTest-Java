package Array.partice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class _02_배열제어하기 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        /*
         * ArrayList를 순회하면서 add 할 때 값을 체크해서 있으면 add x
         * 다 담으면, compare를 통해 DESC 정렬
         */

        int[] r = sol(arr);
        System.out.println(Arrays.toString(r));

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int el = arr[i];
            if (!list.contains(el)) {
                list.add(el);
            }
        }

        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);

    }

    public static int[] sol(int[] array) {

        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int num : array) {
            set.add(num);
        }

        int[] result = new int[set.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = set.pollFirst();
        }

        return result;
    }
}
// 4 2 2 1 3 4
// 4 3 2 1
