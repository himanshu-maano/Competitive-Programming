package Rating_800;

import java.util.*;

public class TwinPermutations {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while(test-- > 0) {
            int size = reader.nextInt();
            int[] a = new int[size];
            for (int i = 0; i < a.length; i++) {
                a[i] = reader.nextInt();
            }

            if(size == 1) {
                System.out.println(1);
                continue;
            }

            int[] b = new int[size];
            
            for (int i = 0; i < b.length; i++) {
                b[i] = size + 1 - a[i];
            }

            for (int x : b) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        reader.close();
    }
}
