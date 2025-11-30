import java.util.*;
public class B_Like_the_Bitset {
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

        String s = sc.next();

        int len = 0;

        for(char ch : s.toCharArray()) {
            if(ch == '1') {
                len++;
            } else {
                len = 0;
            }
            if(len == k) {
                System.out.println("NO");
                return;
            }
        }

        int[] ans = new int[n];

        System.out.println("YES");
        int x = n;
        for(int i=0; i<n; i++) {
            if(s.charAt(i) == '0') {
                ans[i] = x;
                x--;
            }
        }
        x = 1;
        for(int i=0; i<n; i++) {
            if(s.charAt(i) == '1') {
                ans[i] = x;
                x++;
            }
        }
        for(int y : ans) {
            System.out.print(y + " ");
        }
        System.out.println();
    }
}