import java.util.*;

public class C_Minimize_the_Thickness {

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

        int min = (int)1e9 + 7;
        long target = 0;
        for (int i = 0; i < n; i++) {
            target += a[i];
            int l = i + 1, len = i+1, ld = i;
            long sum = 0;
            while(l < n) {
                sum += a[l];
                if(sum == target) {
                    len = Math.max(len, l - ld);
                    ld = l;
                    sum = 0; 
                } else if(sum > target) {
                    break;
                } 
                l++;
            }

            if(sum == 0) {
                min = Math.min(min, len);
            }
        }

        System.out.println(min);
    }
}