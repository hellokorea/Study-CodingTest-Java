package Array;

import java.util.ArrayList;
import java.util.List;

public class _01_array {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(11);

        System.out.println(list);

        // (list Type) 선언과 동시에 초기화 가능
        List<Integer> list2 = new ArrayList<>(list);

        System.out.println(list2);

        int getEl = list.get(1);

        System.out.println(getEl);

        int size = list.size();

        System.out.println(size);

        // 삭제 된 원소 값 return
        int r = list.remove(0);

        System.out.println(r);
        System.out.println(list);
    }
}