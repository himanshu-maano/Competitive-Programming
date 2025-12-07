import java.util.*;

public class DeletiveEditing {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int test = reader.nextInt();
        reader.nextLine();
        while (test-- > 0) {
            solve();
        }
        reader.close();
    }

    private static void solve() {
        String s = reader.next();
        String t = reader.next();

        int n = s.length() - 1;
        int m = t.length() - 1;

        if (m > n) {
            System.out.println("NO");
            return;
        }

        StringBuilder sb = new StringBuilder(t);

        for (int i = n, j = m; i >= 0 && j >= 0; i--) {
            if (s.charAt(i) == sb.charAt(j)) {
                sb.deleteCharAt(j);
                j--;
            } else if (s.indexOf(sb.charAt(j)) == -1) {
                System.out.println("NO");
                return;
            } else {
                if (sb.toString().indexOf(s.charAt(i)) != -1) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        if (sb.length() == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
