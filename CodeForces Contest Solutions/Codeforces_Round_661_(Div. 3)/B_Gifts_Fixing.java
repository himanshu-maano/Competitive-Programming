 import java.util.*; 
 public class B_Gifts_Fixing {
 
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
        long min1 = (long)1e9 + 7, min2 = (long)1e9 + 7;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if(a[i] < min1) {
                min1 = a[i];
            }
        }
    
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
            if(b[i] < min2) {
                min2 = b[i];
            }
        }

        long ans = 0;
        for(int i=0; i<n; i++) {
            long w1 = 0, w2 = 0;
            if(a[i] > min1) {
                w1 = a[i] - min1;
            }
            if(b[i] > min2) {
                w2 = b[i] - min2;
            }

            ans += Math.max(w1, w2);
        }

        System.out.println(ans);        
    }
 }