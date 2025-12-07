package Rating_900;

import java.util.*;

public class OddQueries {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            int n = reader.nextInt();
            int q = reader.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = reader.nextInt();
            }

            int[] prefixArr = new int[n+1];
            int prefix = 0;
            for(int i=0; i<n; i++) {
                prefix += nums[i];
                prefixArr[i+1] = prefix;
            }

            while(q-- > 0) {
                int l = reader.nextInt();
                int r = reader.nextInt();
                int k = reader.nextInt();

                int modifiedSum = prefix - (prefixArr[r] - prefixArr[l-1]) + (r - l + 1) * k;

                if((modifiedSum & 1) == 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        reader.close();
    }
}
