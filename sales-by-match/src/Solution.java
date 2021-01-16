import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Solution {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20)
                .forEach(item -> Optional.ofNullable(map.get(item))
                        .map(it -> map.put(item, it + 1))
                        .orElseGet(() -> map.put(item, 1)));
        System.out.println(map.values()
                .stream()
                .filter(item -> item > 1)
                .peek(item -> System.out.println(item))
                .map(item -> item / 2)
                .peek(item -> System.out.println(item))
                .reduce(0, Integer::sum));
    }

}
