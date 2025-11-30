import java.util.*;

public class D_Replace_with_Occurrences {
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

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i=0; i<n; i++) {
            map.putIfAbsent(a[i], new ArrayList<>());
            map.get(a[i]).add(i);
        }

        int[] ans = new int[n];
        int z = 1;
        for (int x : map.keySet()) {
            List<Integer> list = map.get(x);
            if (list.size() % x != 0) {
                System.out.println(-1);
                return;
            }
            int cnt = 0;
            for(int j=0; j<list.size(); j++) {
                ans[list.get(j)] = z;
                cnt++;
                if(cnt == x) {
                    z++;
                    cnt = 0;
                }
            }
            
        }

        for (int j = 0; j < ans.length; j++) {
            System.out.print(ans[j] + " ");
        }

        System.out.println();
    }
}