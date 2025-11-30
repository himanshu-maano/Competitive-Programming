import java.util.*;
public class B_Another_Divisibility_Problem {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        long x = sc.nextLong();

        long end = (long)1e9 - 1;
        System.out.println(end - x);
        
    }
}