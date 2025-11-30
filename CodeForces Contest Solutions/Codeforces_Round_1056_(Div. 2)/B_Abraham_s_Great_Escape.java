import java.util.*;

public class B_Abraham_s_Great_Escape {

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

        int total = n * n;

        int diff = total - k;

        if (diff == 1) {
            System.out.println("NO");
            return;
        }

        char[][] ans = new char[n][n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cnt < k) {
                    ans[i][j] = 'U';
                    cnt++;
                } else {
                    if(i != n-1 && j == n-1) {
                        ans[i][j] = 'D';
                    }
                    else if(j == n-1) {
                        ans[i][j] = 'L';
                    } else {
                        ans[i][j] = 'R';
                    }
                }
            }
        }

        System.out.println("YES");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }

    }
}