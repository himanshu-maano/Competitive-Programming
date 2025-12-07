 import java.util.*;
 public class A_K_divisible_Sum {
 
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
        int k = sc.nextInt();

        //if they are of same size then put 1 in every place...
        if(n % k == 0) { 
            System.out.println(1);
            return;
        }

        //we need (k - (n % k)) min total added sum to make it divisible by k
        int extra = k - (n % k);
        
        //we have n position so ceil of (extra / n) wiil be added to few element 
        int ans = (extra + n - 1) / n;

        //at first we try with 1 in every place to make array divisble by k 
        //then we have added ans in few or all element so max min a[i] will be (1 + ans).
        System.out.println(ans + 1);
    }
 }