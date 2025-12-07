import java.util.*;
public class B_Monsters {
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
        long k = sc.nextLong();
        Long[] a = new Long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        Long[][] pair = new Long[n][2];
        for(int i=0; i<n; i++) {
            if(a[i] % k == 0) {
                pair[i][0] = k;
            } else {
                pair[i][0] = a[i] % k;
            }
            
            pair[i][1] = i+1L;
        }

        Arrays.sort(pair, (x, y) -> {
            int cmp = Long.compare(y[0], x[0]);
            if(cmp != 0) return cmp;

            return Long.compare(x[1], y[1]);
        });

        for(Long[] x : pair) {
            System.out.print(x[1] + " ");
        }

        System.out.println();

    }
}