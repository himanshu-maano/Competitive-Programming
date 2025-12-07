import java.util.*;

public class D_Black_and_White_Stripe {

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
        int k = sc.nextInt();

        String s = sc.next();

        int l = 0, r = 0; 
        int cnt = 0;
        while(r < k) {
            if(s.charAt(r) == 'W') {
                cnt++;
            }
            r++;
        }

        int min = cnt;

        while(r < n) {
            if(s.charAt(l++) == 'W') {
                cnt--;
            }
            if(s.charAt(r++) == 'W') {
                cnt++;
            }

            min = Math.min(min, cnt);
        }

        System.out.println(min);
    
        
    }
}