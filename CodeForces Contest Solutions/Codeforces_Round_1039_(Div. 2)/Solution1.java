import java.util.*;

public class Solution1 {
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
        long c = sc.nextLong();
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            list.add(x);
        }

        Collections.sort(list);

        long coins = 0;
        long j = 1;

        while(list.size() > 0) {
            int idx = 0;
            for(int k=list.size()-1; k>=0; k--) {
                if(list.get(k) * j <= c) {
                    idx = k+1;
                    list.remove(k);
                    break;
                }
            }
            j *= 2;
            for(int i=idx; i<list.size(); i++) {
                coins++;
                list.remove(i);
            }
        } 

        System.out.println(coins);
    }

    public static int findNearestIndex(List<Long> arr, long n) {
        Collections.sort(arr);

        int left = 0, right = arr.size() - 1;
        int resultIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr.get(mid) <= n) {
                resultIndex = mid; 
                left = mid + 1; 
            } else {
                right = mid - 1;
            }
        }

        return resultIndex; 
    }

}
