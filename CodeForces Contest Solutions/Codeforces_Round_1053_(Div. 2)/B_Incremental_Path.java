import java.util.*;

public class B_Incremental_Path {

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
        int m = sc.nextInt();
        String s = sc.next();

        Set<Long> set = new HashSet<>();
        long[] a = new long[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextLong();
            set.add(a[i]);
        }


        long num = 1;
        for(char ch : s.toCharArray()) {
            num++; 
            if(ch == 'B') { //next white cell
                while(set.contains(num)) {
                    num++;
                }
            }

            set.add(num);

            if(ch == 'B') {//new next white cell after turning last white cell to black
                while(set.contains(num)) {
                    num++;
                }
            }
        }

        List<Long> list = new ArrayList<>(set);
        Collections.sort(list);
        
        System.out.println(set.size());
        for(long x : list) {
            System.out.print(x + " ");
        }
        System.out.println();

    }
}