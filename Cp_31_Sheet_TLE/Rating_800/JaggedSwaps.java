package Rating_800;

import java.util.Scanner;

public class JaggedSwaps {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        StringBuilder ans = new StringBuilder();
        while (test-- > 0) {
            int n = reader.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = reader.nextInt();
            }

            if(nums[0] == 1) {
                ans.append("YES");
                ans.append("\n");
            } else{
                ans.append("NO");
                ans.append("\n");
            }
        }
        System.out.println(ans);
        reader.close();
    }

}
