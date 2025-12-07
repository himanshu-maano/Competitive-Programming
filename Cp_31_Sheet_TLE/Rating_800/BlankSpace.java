package Rating_800;

import java.util.*;

public class BlankSpace {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while(test-- > 0) {
            int size = reader.nextInt();
            int[] a = new int[size];
            for (int i = 0; i < a.length; i++) {
                a[i] = reader.nextInt();
            }

            int maxLen = 0;
            int len = 0;
            for(int x : a) {
                if(x == 0) {
                    len++;
                } else{
                    len = 0;
                }
                maxLen = Math.max(maxLen, len);
            }

            System.out.println(maxLen);
        }
        reader.close();
    }
}
