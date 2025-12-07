import java.util.*;

public class B_Odd_Grasshopper {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        long x = sc.nextLong();
        long n = sc.nextLong();

        if ((x & 1) == 1) {
            if (n % 4 == 0) {
                System.out.println(x);
            } else if (n % 4 == 3) {
                System.out.println(x - n - 1);
            } else if (n % 4 == 2) {
                System.out.println(x - 1);
            } else if (n % 4 == 1) {
                System.out.println(x + n);
            }
        } else {
            if (n % 4 == 0) {
                System.out.println(x);
            } else if (n % 4 == 3) {
                System.out.println(n + x + 1);
            } else if (n % 4 == 2) {
                System.out.println(x + 1);
            } else if (n % 4 == 1) {
                System.out.println(x - n);
            }
        }
    }
}