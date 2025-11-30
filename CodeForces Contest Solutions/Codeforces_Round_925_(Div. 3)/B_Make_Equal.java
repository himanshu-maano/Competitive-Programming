import java.util.*;
public class B_Make_Equal {

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
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            sum += a[i];
        }

        long each = sum / n;
        long extra = 0;
        boolean ok = true;
        for(int i=0; i<n; i++) {
            if(a[i] > each) {
                extra += a[i] - each;
            } else if(a[i] < each) {
                if(extra >= (each - a[i])) {
                    extra -= (each - a[i]);
                } else {
                    ok = false;
                    break;
                }
            }
        }

        System.out.println(ok ? "YES" : "NO");
    
        
    }
}