package Rating_800;

import java.util.Scanner;

public class Desorting {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            int size = reader.nextInt();
            int[] nums = new int[size];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = reader.nextInt();
            }

            if (isUnSorted(nums)) {
                System.out.println(0);
            } else {
                int minDiff = Integer.MAX_VALUE;
                for (int i = 0; i < nums.length - 1; i++) {
                    minDiff = Math.min(minDiff, Math.abs(nums[i] - nums[i + 1]));
                }

                int op = (minDiff / 2) + 1;
                System.out.println(op);
            }
        }
        reader.close();
    }

    static boolean isUnSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return true;
            }
        }

        return false;
    }
}
