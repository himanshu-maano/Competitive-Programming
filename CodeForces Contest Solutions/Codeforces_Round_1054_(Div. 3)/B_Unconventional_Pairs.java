import java.util.*;
public class B_Unconventional_Pairs {

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
    
        Arrays.sort(a);

        long ans = 0;
        for(int i=0; i<n-1; i+=2) {
            ans = Math.max(a[i+1] - a[i], ans);
        }

        System.out.println(ans);
    }
}