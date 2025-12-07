import java.util.*;
public class B_Luke_is_a_Foodie {
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
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        if(n == 1) {
            System.out.println(0);
            return;
        }

        int v = (a[0] + a[1]) / 2;
        int change = 0;
        
        for(int i=1; i<n; i++) {
            if(Math.abs(a[i] - v) > x) {
                change++;
                if(i < n-1) v = (a[i] + a[i+1]) / 2;
            }
        }


        System.out.println(change);
    }
}