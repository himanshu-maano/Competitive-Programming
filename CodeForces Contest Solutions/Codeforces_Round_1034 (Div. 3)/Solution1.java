import java.util.*;

public class Solution1 {
    // static Scanner sc = new Scanner(System.in);

    // public static void main(String[] args) throws Exception {
    // int test = sc.nextInt();
    // while (test-- > 0) {
    // solve();
    // }
    // sc.close();
    // }

    // private static void solve() {
    // int n = sc.nextInt();
    // int[] nums = new int[n];
    // for (int i = 0; i < n; i++) {
    // nums[i] = sc.nextInt();
    // }

    // int[] prefix = new int[n];
    // prefix[0] = nums[0];
    // for(int i=1; i<n; i++) {
    // prefix[i] = Math.min(prefix[i-1], nums[i]);
    // }

    // int[] suffix = new int[n];
    // suffix[n-1] = nums[n-1];
    // for(int i=n-2; i>=0; i--) {
    // suffix[i] = Math.max(suffix[i+1], nums[i]);
    // }

    // StringBuilder ans = new StringBuilder();
    // for(int i=0; i<n; i++) {
    // if(i == 0 || i == n-1) {
    // ans.append("1");
    // } else if(nums[i] < prefix[i-1] || nums[i] > suffix[i+1]){
    // ans.append("1");
    // } else {
    // ans.append("0");
    // }
    // }

    // System.out.println(ans.toString());
    // }
    public static void main(String[] args) {
        int x = inDecimal("100");
        String s = inBinary(4);
    }

    public String addBinary(String a, String b) {
        return inBinary(inDecimal(a) + inDecimal(b));
    }

    private static int inDecimal(String s) {
        int n = s.length();
        int sum = 0;
        for (int i = n - 1, j = 0; i >= 0; i--) {
            int x = s.charAt(i) - '0';
            sum += (x * Math.pow(2, j++));
        }
        System.out.println(sum);

        return sum;
    }

    private static String inBinary(int x) {
        StringBuilder sb = new StringBuilder();
        while (x > 0) {
            int ld = (x % 2);
            sb.append(ld);
            x /= 2;
        }

        System.out.println(sb.reverse().toString());

        return sb.toString();
    }
}
