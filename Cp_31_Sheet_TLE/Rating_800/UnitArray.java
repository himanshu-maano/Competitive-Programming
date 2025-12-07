package Rating_800;

import java.util.Scanner;

public class UnitArray {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            int size = reader.nextInt();
            int[] a = new int[size];
            for (int i = 0; i < a.length; i++) {
                a[i] = reader.nextInt();
            }

            int pos = 0;
            int neg = 0;
            for (int i : a) {
                if(i < 0) {
                    neg++;
                } else {
                    pos++;
                }
            }

            int op = 0;

            while(pos < neg || ((neg & 1) == 1)) {
                op++;
                pos++;
                neg--;
            }

            System.out.println(op);
        }
        reader.close();
    }
}
