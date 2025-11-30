import java.util.*;

public class Solution3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] nums = new int[r][c];
        int max = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                nums[i][j] = sc.nextInt();
                max = Math.max(max, nums[i][j]);
            }
        }

        List<Pair> list = new ArrayList<>();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (nums[i][j] == max) {
                    list.add(new Pair(i, j));
                }
            }
        }

        if (list.size() == 1) {
            System.out.println(max - 1);
            return;
        }

        if (list.get(0).first == list.get(1).first) {
            int row = list.get(0).first, col = -1;

            boolean flag = true;
            for (Pair x : list) {
                if (x.first != row) {
                    if (col == -1) {
                        col = x.second;
                    } else if (x.second != col) {
                        flag = false;
                        break;
                    }
                }
            }

            if (flag) {
                System.out.println(max - 1);
                return;
            }
        }

        if (list.get(0).second == list.get(1).second) {
            int col = list.get(0).second, row = -1;

            boolean flag = true;
            for (Pair x : list) {
                if (x.second != col) {
                    if (row == -1) {
                        row = x.first;
                    } else if (x.first != row) {
                        flag = false;
                        break;
                    }
                }
            }

            if (flag) {
                System.out.println(max - 1);
                return;
            }
        }

        if (isCheck(list, list.get(0).first, list.get(1).second)
                || isCheck(list, list.get(1).first, list.get(0).second)) {
            System.out.println(max - 1);
            return;
        }

        System.out.println(max);
    }

    public static boolean isCheck(List<Pair> list, int r, int c) {
        for (Pair x : list) {
            if (x.first != r && x.second != c) {
                return false;
            }
        }
        return true;
    }

    static class Pair {
        int first;
        int second;

        Pair(int f, int s) {
            this.first = f;
            this.second = s;
        }
    }
}
