package Rating_800;

import java.util.*;
public class WeNeedtheZero {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while(test-- > 0) {
            int size = reader.nextInt();
            int[] a = new int[size];
            for (int i = 0; i < a.length; i++) {
                a[i] = reader.nextInt();
            }

            int xor = 0;
            for(int x : a) {
                xor ^= x;
            }

            if((size & 1) == 0) {
                if(xor == 0) {
                    System.out.println(0);
                } else{
                    System.out.println(-1);
                }
            } else {
                System.out.println(xor);
            }
        }
        reader.close();
    }
}
