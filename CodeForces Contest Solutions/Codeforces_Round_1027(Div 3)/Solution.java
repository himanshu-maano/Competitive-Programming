import java.util.*;

public class Solution {
        static Scanner reader = new Scanner(System.in);
        
        public static void main(String[] args) throws Exception {
            int test = reader.nextInt();
            while (test-- > 0) {
                solve();
            }
            reader.close();
        }
    
        private static void solve() {
            String s = reader.next();

            double x = Double.parseDouble(s);

            int sq = (int)Math.sqrt(x);

            if(Math.sqrt(x) == sq) {
                if(x % 2 == 0) {
                    System.out.println(sq/2 + " " + sq/2);
                } else {
                    System.out.println(sq - 1 + " " + 01);
                }
            } else {
                System.out.println(-1);
            }
        }
}
