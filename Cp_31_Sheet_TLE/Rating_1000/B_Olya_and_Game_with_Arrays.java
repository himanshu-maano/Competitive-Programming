import java.util.*;

public class B_Olya_and_Game_with_Arrays {
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
        int[][] a = new int[n][];
        int size = 0;
        int min = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        while (size < n) {
            int m = sc.nextInt();
            a[size] = new int[m];
            int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                a[size][j] = sc.nextInt();
                if (a[size][j] <= min1) {
                    min2 = min1;
                    min1 = a[size][j];
                } else if (a[size][j] > min1 && a[size][j] < min2) {
                    min2 = a[size][j];
                }
            }
            min = Math.min(min, min1);
            list.add(min2);
            size++;
        }

        int m = Integer.MAX_VALUE;  // this is min of all min2 
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) < m) {
                m = list.get(j);
            }
        }
        list.add(min);

        long sum = 0;
        boolean flag = true;
        for (int x : list) {
            if (flag && x == m) {
                flag = false;
                continue;
            }
            sum += x;
        }

        System.out.println(sum);
    }
}

/*
 * 4
 * 4
 * 5 3 3 1  -> 1, 3
 * 2
 * 1 2      -> 1, 2
 * 4
 * 2 4 2 4  -> 2, 2
 * 4
 * 2 5 5 3  -> 2, 3
 */