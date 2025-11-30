import java.util.*;

public class Solution2 {
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
        int m = reader.nextInt();

        StringBuilder ans = new StringBuilder();

        while (m-- > 0) {
            int[] nums = new int[3];
            for (int i = 0; i < 3; i++) {
                int x = reader.nextInt();
                nums[i] = x;
            }

            Arrays.sort(nums);

            if (nums[0] >= fibbo(n) && nums[2] >= fibbo(n + 1)) {
                ans.append("1");
            } else {
                ans.append("0");
            }
        }

        System.out.println(ans.toString());

    }

    private static int fibbo(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        return fibbo(n - 1) + fibbo(n - 2);
    }
}
