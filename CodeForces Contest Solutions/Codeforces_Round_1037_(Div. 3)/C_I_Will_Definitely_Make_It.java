import java.util.*;

public class C_I_Will_Definitely_Make_It {

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
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long ini = a[k-1];

        Arrays.sort(a);

        if(ini == a[n-1]) {
            System.out.println("YES");
            return;
        }

        int i=0;
        while(i < n && a[i] != ini) {
            i++;
        }

        long time = ini;
        boolean can = true;
        for(; i<n-1; i++) {
            if(a[i+1] - a[i] > time) {
                can = false;
                break;
            }
        }

        if(can) {
            System.out.println("YES");
        } else{ 
            System.out.println("NO");
        }
    }
}