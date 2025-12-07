import java.util.*;

public class B_Sum_of_Medians {
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
        int k = sc.nextInt();
        int[] a = new int[n * k];
        for (int i = 0; i < n * k; i++) {
            a[i] = sc.nextInt();
        }

        int m = (n / 2) + 1;
        int idx = (n * k) - m;

        long sum = 0;
        while (k-- > 0) {
            sum += a[idx];
            idx -= m;
        }

        System.out.println(sum);

    }
}
