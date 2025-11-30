import java.util.*;

public class B_Discounts {
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
        long[] a = new long[n];
        long cost = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            cost += a[i];
        }

        long[] b = new long[k];
        for (int i = 0; i < k; i++) {
            b[i] = sc.nextLong();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int j = n;
        for(int i=0; i<k; i++) {
            j -= b[i];
            if(j >= 0) {
                // System.out.print(cost + " ");
                cost -= a[j];
                // System.out.print(cost + " ");
            } else {
                break;
            }
        }

        System.out.println(cost);

    }
}