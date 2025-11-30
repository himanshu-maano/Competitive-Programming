import java.util.*;

public class A_Recovering_a_Small_String {

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

        StringBuilder ans = new StringBuilder();
        if (n > 52) {
            n -= 52;
            ans.append((char) ('a' + n % 27 - 1));
            ans.append("zz");   
        } else if (n > 28) {
            n -= 26;
            ans.append("a");
            ans.append((char) ('a' + n - 2));
            ans.append("z");
        } else {
            ans.append("aa");
            ans.append((char) ('a' + n - 3));
        }

        System.out.println(ans);
    }
}