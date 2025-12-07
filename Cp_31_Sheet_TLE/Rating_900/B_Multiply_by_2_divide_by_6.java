import java.util.*;

public class B_Multiply_by_2_divide_by_6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        long n = sc.nextLong();
        if (n == 1 || n == 3) {
            System.out.println(n - 1);
        } else if ((n * 2) % 6 != 0 || n == 2) {
            System.out.println(-1);
        } else {
            long op = 0;
            while (n > 1) {
                if (n % 6 == 0) {
                    n /= 6;
                } else {
                    n *= 2;
                }
                op++;
            }

            System.out.println(n == 1 ? op : -1);
        }

    }
}