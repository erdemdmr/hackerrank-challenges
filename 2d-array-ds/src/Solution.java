public class Solution {
    public static void main(String[] args) {
        int[][] arr = {
                {
                        -1, -1, 0, -9, -2, -2
                },
                {
                        -2, -1, -6, -8, -2, -5
                },
                {
                        -1, -1, -1, -2, -3, -4
                },
                {
                        -1, -9, -2, -4, -4, -5
                },
                {
                        -7, -3, -3, -2, -9, -9
                },
                {
                        -1, -3, -1, -2, -4, -5
                }
        };

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            int r[] = new int[4];
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 4; y++) {
                    for (int z = 0; z < 3; z++) {
                        if (x != 1 || z == 1) {
                            r[y] += arr[i + x][z + y];
                            System.out.print(arr[i + x][z + y] + " ");
                        }
                    }
                    System.out.println("");
                }
                System.out.println("");
            }

            for (int s = 0; s < 4; s++) {
                System.out.println("Sum:" + r[s]);
                if (max < r[s]) {
                    max = r[s];
                    System.out.println("Max:" + max);
                }
            }

            System.out.println("---");
        }

        System.out.println(max);

    }

}
