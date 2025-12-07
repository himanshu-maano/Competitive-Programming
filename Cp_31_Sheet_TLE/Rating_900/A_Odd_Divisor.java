import java.util.*;
public class A_Odd_Divisor {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        long n = sc.nextLong();

        if((n & 1) == 1) {
            System.out.println("YES");
        } else if((n & n - 1) == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
        
    }
}