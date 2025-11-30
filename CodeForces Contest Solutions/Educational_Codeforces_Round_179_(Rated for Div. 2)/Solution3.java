import java.util.*;

public class Solution3 {
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
            long[] nums = new long[n];
            for (int i = 0; i < n; i++) {
                nums[i] = reader.nextLong();
            }
            
            long ans = Long.MAX_VALUE;

            for(int i=0; i<n;) {
                int j = i;
                while(j + 1 < n && nums[j+1] == nums[i]) {
                    j++;
                }

                long cost = nums[i] * ( (long)i + (long)(n - 1 - j) );

                ans = Math.min(cost, ans);

                i = j+1;
            }

            System.out.println(ans);
        }
}
