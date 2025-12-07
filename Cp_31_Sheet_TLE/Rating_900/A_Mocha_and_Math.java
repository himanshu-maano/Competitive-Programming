import java.util.*;
public class A_Mocha_and_Math {
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
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int ans = a[0];
        for (int i = 1; i < a.length; i++) {
            ans &= a[i];
        }

        System.out.println(ans);
    }
}