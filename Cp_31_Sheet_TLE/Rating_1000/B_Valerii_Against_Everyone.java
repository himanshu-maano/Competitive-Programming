import java.util.*;
public class B_Valerii_Against_Everyone {

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
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        Arrays.sort(a);

        for(int i=1; i<n; i++) {
            if(a[i] == a[i-1]) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}