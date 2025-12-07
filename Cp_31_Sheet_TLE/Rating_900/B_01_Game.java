import java.util.*;
public class B_01_Game {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        String s = sc.next();

        int cnt1 = 0, cnt0 = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '0') {
                cnt0++;
            } else {
                cnt1++;
            }
        }

        int pair = Math.min(cnt1, cnt0);

        if((pair & 1) == 0) {
            System.out.println("NET");
        } else {
            System.out.println("DA");
        }

    }
}