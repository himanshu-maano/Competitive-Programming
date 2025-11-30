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
            long x = reader.nextLong();
            
            int k = bitLength(x);

            System.out.println(2 * k + 1);
            
        }
        
        private static int bitLength(long x) {
            return (x == 0) ? 1 : 64 - Long.numberOfLeadingZeros(x);
        }
}
