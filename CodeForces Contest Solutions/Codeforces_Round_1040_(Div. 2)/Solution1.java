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
        int[] nums = new int[n];
        int cnt0 = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            if(nums[i] == 0) {
                cnt0++;
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        System.out.println(sum + cnt0);
        
    }
}
