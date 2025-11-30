import java.util.*;
public class Solution3 {
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
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int[] b = new int[n];
            for (int i = 0; i < b.length; i++) {
                b[i] = sc.nextInt(); 
            }

            Map<Integer, Integer> map = new HashMap<>();

            for(int i=0; i<n; i++) {
                int rem = a[i] % k;
                int op = Math.min(rem, k - rem);
                map.put(op, map.getOrDefault(op, 0) + 1);
            }

            for(int i=0; i<n; i++) {
                int rem = b[i] % k;
                int op = Math.min(rem, k - rem);
                map.put(op, map.getOrDefault(op, 0) - 1);
            }
            
            boolean flag = true;
            for(int x : map.values()) {
                if(x != 0) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            
        }
}
