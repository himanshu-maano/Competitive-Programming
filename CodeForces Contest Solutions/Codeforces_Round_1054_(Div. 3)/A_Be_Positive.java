import java.util.*;
public class A_Be_Positive {
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
    
        int ans = 0, cnt = 0, cnt0 = 0;
        for(long x : a)  {
            if(x == -1) {
                cnt++;
            }

            if(x == 0) {
                cnt0++;
            }
        }

        ans = cnt0;

        if((cnt & 1) == 1) {
            ans += 2;
        }

        System.out.println(ans);
    }
}
