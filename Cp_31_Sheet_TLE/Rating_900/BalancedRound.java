package Rating_900;

import java.util.Arrays;
import java.util.Scanner;

public class BalancedRound {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            int n = reader.nextInt();
            int k = reader.nextInt();

            int[] diffLevel = new int[n];
            for(int i=0; i<n; i++) {
                diffLevel[i] = reader.nextInt();
            }

            Arrays.sort(diffLevel);

            int maxlen = 1;
            int len = 1;
            for(int i=0; i<n-1; i++) {
                if(diffLevel[i+1] - diffLevel[i] <= k) {
                    len++;
                } else {
                    len = 1;
                }
                maxlen = Math.max(len, maxlen);
            }

            System.out.println(n - maxlen);
        }
        reader.close();
    }
}
