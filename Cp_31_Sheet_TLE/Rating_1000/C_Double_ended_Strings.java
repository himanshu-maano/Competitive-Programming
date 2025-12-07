import java.util.*;

public class C_Double_ended_Strings {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        // sc.nextLine();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        String a = sc.next();
        String b = sc.next();

        int len = 0;

        for (int l = 1; l <= Math.min(a.length(), b.length()); l++) {
            for (int i = 0; i + l <= a.length(); i++) {
                for (int j = 0; j + l <= b.length(); j++) {
                    if (a.substring(i, i + l).equals(b.substring(j, j + l))) {
                        len = Math.max(len, l);
                    }
                }
            }
        }

        System.out.println(a.length() + b.length() - 2 * len);

    }
}