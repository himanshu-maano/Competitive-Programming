import java.util.*;
public class B_Expensive_Number {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        char[] s = sc.next().toCharArray();

        long ans = 0, zero = 0;
        boolean haveZero = false, nonZero = false;

        for(int i=s.length-1; i>=0; i--) {
            int ld = s[i] - '0';

            if(ld == 0) haveZero = true;

            if(ld == 0 && !nonZero) {
                zero++;
            } else if(ld != 0) {
                ans++;
                nonZero = true;
            }
        }

        if(haveZero) {
            System.out.println(ans - 1 + zero);
        } else {
            System.out.println(s.length - 1);
        }

    }
}