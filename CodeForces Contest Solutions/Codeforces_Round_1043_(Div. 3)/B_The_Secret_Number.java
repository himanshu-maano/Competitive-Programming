import java.util.*;
public class B_The_Secret_Number {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        long n = sc.nextLong();
        
        List<Long> ans = new ArrayList<>();

        for(int i=1; i<18; i++) {
            long y = (long)Math.pow(10, i) + 1;

            if(y > n) break;
            if(n % y == 0) {
                long x = n/y;
                ans.add(x);
            }
        }

        if(ans.size() == 0) {
            System.out.println(0);
        } else {
            Collections.sort(ans);
            System.out.println(ans.size());
            for(long z : ans) {
                System.out.print(z + " ");
            }
            System.out.println();
        }
    }
}