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
            int[] nums = new int[n];
            int totalWinner = 0;
            for (int i = 0; i < n; i++) {
                nums[i] = reader.nextInt();
                totalWinner += nums[i];
            }

            for (int i = 0; i < nums.length-1; i++) {
                if(nums[i] == 0 && nums[i+1] == 0) {
                    System.out.println("YES");
                    return;
                } 
            }

            if(totalWinner > n-1 || totalWinner == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            
        }
}
