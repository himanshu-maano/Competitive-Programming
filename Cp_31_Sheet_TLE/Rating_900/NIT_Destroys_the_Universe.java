import java.util.*;

public class NIT_Destroys_the_Universe {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            int n = reader.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = reader.nextInt();
            }

            if (isZero(nums)) {
                System.out.println(0);
                continue;
            }

            int l = 0, r = n - 1;
            while (nums[l] == 0) {
                l++;
            }
            while (nums[r] == 0) {
                r--;
            }

            boolean zero = false;
            for (int i = l; i <= r; i++) {
                if (nums[i] == 0) {
                    zero = true;
                    break;
                }
            }

            if (!zero) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
        reader.close();
    }

    private static boolean isZero(int[] nums) {
        for (int x : nums) {
            if (x != 0) {
                return false;
            }
        }
        return true;
    }
}
