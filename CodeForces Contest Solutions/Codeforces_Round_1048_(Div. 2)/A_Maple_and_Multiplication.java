import java.util.*;
public class A_Maple_and_Multiplication {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b) {
            System.out.println(0);
        } else if(a % b == 0 || b % a == 0) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
        
    }
}