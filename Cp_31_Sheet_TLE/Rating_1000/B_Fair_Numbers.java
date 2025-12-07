import java.util.*;
public class B_Fair_Numbers {

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
        
        //super fair num -> lcm(1,2,3....,8,9) is 2520 so every multiple of this num 
        // is always fair so at max we have to chaeck is 2520 times for any num .
        // tc - O(2520 * 18).
        for(int i=0; i<2520; i++) {
            if(isFair(n)) {
                System.out.println(n);
                return;
            }
            n++;
        }
    }

    private static boolean isFair(long x) {
        long t = x;
        while(t != 0) {
            long ld = t % 10;
            if(ld != 0 && x % ld != 0) {
                return false;
            }
            t /= 10;
        }

        return true;
    }
}