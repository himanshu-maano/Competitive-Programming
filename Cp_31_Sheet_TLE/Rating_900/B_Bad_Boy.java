import java.util.*;

public class B_Bad_Boy {
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
        int m = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();

        System.out.println(1 + " " + 1 + " " + n + " " + m);

    }
}