 import java.util.*;
 public class B_Funny_Permutation {
 
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
    
        if(n == 2){
            System.out.println(2 + " " + 1);
        } else if(n == 3) {
            System.out.println(-1);
        } else {
            System.out.print(n + " " + (n-1) + " ");
            for(int i=1; i<=n-2; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
 }