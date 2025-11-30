import java.util.*;
public class A_In_the_Dream {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int m1 = Math.min(a, b);
        int m2 = Math.max(a , b);
        if(m2 > 2*(m1+1)) {
            System.out.println("NO");
            return;
        }

        m1 = Math.min(c - a, d - b);
        m2 = Math.max(c - a , d - b);

        if(m2 > 2 * (m1 + 1)) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");

    }
}