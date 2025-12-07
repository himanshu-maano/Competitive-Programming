import java.util.*;

public class B_Basketball_Together {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long d = sc.nextLong();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextLong();
        }

        Arrays.sort(nums);
        long win = 0;
        long req = 0;
        int r = n-1;
        while(r >= 0) {
            req = (d + nums[r]) / nums[r--];
            if(req <= n) {
                win++;
                n -= req;
            } else {
                break;
            }
        }

        System.out.println(win);
        sc.close();
    }
}