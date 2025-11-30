package Practice;

import java.util.Arrays;
import java.util.*;

public class MathMethod {
    // MATHS METHODS

    public static long nCr(int n, int r) {
        if (r > n || r < 0)
            return 0;
        long res = 1;
        r = Math.min(r, n - r);
        for (int i = 0; i < r; i++) {
            res = res * (n - i) / (i + 1);
        }
        return res;
    }

    public static long nPr(int n, int r) {
        if (r > n || r < 0)
            return 0;
        long res = 1;
        for (int i = 0; i < r; i++) {
            res *= (n - i);
        }
        return res;
    }

    // Prime Sieve --> to find primeNumber upto N.
    public static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }

    // power of 2
    private static boolean isPower2(int x) {
        return x > 0 && (x & (x - 1)) == 0;
    }

    // Bit length
    private static int bitLength(int x) {
        return (x == 0) ? 1 : 32 - Integer.numberOfLeadingZeros(x);
    }

    // Bit Length
    private static int bitLength(long x) {
        return (x == 0) ? 1 : 64 - Long.numberOfLeadingZeros(x);
    }

    private static int binpow(int a, int b, int m) {
        if (b == 0) {
            return 1 % m;
        }
    
        if ((b & 1) == 0) {
            int t = binpow(a, b / 2, m);
            return (int) (1L * t * t % m);
        } else {
            int t = binpow(a, (b - 1) / 2, m);
            t = (int) (1L * t * t) % m;
            return (int) (1L * a * t % m);
        }
    }

    private static int inverse(int x, int m) {
        return binpow(x, m-2, m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();

        int res1 = (a / b) % m;

        a = a % m;
        int inv_b = inverse(b, m); //b^-1 = (b^m-2) % m;
        int res2 = (int)((1L * a * inv_b) % m);

        System.out.println(res1 + " " + res2);
        sc.close();
    }
}