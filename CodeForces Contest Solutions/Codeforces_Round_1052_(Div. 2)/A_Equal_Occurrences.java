import java.util.*;

public class A_Equal_Occurrences {
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
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        int[] freq = new int[n + 1];

        for (long x : a) {
            freq[(int) x]++;
        }

        int cnt = 0;
        for (int x : freq) {
            if (x > 0)
                cnt++;
        }

        Arrays.sort(freq);

        int j = 0;
        while (j < n && freq[j] == 0) {
            j++;
        }

        int max = 0;
        for (; j < n + 1; j++) {
            max = Math.max(max, freq[j] * cnt);
            cnt--;
        }
        System.out.println(max);

    }
}