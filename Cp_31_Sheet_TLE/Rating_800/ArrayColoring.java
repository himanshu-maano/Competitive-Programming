package Rating_800;

import java.util.Scanner;

public class ArrayColoring {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while(test-- > 0) {
            int size = reader.nextInt();
            int[] nums = new int[size];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = reader.nextInt();
            }

            int totalSum = 0;
            for(int x : nums) {
                totalSum += x;
            }

            boolean isPossible = false;
            for (int i = 0; i < nums.length; i++) {
                totalSum -= nums[i];
                if((totalSum & 1) == (nums[i] & 1)) {
                    isPossible = true;
                    break;
                }
                totalSum += nums[i];
            }

            if(isPossible) {
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
        reader.close();
    }
}

/*
 * it can also solved like count odd Number in array if it is oddCount then always No otherwise Yes.
 * because oddCount of odd number always create odd parity....
 */