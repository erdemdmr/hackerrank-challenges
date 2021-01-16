public class Solution {

    public static void main(String[] args) {
        int[] c = new int[]{0, 0, 0, 1, 0, 0};
        int count = 0;
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == 0) i++;
            count++;
        }

        System.out.println(count);
    }


}
