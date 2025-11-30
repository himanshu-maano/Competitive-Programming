  import java.util.*;
  public class A_El_fucho {
  
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
        
        System.out.println((n - 1) + (n - 2) + 1);
        
    }
  }