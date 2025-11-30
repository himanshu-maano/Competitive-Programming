 import java.util.*;
public class A_Remove_Smallest {

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
        boolean ok = true;
        for(int i=0; i<n-1; i++) {
            if(a[i+1] - a[i] > 1) {
                ok = false;
                break;
            }
        }

        System.out.println(ok ? "YES" : "NO");
    }
}