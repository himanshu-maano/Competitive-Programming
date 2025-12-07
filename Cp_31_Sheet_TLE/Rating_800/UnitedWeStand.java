package Rating_800;

import java.util.*;

public class UnitedWeStand {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            int size = reader.nextInt();
            int[] nums = new int[size];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = reader.nextInt();
            }

            if (isEqual(nums)) {
                System.out.println(-1);
            } else {
                Arrays.sort(nums);
                int max = nums[size - 1];

                ArrayList<Integer> list1 = new ArrayList<>();
                ArrayList<Integer> list2 = new ArrayList<>();
                for (int x : nums) {
                    if (x != max) {
                        list1.add(x);
                    } else {
                        list2.add(x);
                    }
                }

                System.out.println(list1.size() + " " + list2.size());
                printArray(list1);
                printArray(list2);
            }
        }
        reader.close();
    }

    static boolean isEqual(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[0]) {
                return false;
            }
        }

        return true;
    }

    static void printArray(List<Integer> list) {
        for(int x : list) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}