import java.util.*;
public class B_Divan_and_a_New_Project {

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
        long[][] a = new long[n][3];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextLong();
            a[i][1] = i;
        }
    
        Arrays.sort(a, (x, y) -> Long.compare(y[0], x[0]));

        int x = 1, y = -1;
        for(int i=0; i<n; i++) {
            if((i & 1) == 0) {
                a[i][2] = x;
                x++;
            } else {
                a[i][2] = y;
                y--;
            }
        }

        long[] ans = new long[n];
        long sum = 0;
        for(int i=0; i<n; i++) {
            ans[(int)a[i][1]] = a[i][2];
            sum += Math.abs(a[i][2]) * a[i][0] * 2;
        }

        System.out.print(sum + "\n" + (0) + " ");
        for(long ele : ans) {
            System.out.print(ele + " ");
        }

        System.out.println();
    }
}