package Rating_800;

import java.util.*;

public class DoremyPaint3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        StringBuilder ans = new StringBuilder();
        while (test-- > 0) {
            int n = reader.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = reader.nextInt();
            }

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i : nums) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }

            if (map.size() == 1) {
                ans.append("YES");
                ans.append("\n");
                continue;
            }

            if (map.size() > 2) {
                ans.append("NO");
                ans.append("\n");
            } else {
                int diff = 0;
                for (int x : map.values()) {
                    diff = Math.abs(x - diff);
                }

                if (diff == 1 || diff == 0) {
                    ans.append("YES");
                    ans.append("\n");
                } else {
                    ans.append("NO");
                    ans.append("\n");
                }
            }

        }
        System.out.println(ans);
        reader.close();
    }
}
