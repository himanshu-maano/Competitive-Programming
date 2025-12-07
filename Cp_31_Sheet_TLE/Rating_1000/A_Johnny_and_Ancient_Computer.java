import java.util.*;
public class A_Johnny_and_Ancient_Computer {

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
            System.out.println(0);
            return;
        }

        int cnt1 = 0, cnt2 = 0;
        
        for(int i=0; i<64; i++) {
            if((a >> i & 1) == 1) {
                break;
            }
            cnt1++;
        }

        for(int i=0; i<64; i++) {
            if((b >> i & 1) == 1) {
                break;
            }
            cnt2++;
        }

        if((a >> cnt1) != (b >> cnt2)) {
            System.out.println(-1);
            return;
        }

        if(cnt2 > cnt1) {
            int temp = cnt1;
            cnt1 = cnt2;
            cnt2 = temp;
        }

        cnt1 = cnt1 - cnt2;

        System.out.println((cnt1 + 2) / 3);
        
    }
}