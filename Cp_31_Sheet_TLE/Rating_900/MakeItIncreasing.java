package Rating_900;

import java.util.*;

public class MakeItIncreasing {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            int n = reader.nextInt();
            long[] nums = new long[n];
            for (int i = 0; i < n; i++) {
                nums[i] = reader.nextLong();
            }
            long ans = 0;
            for (int i = n - 2; i >= 0; i--) {
                while (nums[i] >= nums[i + 1]) {
                    if (nums[i] == 0) {
                        break;
                    }
                    nums[i] = nums[i] / 2;
                    ans++;
                }
                if (nums[i] == 0 && nums[i + 1] == 0) {
                    ans = -1;
                    break;
                }
            }
            System.out.println(ans);
        }
        reader.close();
    }
}
