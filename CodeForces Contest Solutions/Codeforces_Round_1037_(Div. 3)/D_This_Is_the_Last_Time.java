import java.util.*;
public class D_This_Is_the_Last_Time {

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
        long[][] a = new long[n][3];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextLong();
            a[i][1] = sc.nextLong();
            a[i][2] = sc.nextLong();
        }

        Arrays.sort(a, (x , y) -> Long.compare(x[0], y[0]));

        long coin = k;

        for(long[] casino : a) {
            if(casino[0] <= coin && coin <= casino[1]) { 
                coin = Math.max(coin, casino[2]);
            } else if(casino[0] > coin) {
                break;
            }
        }

        System.out.println(coin);
    
        
    }
}