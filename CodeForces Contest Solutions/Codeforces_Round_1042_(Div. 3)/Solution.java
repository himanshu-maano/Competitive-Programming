import java.util.*;

public class Solution {
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

        int cnt = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < n; i++) {
                if(a[i] > b[i]) {
                    a[i]--;
                    flag = true;
                    break;
                }
            }
            cnt++;
            for (int i = 0; i < n; i++) {
                if(a[i] < b[i]) {
                    a[i]++;
                }
            }
        }

        System.out.println(cnt);
    }
}
