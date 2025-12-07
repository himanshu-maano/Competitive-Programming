package Rating_800;

import java.util.*;

public class SequenceGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while(test-- > 0) {
            int size = reader.nextInt();
            int[] nums = new int[size];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = reader.nextInt();
            }

            ArrayList<Integer> list = new ArrayList<>();
            list.add(nums[0]);

            for (int i = 1; i < nums.length; i++) {
                if(nums[i] < nums[i-1]) {
                    list.add(nums[i]);
                }
                list.add(nums[i]);
            }

            System.out.println(list.size());
            printArray(list);
        }
        reader.close();
    }

    static void printArray(List<Integer> list) {
        for(int x : list) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
