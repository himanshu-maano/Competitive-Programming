// package Rating_900;

import java.util.*;

public class ArrayCloningTechnique {
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
                System.out.println(0);
                return;
            }
            if(n == 2) {
                if(nums[0] != nums[1]) {
                    System.out.println(2);
                } else {
                    System.out.println(0);
                }
                return;
            }
            Map<Integer, Integer> map = new HashMap<>();
            int maxfreq = 0;
            for(int x : nums) {
                map.put(x, map.getOrDefault(x, 0) + 1);
                maxfreq = Math.max(maxfreq, map.get(x));
            }

            int op = n - maxfreq;

            while(maxfreq < n) {
                op++;
                maxfreq *= 2;
            }

            System.out.println(op);
        }
}
