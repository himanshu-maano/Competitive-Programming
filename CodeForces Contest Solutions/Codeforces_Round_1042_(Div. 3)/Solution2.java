import java.util.*;

public class Solution2 {
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

        if (n == 2) {
            System.out.println(-1 + " " + 2);
            return;
        }

        if ((n & 1) == 1) {
            for (int i = 0; i < n; i++) {
                if ((i & 1) == 0) {
                    System.out.print(-1 + " ");
                } else {
                    System.out.print(3 + " ");
                }
            }
        } else {
            for(int i=0; i<n-1; i++) {
                if((i & 1) == 0) {
                    System.out.print(-1 + " ");
                } else {
                    System.out.print(3 + " ");
                }
            }
            System.out.println(2);
        }

        System.out.println();

    }
}
