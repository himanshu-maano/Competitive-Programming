import java.util.*;
public class A_Exciting_Bets {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        long a = sc.nextLong();
        long b = sc.nextLong();

        if(a == b) {
            System.out.println(0 + " " + 0);
            return;
        }
        
        if(a > b) {
            long temp = a;
            a = b;
            b = temp;
        }

        long range = b - a;
        long step = Math.min(b % range, range - (b % range));
        System.out.println(range + " " + step);
    }
}
