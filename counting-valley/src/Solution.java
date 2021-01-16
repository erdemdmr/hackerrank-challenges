import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        String path = "DDUUDDUDUUUD";
        List<Integer> stepList = Arrays.stream(path.split(""))
                .map(item -> {
                    switch (item) {
                        case "U":
                            return 1;
                        case "D":
                            return -1;
                        default:
                            return 0;
                    }
                })
                .collect(Collectors.toList());
        int floor = 0;
        int valley = 0;
        for (Integer step : stepList) {
            boolean up = floor > 0;
            floor = floor + step;
            if (!up && floor == 0) {
                ++valley;
            }
        }
        System.out.println(valley);
    }
}
