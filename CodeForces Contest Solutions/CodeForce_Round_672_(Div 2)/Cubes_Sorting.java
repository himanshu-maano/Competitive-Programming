import java.util.*;
public class Cubes_Sorting {
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
            int[] cubes = new int[n];
            for (int i = 0; i < n; i++) {
                cubes[i] = sc.nextInt();
            }
            
            boolean isSorted = false;
            for(int i=0; i<n-1; i++) {
                if(cubes[i] <= cubes[i+1]) {
                    isSorted = true;
                    break;
                }
            }

            if(isSorted) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
}
