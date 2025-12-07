package Rating_800;

import java.util.*;

public class HalloumiBoxes {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        StringBuilder ans = new StringBuilder();
        while (test-- > 0) {
            int size = reader.nextInt();
            int k = reader.nextInt();
            int[] a = new int[size];
            for (int i = 0; i < a.length; i++) {
                a[i] = reader.nextInt();
            }

            if (!sorted(a, 0, size - 1) && k == 1) {
                ans.append("NO");
                ans.append("\n");
                continue;
            }

            ans.append("YES");
            ans.append("\n");

        }
        System.out.println(ans);
        reader.close();
    }

    static boolean sorted(int[] nums, int start, int end) {
        for (int i = start; i < end; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
