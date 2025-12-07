import java.util.*;

public class M_Minimum_LCM {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        long n = sc.nextLong();

        if ((n & 1) == 0) {
            System.out.println(n / 2 + " " + n / 2);
            return;
        }

        /* if n is factor then n/i is also factor 
         * like n = 21, if i=3 is factor as (3 * 7) then n/i -> 21/3 -> 7 is also factor as 7 * 3.
         * so if i is smallest as factor then n/i will be largest as factor of n.
         */
        
        long a = 1, b = n - 1;
        for (int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                a = n/i;
                break;       
            }
        }
        b = n-a;
        System.out.println(a + " " + b);

    }
}