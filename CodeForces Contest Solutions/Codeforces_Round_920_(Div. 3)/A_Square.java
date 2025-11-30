    import java.util.*;
    public class A_Square {
        static Scanner sc = new Scanner(System.in);
        
        public static void main(String[] args) throws Exception {
            int test = sc.nextInt();
            while (test-- > 0) {
                solve();
            }
            sc.close();
        }
        
        private static void solve() {
            int n = 2;
            int side = 0;
            while(n-- > 0) {
                int x1 = sc.nextInt();
                int y1 = sc.nextInt();

                int x2 = sc.nextInt();
                int y2 = sc.nextInt();

                side = Math.max(Math.abs(x1 - x2), Math.abs(y1 - y2));
            }

            System.out.println(side * side);


        
            
        }
    }
