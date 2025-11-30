import java.util.*;

public class Rock_and_Lever {
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
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // 0 & 0 -> 0  ==   0 <- 0 ^ 0
        // 0 & 1 -> 0   <   1 <- 0 ^ 1
        // 1 & 0 -> 0   <   1 <- 1 ^ 0
        // 1 & 1 -> 1   >   0 <- 1 ^ 1

        //     A : 1101000110
        //     B : 1100110010
        // A & B : 1100000010
        // A ^ B : 0001110100

        // (A & B) >= (A ^ B) if and only if A's and B's highest bits is same

        int[] freq = new int[32];
        for (int i = 0; i < n; i++) {
            // count leading zeros of binary form...
            int bit = Integer.numberOfLeadingZeros(nums[i]);
            freq[bit]++;
        }

        long ans = 0;
        for (int bit = 0; bit < 32; bit++) {
            // for i < j : pair -> k * (k - 1) / 2
            ans += (long) freq[bit] * (freq[bit] - 1) / 2;
        }

        System.out.println(ans);
    }
}
