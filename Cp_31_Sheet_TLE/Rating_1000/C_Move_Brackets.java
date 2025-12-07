import java.util.*;
public class C_Move_Brackets {

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
        String s = sc.next();

        int open = 0;
        int close = 0;

        int cnt = 0;

        for(int i=0; i<n; i++) {
            if(s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }
            if(close > open) {
                cnt++;
                close--;
            }
        }

        System.out.println(cnt);
    
        
    }
}