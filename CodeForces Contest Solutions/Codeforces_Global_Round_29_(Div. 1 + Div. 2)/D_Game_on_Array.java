import java.util.*;
public class D_Game_on_Array {

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
    
        Map<Long, Integer> map = new HashMap<>();

        long alice = 0;
        for(int i=0; i<n; i++) {
            if((a[i] & 1) == 1) {
                map.put(a[i] , map.getOrDefault(a[i], 0) + 1);
                alice += (a[i] - 1) / 2;
            } else {
                alice += (a[i] / 2);
            }
        }

        Integer[] freq = new Integer[map.size()];
        int i=0;
        for(long key : map.keySet()) {
            freq[i] = map.get(key);
            i++;
        }

        Arrays.sort(freq, Collections.reverseOrder());
        
        long bob = alice;
        for(int j=0; j<freq.length; j++) {
            if((j & 1) == 0) {
                alice += freq[j];
            } else {
                bob += freq[j];
            }
        }

        System.out.println(alice + " " + bob);
    }
}