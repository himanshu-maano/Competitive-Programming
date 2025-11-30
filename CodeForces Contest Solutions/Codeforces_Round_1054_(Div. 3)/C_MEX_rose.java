import java.util.*;
public class C_MEX_rose {

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
        int k = sc.nextInt();
        long[] a = new long[n];
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            map.put(a[i] , map.getOrDefault(a[i], 0) + 1);
        }
    
        long x = 0;
        long cnt = 0;
        while(x < k) {
            if(!map.containsKey(x)) {
                cnt++;
            }
            x++;
        }

        int kcnt = map.getOrDefault((long)k, 0);

        if(kcnt > cnt) {
            cnt += (kcnt - cnt);
        } 

        System.out.println(cnt);
        
    }
}