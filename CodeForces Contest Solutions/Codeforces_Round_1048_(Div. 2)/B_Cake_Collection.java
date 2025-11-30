import java.util.*;
public class B_Cake_Collection {
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
        long m = sc.nextLong();
        Long[] a = new Long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        Arrays.sort(a, Collections.reverseOrder());
        long sum = 0;
        long temp = m;
        for(int i=0; i<Math.min(n, temp); i++) {
            sum += (m * a[i]);
            m--;
        }

        System.out.println(sum);
        
    }
}