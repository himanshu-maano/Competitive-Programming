package Rating_800;

import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        StringBuilder ans = new StringBuilder();
        while (test-- > 0) {
            int size = reader.nextInt();
            int x = reader.nextInt();
            int[] a = new int[size];
            for (int i = 0; i < a.length; i++) {
                a[i] = reader.nextInt();
            }

            int maxGas = 2 * (x - a[size-1]);
            maxGas = Math.max(maxGas, a[0] - 0);

            for (int i = 0; i < a.length - 1; i++) {
                maxGas = Math.max(maxGas, a[i+1] - a[i]);
            }

            ans.append(maxGas);
            ans.append("\n");
        }
        System.out.println(ans);
        reader.close();
    }
}
