import java.util.*;
public class A_Shortest_Increasing_Path {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }
    
    private static void solve() {
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x == y) {
            System.out.println(-1);
            return;
        }

        if(x > y) {
            if(x - y <= 1 || y == 1) {
                System.out.println(-1);
                return;
            }
            System.out.println(3);
        } else {
            System.out.println(2);
        }
    }
}