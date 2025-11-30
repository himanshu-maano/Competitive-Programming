import java.util.*;
public class E_Eat_the_Chip {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }
    
    private static void solve() {
        long h = sc.nextLong();
        long w = sc.nextLong();
        long x1 = sc.nextLong();
        long y1 = sc.nextLong();
        long x2 = sc.nextLong();
        long y2 = sc.nextLong();


        if(x1 > x2) {
            System.out.println("Draw");
            return;
        }
        
        long r = x2 - x1;

        long c = Math.abs(y2 - y1);

        if(c <= 1) {
            if((r & 1) == 1) {
                System.out.println("Alice");
            }else {
                System.out.println("Bob");
            }
        } else {
            System.out.println("Draw");
        }


    
         
    }
}