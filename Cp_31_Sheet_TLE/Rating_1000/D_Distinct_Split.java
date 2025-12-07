import java.util.*;

public class D_Distinct_Split {
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
        String s = sc.next();

        // int[] freq = new int[26];
        // for (char ch : s.toCharArray()) {
        //     freq[ch - 'a']++;
        // }

        // Set<Character> set = new HashSet<>();
        // long maxLen = 0;
        // for (char ch : s.toCharArray()) {
        //     set.add(ch);
        //     freq[ch - 'a']--;
        //     int unique = 0;
        //     for(int x : freq) {
        //         if(x > 0) unique++;
        //     }

        //     maxLen = Math.max(maxLen, set.size() + unique);
        // }

        // System.out.println(maxLen);

        int[] prefix = new int[n];
        int[] suffix = new int[n];
        Set<Character> set = new HashSet<>();
        for(int i=0; i<n; i++) {
            char ch = s.charAt(i);
            set.add(ch);
            prefix[i] = set.size();
        }

        set.clear();
        for(int i=n-1; i>=0; i--) {
            char ch = s.charAt(i);
            set.add(ch);
            suffix[i] = set.size();
        }

        long maxLen = 0;
        for(int i=0; i<n-1; i++) {
            maxLen = Math.max(maxLen, prefix[i] + suffix[i+1]);
        }

        System.out.println(maxLen);

    }
}