import java.util.*;

public class Solution2 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int test = reader.nextInt();
        while (test-- > 0) {
            solve();
        }
        reader.close();
    }

    private static void solve() {
        int n = reader.nextInt();
        int m = reader.nextInt();
        int a = reader.nextInt();
        int b = reader.nextInt();

        int remainRow = Math.min(a, n - a + 1);
        int remainCol = Math.min(b, m - b + 1);

        if(remainCol == remainRow) {
            if((remainRow & 1) == 0) {
                System.out.println(1 + remainRow);
            } else {
                System.out.println(2 + remainCol);
            }
        }

    }
}
