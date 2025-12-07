import java.util.*;

public class A_Three_Indices {
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

        int[] prevS = new int[n];
        int[] nextS = new int[n];

        int[] stack = new int[n];
        int j = -1;
        for (int i = 0; i < n; i++) {
            while (j > -1 && a[stack[j]] > a[i]) {
                j--;
            }
            if (j > -1) {
                prevS[i] = stack[j];
            } else {
                prevS[i] = -1;
            }
            stack[++j] = i;
        }
        j = -1;
        for (int i = n-1; i >= 0; i--) {
            while (j > -1 && a[stack[j]] > a[i]) {
                j--;
            }
            if (j > -1) {
                nextS[i] = stack[j];
            } else {
                nextS[i] = -1;
            }
            stack[++j] = i;
        }

        for(int i=1; i<n-1; i++) {
            if(prevS[i] != -1 && nextS[i] != -1) {
                System.out.println("YES");
                System.out.println((prevS[i] + 1) + " " + (i + 1) + " " + (nextS[i] + 1));
                return;
            }
        }

        System.out.println("NO");
    }
}