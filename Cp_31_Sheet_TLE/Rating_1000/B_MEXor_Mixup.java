import java.util.*;
public class B_MEXor_Mixup {

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

        long xor = prev[(int)a-1];

        long ans = a;
        if(xor != b) {
            if((xor ^ b) == a) {
                ans += 2;
            } else {
                ans += 1;
            }
        }

        System.out.println(ans);
    }

    static long[] prev = new long[300000];
    static {
        for(int i=1; i<300000; i++) {
            prev[i] = prev[i-1] ^ i;
        }
    }
}