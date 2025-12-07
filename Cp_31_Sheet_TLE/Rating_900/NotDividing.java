import java.util.Scanner;

public class NotDividing {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            int n = reader.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = reader.nextInt();
            }

            if (nums[0] == 1) {
                nums[0] += 1;
            }

            for (int i = 1; i < n; i++) {
                if (nums[i] == 1) {
                    nums[i] += 1;
                }
                if (nums[i] % nums[i - 1] == 0) {
                    nums[i] += 1;
                }
            }

            printArr(nums);
        }
        reader.close();
    }

    private static void printArr(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
