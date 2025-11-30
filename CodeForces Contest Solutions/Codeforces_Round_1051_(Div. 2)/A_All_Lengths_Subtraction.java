import java.util.*;

public class A_All_Lengths_Subtraction {
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
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int l=0, r = n-1;
        for(int i=1; i<=n; i++) {
            if(a[l] == i) {
                l++;
            } else if(a[r] == i) {
                r--;
            } else {
                System.out.println("NO");
                return;
            }
        }        

        System.out.println("YES");
    }
}