import java.util.*;

public class B_Arranging_Cats {

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
        String t = sc.next();


        int c1 = 0, c2 = 0;

        for(int i=0; i<n; i++) {
            if(s.charAt(i) != t.charAt(i)) {
                if(s.charAt(i) == '1') {
                    c1++;
                } else {
                    c2++;
                }
            }
        }

        System.out.println(Math.max(c1, c2));
    }
}