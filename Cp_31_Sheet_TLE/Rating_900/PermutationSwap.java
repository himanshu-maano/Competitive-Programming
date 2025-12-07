import java.util.Scanner;

public class PermutationSwap {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            int n = reader.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = reader.nextInt();
            }

            int ans = permutationSwap(nums);

            System.out.println(ans);
        }
        reader.close();
    }

    private static int permutationSwap(int[] nums) {
        int k = nums[0] - 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == i+1) continue;
            k = gcd(k, Math.abs(nums[i] - (i + 1)));
        }

        return k;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
