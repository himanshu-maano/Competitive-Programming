import java.util.*;
public class B_Multiple_Construction {

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
        long[] a = new long[2*n];

        int x = n;
        
        for(int i=0; i<n; i++) {
            a[i] = x;
            x--;
        }
        a[n] = n;

        for(int i=n+1, j=1; i<2*n; i++, j++) {
            a[i] = j;
        }

        for(long ele : a) {
            System.out.print(ele + " ");
        }

        System.out.println();
    
        
    }
}