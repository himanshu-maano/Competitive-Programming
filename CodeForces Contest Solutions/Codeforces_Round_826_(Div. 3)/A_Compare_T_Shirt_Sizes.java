import java.util.*;

public class A_Compare_T_Shirt_Sizes {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();

        int n = a.length, m = b.length;

        if (a[a.length - 1] == b[b.length - 1]) {
            if (a[n - 1] == 'S') {
                if (n > m) {
                    System.out.println("<");
                } else if (n < m) {
                    System.out.println(">");
                } else {
                    System.out.println("=");
                }
            } else {
                if (n < m) {
                    System.out.println("<");
                } else if (n > m) {
                    System.out.println(">");
                } else {
                    System.out.println("=");
                }
            }
        } else {
            if (a[n - 1] < b[m - 1]) {
                System.out.println(">");
            } else {
                System.out.println("<");
            }
        }
    }
}
