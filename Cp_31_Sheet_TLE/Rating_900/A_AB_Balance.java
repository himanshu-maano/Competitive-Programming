import java.util.*;
public class A_AB_Balance {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        String s = sc.next();

        int n = s.length();
        if(s.charAt(0) == s.charAt(n-1)) {
            System.out.println(s);
        } else {
            System.out.println(s.substring(0, n-1) + s.charAt(0));
        }
    }
}