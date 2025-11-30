import java.util.*;
public class A_Collatz_Conjecture {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        int k = sc.nextInt();
        int x = sc.nextInt();

        long ans = (x << k);
        System.out.println(ans);
        
    }
}