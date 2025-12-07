 import java.util.*;
 public class B_Deja_Vu {
 
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
        int q = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long[] b = new long[q];
        for(int i=0; i<q; i++) {
            b[i] = sc.nextLong();
        }

        long min = (long)1e9;

        for(int i=0; i<q; i++) {
            if(b[i] < min) {
                min = b[i];
                for(int j=0; j<n; j++) {
                    if(a[j] % (1L << b[i]) == 0) {
                        a[j] += (1 << (b[i] - 1));
                    }
                }
            }
        }

        for(long x : a) {
            System.out.print(x + " ");
        }
    
        System.out.println();
        
    }
 }