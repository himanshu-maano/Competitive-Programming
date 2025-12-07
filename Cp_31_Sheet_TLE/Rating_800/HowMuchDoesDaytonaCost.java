package Rating_800;

import java.util.Scanner;

public class HowMuchDoesDaytonaCost {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        StringBuilder ans = new StringBuilder();
        while (test-- > 0) {
            int size = reader.nextInt();
            int k = reader.nextInt();
            int[] nums = new int[size];
            int[] freq = new int[101];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = reader.nextInt();
                freq[nums[i]]++;
            }

            if(freq[k] > 0) {
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
