package Rating_900;

import java.util.Scanner;

public class VasilijeinCacak {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            long n = reader.nextLong();
            long k = reader.nextLong();
            long x = reader.nextLong();

            long minSum = (k * (k + 1) / 2);  //Sum of n Number formula --> n(n + 1)/2
            long maxSum = (k * n - (k * (k - 1)) / 2);  // maxSum formula of k length(1 to n) --> k*n - k(k-1)/2;

            if(minSum <= x && x <= maxSum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        reader.close();
    }
}
