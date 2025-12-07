import java.util.*;
public class B_Bogosort {
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

        for(int i=n-1; i>=0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
