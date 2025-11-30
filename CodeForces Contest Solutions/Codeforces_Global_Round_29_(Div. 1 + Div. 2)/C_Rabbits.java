import java.util.*;

public class C_Rabbits {

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

        boolean border = (s.charAt(0) == '1');
        boolean isPossible = true;

        int cnt = 0;
        for(int i=0; i<n; i++) {
            if(s.charAt(i) == '0') {
                cnt++;
            }
            if(i == 0) continue;

            if(s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == '0') {
                border = false;
            }
            if(s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == '1') {
                if(border && (cnt & 1) == 1) {
                    isPossible = false;
                }
                border = true;
                cnt = 0;
            }
        }

        if(border && (cnt & 1) == 1 && s.charAt(n - 1) == '1') {
            isPossible = false;
        }

        System.out.println(isPossible ? "YES" : "NO");

    }
}