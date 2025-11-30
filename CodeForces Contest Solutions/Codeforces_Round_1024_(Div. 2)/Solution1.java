import java.util.*;

public class Solution1 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int test = reader.nextInt();
        while (test-- > 0) {
            solve();
        }
        reader.close();
    }

    private static void solve() {
        int n = reader.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = reader.nextInt();
        }

        long idx = (n / 2) + 1;

        int val = Math.abs(nums[0]);

        int smallerElement = 0;

        for (int x : nums) {
            if (Math.abs(x) <= val) {
                smallerElement++;
            }
        }

        if (smallerElement <= idx) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
