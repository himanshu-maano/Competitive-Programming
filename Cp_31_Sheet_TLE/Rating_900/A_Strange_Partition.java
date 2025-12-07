import java.util.*;
public class A_Strange_Partition {
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
        long x = sc.nextLong();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        long min = 0;
        long max = 0;
        for(int y : a) {
            max += Math.ceil(y/(double)x);
            min += y;
        }

        min =  (long)Math.ceil(min/(double)x);

        System.out.println(min + " " + max);
        
    }
}