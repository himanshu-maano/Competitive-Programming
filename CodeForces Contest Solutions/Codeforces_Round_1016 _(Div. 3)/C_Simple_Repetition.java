import java.util.*;

public class C_Simple_Repetition {
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
        int k = sc.nextInt();

        if (k > 1 && n > 1) {
            System.out.println("NO");
        } else if (n == 1 && k > 1) {
            StringBuilder sb = new StringBuilder();
            while(k-- > 0) {
                sb.append(n);
            }
            n = Integer.parseInt(sb.toString());
            if(isPrime(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            if (isPrime(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

    static boolean isPrime(long x) {
        if (x < 2)
            return false;
        if (x == 2 || x == 3)
            return true;

        if ((x & 1) == 0)
            return false;
        if (x % 3 == 0)
            return false;

        for (long i = 5; i * i <= x; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }
}