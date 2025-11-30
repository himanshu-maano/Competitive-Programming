import java.util.*;

public class Solution1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int totalStep = nums[n - 1] - nums[0];

        totalStep += Math.min(Math.abs(s - nums[0]), Math.abs(nums[n - 1] - s));

        System.out.println(totalStep);

    }
}
