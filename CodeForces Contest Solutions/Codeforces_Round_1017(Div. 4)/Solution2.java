import java.util.*;

public class Solution2 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int test = reader.nextInt();

        while (test-- > 0) {
            int n = reader.nextInt();
            int m = reader.nextInt();
            int l = reader.nextInt();
            int r = reader.nextInt();

            int lcnt = 0;
            int rcnt = 0;

            while (rcnt < r && m > 0) {
                rcnt++;
                m--;
                if (lcnt > l && m > 0) {
                    lcnt--;
                    m--;
                }
            }

            while (lcnt > l && m > 0) {
                lcnt--;
                m--;
            }

            System.out.println(lcnt + " " + rcnt);
        }
        reader.close();
    }
}
