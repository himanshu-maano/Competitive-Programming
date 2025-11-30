import java.util.*;

public class C_Against_the_Difference {
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
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] num = new int[n + 1];
        int len = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                num[1]++;
                continue;
            }
            if (i < n-1 && a[i] == a[i + 1]) {
                len++;
            } else if(i < n-1) {
                if (len % a[i] == 0) {
                    int div = len / a[i];
                    num[a[i]] += div;
                }
                len = 1;
            }
        }

        if (len > 1) {
            if (len % a[n-1] == 0) {
                int div = len / a[n-1];
                num[a[n-1]] += div;
            }
        }

        long total = 0;
        for(int i=1; i<n; i++) {
            if(num[i] > 0)
            total += (num[i] * i);
        }

        System.out.println(total);

    }
}