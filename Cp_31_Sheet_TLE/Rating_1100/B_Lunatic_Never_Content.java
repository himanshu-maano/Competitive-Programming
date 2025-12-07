import java.util.*;
public class B_Lunatic_Never_Content {

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
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        
        int i=0, j=n-1;
        long ans = 0;
        while(i <= j) {
            if(a[i] != a[j]) {
                ans = gcd(ans, Math.abs(a[i] - a[j]));
            }
            i++;
            j--;
        }

        System.out.println(ans);
    }

    private static long gcd(long a, long b) {
        if (a == 0L) {
            return b;
        }
        return gcd(b % a, a);
    }
}