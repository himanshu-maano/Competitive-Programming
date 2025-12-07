import java.util.*;

public class B_Numbers_Box {

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
        int m = sc.nextInt();
        long[][] a = new long[n][m];
        long sum = 0;
        int cnt = 0, zero = 0;
        long min = (int)1e9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
                if(a[i][j] < 0) {
                    cnt++;
                } else if(a[i][j] == 0) {
                    zero++;
                }
                if(Math.abs(a[i][j]) < min) {
                    min = Math.abs(a[i][j]);
                }
                sum += (a[i][j] < 0) ? -a[i][j] : a[i][j]; 
            }
        }

        if((cnt & 1) == 0 || zero > 0) {
            System.out.println(sum);
        } else {
            System.out.println(sum - (2 * min));
        }

    }
}