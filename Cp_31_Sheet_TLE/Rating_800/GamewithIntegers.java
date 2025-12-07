package Rating_800;

import java.util.Scanner;

public class GamewithIntegers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        StringBuilder ans = new StringBuilder();
        while (test-- > 0) {
            int n = reader.nextInt();

            if (((n + 1) % 3 == 0) || (n - 1) % 3 == 0) {
                ans.append("First");
                ans.append("\n");
            } else {
                ans.append("Second");
                ans.append("\n");
            }
        }
        System.out.println(ans);
        reader.close();
    }
}
