 import java.util.*;
 public class B_Erase_First_or_Second_Letter {
 
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

        Set<Character> set = new HashSet<>();

        long cnt = 0;
        for(int i=0; i<n; i++) {
            char ch = s.charAt(i);
            if(!set.contains(ch)) {
                cnt += (n - i);
            }
            set.add(ch);
        }

        System.out.println(cnt);
    }
 }