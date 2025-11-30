import java.util.*;
public class B_Villagers {
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
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        
        long ans = 0;
        if((n & 1) == 0) {
            for(int i=1; i<n; i+=2) {
                ans += a[i];
            }
        } else {
            for(int i=1; i<n; i+=2) {
                ans += a[i];
            }
            ans += a[n-1]; 
            
            long sum = 0;
            for(int i=n-1; i>=0; i-=2) {
                sum += a[i];
            }

            ans = Math.min(ans, sum);
        }

        System.out.println(ans);
    }
}