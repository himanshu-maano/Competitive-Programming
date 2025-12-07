import java.util.*;

public class B_Triangles_on_a_Rectangle {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        int w = sc.nextInt();

        int h = sc.nextInt();

        long x_Base = 0;
        for (int i = 1; i <= 2; i++) {
            int low = -1, high = 0;
            int cordinate = sc.nextInt();
            while (cordinate-- > 0) {
                int x = sc.nextInt();
                if (low == -1) {
                    low = x;
                }
                high = x;
            }
            x_Base = Math.max(x_Base, high - low);
        }

        long y_Base = 0;
        for (int i = 1; i <= 2; i++) {
            int low = -1, high = 0;
            int cordinate = sc.nextInt();
            while (cordinate-- > 0) {
                int x = sc.nextInt();
                if (low == -1) {
                    low = x;
                }
                high = x;
            }
            y_Base = Math.max(y_Base, high - low);
        }

        long ans = Math.max(x_Base * h, y_Base * w);

        System.out.println(ans);

    }
}