import java.util.*;

public class Solution1 {
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
        int k = reader.nextInt();

        String s = reader.next();

        int oneCnt = 0, zeroCnt = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                oneCnt++;
            } else {
                zeroCnt++;
            }
        }

        if (oneCnt < (n / 2 - k) || zeroCnt < (n / 2 - k)) {
            System.out.println("NO");
            return;
        }

        int goodZeroPair = zeroCnt - (n / 2 - k);
        int goodOnePair = oneCnt - (n / 2 - k);

        int totalValid = goodOnePair / 2 + goodZeroPair / 2;

        if (totalValid == k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
