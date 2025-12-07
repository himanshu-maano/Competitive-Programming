// package Rating_900;
import java.util.*;
public class B_Make_AP {
        static Scanner sc = new Scanner(System.in);
        
        public static void main(String[] args) throws Exception {
            int test = sc.nextInt();
            while (test-- > 0) {
                solve();
            }
            sc.close();
        }
    
        private static void solve() {
            long a = sc.nextInt();
            long b = sc.nextInt();
            long c = sc.nextInt();

            if(isOk(a, b, c)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }   
        }

        private static boolean isOk(long a, long b, long c) {
            long new_A = (2*b - c);
            if(new_A / a > 0 && new_A % a == 0) {
                return true;
            }
            long new_B = (a + c) / 2;
            if(new_B / b > 0 && new_B % b == 0 && ((c- a) & 1) == 0) {
                return true;
            }
            long new_C = (2*b - a);
            if(new_C / c > 0 && new_C % c == 0) {
                return true;
            }
            return false;
        }
}