import java.util.*;
public class A_Helmets_in_Night_Light {
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
        long p = sc.nextInt();
        Long[][] a = new Long[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextLong();
        }

        for (int i = 0; i < n; i++) {
            a[i][1] = sc.nextLong();
        }

        Arrays.sort(a, (x, y) -> Long.compare(x[1], y[1]));

        long cost = p;

        if(n == 1) {
            System.out.println(p);
            return;
        }

        long total = n - 1;
        for(int i=0; i<n && a[i][1] < p; i++) {
            if(total >= a[i][0]) {
                cost += (a[i][0] * a[i][1]);
                total -= a[i][0];
            } else {
                cost += (total * a[i][1]);
                total = 0;
                break;
            }
        }

        cost += (total * p);

        System.out.println(cost);
        
    }
}