import java.util.*;

public class SolutionE {
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
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        if (a[n - 1] != b[n - 1]) {
            System.out.println("NO");
            return;
        }

        boolean flag = true;
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] == b[i] || (a[i] ^ a[i + 1]) == b[i] || (a[i] ^ b[i + 1]) == b[i]) {
                continue;
            } else {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }   
}

