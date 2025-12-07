package Rating_800;

import java.util.*;

public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int size = reader.nextInt();
        int[] nums = new int[size];
        for(int i=0; i<size; i++) {
            nums[i] = reader.nextInt();
        }

        Arrays.sort(nums);

        int op = Math.abs(nums[0] - 0);
        for (int i = 1; i < nums.length; i++) {
            op = Math.min(op, Math.abs(nums[i] - 0));
        }

        System.out.println(op);

        reader.close();
    }
}
