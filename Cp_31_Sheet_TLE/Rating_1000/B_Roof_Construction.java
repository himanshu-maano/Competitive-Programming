import java.util.*;

public class B_Roof_Construction {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        int n = sc.nextInt();
        /*
         * Example: n = 13
         * - Largest power of 2 ≤ n is 8 (2^3).
         * - Split numbers into two groups:
         * Group1: [0..7] (4th bit not set)
         * Group2: [8..13] (4th bit set)
         * - Any number x1 from Group2 XOR with x2 from Group1 will always set the 4th
         * bit,
         * so result ≥ 8. Example: (9 ^ 7) = 14.
         * - Also, placing 2^k and (2^k - 1) together is the worst,
         * because (8 ^ 7) = 15 → binary 1111 (4 set bits, very large).
         * - That’s why we avoid this pair by inserting some small number
         * (like 0) in between them. Example order: [1,2,3,4,5,6,7, 0, 8,9,10,11,12,13]
         * now there will be not consecutive pair of element of grp1 and grp2.
         */

        int k = 1;
        while (1 << (k + 1) <= n - 1) { // largest 2^k smaller than n-1.
            k++;
        }

        // (2^k-1 to 0)
        for (int i = (1 << k) - 1; i >= 0; i--) {
            System.out.print(i + " ");
        }

        //(2^k to n-1)
        for(int i = 1 << k; i<n; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

    }
}