import java.util.*;

public class C_Monocarp_s_String {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int test = sc.nextInt();

        while (test-- > 0) {

            solve();

        }

        sc.close();

    }

    private static void solve() {

        int n = sc.nextInt();

        String s = sc.next();

        int cnta = 0, cntb = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'a') {
                cnta++;
            } else {
                cntb++;
            }
        }

        if (cnta == cntb) {
            System.out.println(0);
            return;
        }

        if (cnta == 0 || cntb == 0) {
            System.out.println(-1);
            return;
        }

        int x = Math.abs(cnta - cntb);
        TreeSet<Integer> st = new TreeSet<Integer>();

        st.ceiling(7);



    }

}