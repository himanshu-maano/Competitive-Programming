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
            int s = sc.nextInt();
            int[] nums = new int[n];           
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int sum = 0;
            int cnt1 = 0, cnt2 = 0, cnt0 = 0;
            for(int x : nums) {
                sum += x;
                if(x == 2) cnt2++;
                if(x == 1) cnt1++;
                if(x == 0) cnt0++;
            }

            if(s - sum < 0 || s - sum == 1) {
                while(cnt0-- > 0) {
                    System.out.print(0 + " ");
                }
                while(cnt2-- > 0) {
                    System.out.print(2 + " ");
                }
                while(cnt1-- > 0) {
                    System.out.print(1 + " ");
                }
                
                System.out.println();
            } else {
                System.out.println(-1);
            }

        }
}
