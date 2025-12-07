import java.util.*;
public class C_Raspberries {
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
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        if(k == 4) {
            int cnt = 0;
            int op = Integer.MAX_VALUE;
            for(int x : a) {
                if(x == k || (x % k == 0)) {
                    System.out.println(0);
                    return;
                }
                op = Math.min((k - (x % k)), op);
                if((x & 1) == 0) {
                    cnt++;
                }
            }

            if(cnt >= 2) {
                System.out.println(0);
            } else if(cnt == 1) {
                System.out.println(1);
            } else {
                System.out.println(Math.min(op, 2));
            }
            return;
        }

        int op = Integer.MAX_VALUE;
        for(int x : a) {
            if(x == k || (x % k == 0)) {
                op = 0;
                break;
            }
            op = Math.min((k - (x % k)), op);
        }

        System.out.println(op == k ? 0 : op);
        
    }
}