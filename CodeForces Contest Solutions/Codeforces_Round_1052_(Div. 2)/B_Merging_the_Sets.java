import java.util.*;

public class B_Merging_the_Sets {

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
        int m = sc.nextInt();

        int[] freq = new int[m + 1];
        int cnt = 0;
        List<List<Integer>> list = new ArrayList<>();

        while (n-- > 0) {
            int size = sc.nextInt();
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                int x = sc.nextInt();
                if (freq[x] == 0) {
                    cnt++;
                }
                l.add(x);
                freq[x]++;
            }
            list.add(l);
        }

        if (cnt != m) {
            System.out.println("NO");
            return;
        }

        int ans = 1; //there is one way possible by taking all set..

        for (List<Integer> set : list) {
            for (int x : set) {
                freq[x]--;
                if (freq[x] == 0) {
                    cnt--;
                }
            }

            if (cnt == m) {
                ans++;
            }

            for (int x : set) {
                if (freq[x] == 0) {
                    cnt++;
                }
                freq[x]++;
            }
        }

        if (ans >= 3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}