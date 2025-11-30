import java.util.*;
public class A_Redstone {
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
        Arrays.sort(a);

        boolean can = false;
        for(int i=1; i<n; i++) {
            if(a[i] == a[i-1]) {
                can = true;
                break;
            }
        }

        System.out.println(can == true ? "YES" : "NO");
    }
}