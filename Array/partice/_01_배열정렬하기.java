package Array.partice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _01_배열정렬하기 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = 5;
        int[] arr = new int[T];
        Integer[] arr2 = new Integer[T];

        for (int i = 0; i < T; i++) {
            int el = Integer.parseInt(br.readLine());
            arr[i] = el;
            arr2[i] = el;
        }

        Arrays.sort((arr));
        Arrays.sort(arr2, (a, b) -> Integer.compare(a, b));

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
}
