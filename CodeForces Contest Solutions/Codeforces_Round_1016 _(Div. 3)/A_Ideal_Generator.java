import java.util.*;
public class A_Ideal_Generator {
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
        
        if((k & 1) == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}