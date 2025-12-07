import java.util.*;

public class MainakandArray {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            int n = reader.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = reader.nextInt();
            }

            int op1 = nums[n - 1] - nums[0];
            for (int i = 1; i < n; i++) {
                op1 = Math.max(nums[i - 1] - nums[i], op1);
            }

            int firstNum = nums[0];
            int lastNum = nums[n - 1];

            Arrays.sort(nums);

            int op2 = nums[n - 1] - firstNum;
            int op3 = lastNum - nums[0];

            System.out.println(Math.max(op1, Math.max(op2, op3)));
        }
        reader.close();
    }

}
