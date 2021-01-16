import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        int arr[] = {7, 1, 3, 2, 4, 5, 6};

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        int swap = 0;
        int cursor = 0;
        while (cursor < list.size() - 1) {
            if (list.get(cursor) < list.get(cursor + 1)) {
                cursor++;
                continue;
            }
            int targetIndex = list.get(cursor) - 1;
            swap(cursor, targetIndex, list);
            swap++;

            cursor = 0;
        }

        System.out.println(swap);
    }

    private static void swap(Integer realIndex, Integer targetIndex, List<Integer> list) {
        Integer real = list.get(realIndex);
        Integer target = list.get(targetIndex);
        list.set(targetIndex, real);
        list.set(realIndex, target);
    }


}
