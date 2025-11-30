 import java.util.*;
 public class B_Catching_the_Krug {
 
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
        long kr = sc.nextLong();
        long kc = sc.nextLong();
        long dr = sc.nextLong();
        long dc = sc.nextLong();

        int r = n, c = n;
        if(kc == dc) {
            if(kr < dr) {
                System.out.println(dr);
            } else {
                System.out.println(r - dr);
            }
            return;
        } else if(kr == dr) {
            if(kc < dc) {
                System.out.println(dc);
            } else {
                System.out.println(c - dc);
            }
            return;
        }

        if(kr < dr) {
            r = 0;
        }
        if(kc < dc) {
            c = 0;
        }
        
        long ans = Math.max(Math.abs(dr - r), Math.abs(dc - c));
        System.out.println(ans);

    
        
    }
 }