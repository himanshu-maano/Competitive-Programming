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
            String s = sc.next();

            int[] freq = new int[26];
            
            for(char ch : s.toCharArray()) {
                freq[ch - 'a']++;
            }

            for(int i=1; i<n-1; i++) {
                char ch = s.charAt(i);
                if(freq[ch - 'a'] > 1) {
                    System.out.println("YES");
                    return;
                }
            }

            System.out.println("NO");

        }
}
