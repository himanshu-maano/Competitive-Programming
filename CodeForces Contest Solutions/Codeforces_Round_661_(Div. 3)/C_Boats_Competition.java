 import java.util.*;
 public class C_Boats_Competition {
 
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
        
        long max = 0;
        for(int i=2; i<=2*n; i++) {
            long cnt = 0;
            int l=0, r=n-1;
            while(l < r) {
                if(a[l] + a[r] == i) {
                    cnt++;
                    l++;
                    r--;
                } else if(a[l] + a[r] > i) {
                    r--;
                } else {
                    l++;
                }
            }
            max = Math.max(max, cnt);
        }

        System.out.println(max);
    }
 }