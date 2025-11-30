import java.util.*;
public class A_Cut_the_Array {
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
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        
        if(sum % 3 != 0) {
            System.out.println(0 + " " + 0);
            return;
        }

        sum = 0;
        int l = -1, r = -1;
        for(int i=0; i<n-1; i++) {
            sum += a[i];
            if(sum % 3 == 0 && l ==-1) {
                l = i;
                sum = 0;
            } else if(r == -1 && sum % 3 == 0) {
                r = i;
                break;
            }
        }

        if(r != -1 && l != -1) {
            System.out.println((l + 1) + " " + (r + 1));
        } else {
            System.out.println(1 + " " + (n-1));
        }

        

    }
}