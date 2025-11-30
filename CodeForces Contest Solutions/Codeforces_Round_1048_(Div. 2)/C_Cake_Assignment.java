import java.util.*;

public class C_Cake_Assignment {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        int k = sc.nextInt();
        long x = sc.nextLong();

        if (1L << k == x) {
            System.out.println(0);
            System.out.println();
            return;
        }

        List<Integer> ans = new ArrayList<>();
        long a = x;
        long b = (1L << (k+1)) - x;
        while (a != b) {
            if (a < b) {
                b -= a;
                a *= 2;
                ans.add(1);
            } else {
                a -= b;
                b *= 2;
                ans.add(2); 
            }
        }

        System.out.println(ans.size());
        for (int i=ans.size()-1; i>=0; i--) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();

    }
}