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
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = reader.nextInt();
            }
            
            if(n == 1) {
                System.out.println(1);
                return;
            }

            int cnt = 1;

            int lastVal = nums[0];
            for (int i = 1; i < n; i++) {
                if(nums[i] - lastVal > 1) {
                    cnt++;
                    lastVal = nums[i];
                }
            }

            int lastVal2 = nums[n-1];
            int cnt2 = 1;
            for (int i = n-2; i >= 0; i--) {
                if(lastVal2 - nums[i] > 1) {
                    cnt2++;
                    lastVal2 = nums[i];
                }
            }

            System.out.println(Math.max(cnt, cnt2));
        }
}

