import java.util.*;
public class A_Reverse_a_Substring {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        int test = 1;
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }
    
    private static void solve() {
        int n = sc.nextInt();
        String s = sc.next();


        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) < s.charAt(i - 1)) {
                System.out.println("YES");
                System.out.println((i) + " " + (i + 1));
                return;
            }
        }

        System.out.println("NO");
    }
}