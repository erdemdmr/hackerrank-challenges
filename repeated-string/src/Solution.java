public class Solution {
    public static void main(String[] args) {
        String s = "aba";
        long n = 1000000000000L;
        if (s.replaceAll("a", "").length() == 0)
            System.out.println(n);
        else {
            long count = n / s.length();
            int remaining = (int) (n - count * s.length());

            int numberOfA = getNumberOfA(s);

            System.out.println(numberOfA * count + getNumberOfA(s.substring(0, remaining)));
        }

    }

    private static int getNumberOfA(String s) {
        String exceptStr = s.replaceAll("a", "");
        return s.length() - exceptStr.length();
    }
}
