import java.util.*;
public class A_Increase_or_Smash {

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
        Set<Long> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            set.add(a[i]);
        }

        int size = set.size();

        System.out.println(2 * size - 1);
    
        
    }
}