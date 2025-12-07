import java.util.*;
public class A_Red_Versus_Blue {

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
        int r = sc.nextInt();
        int b = sc.nextInt();

        int r_Cnt = r / (b + 1);

        int extra = r % (b + 1);

        StringBuilder ans = new StringBuilder();
        StringBuilder s = new StringBuilder();
        for(int i=0; i<r_Cnt; i++) {
            s.append('R');
        }

        for(int i=0; i<=b; i++) {
            ans.append(s);

            if(extra > 0) {
                ans.append('R');
                extra--;
            }

            if(i != b) {
                ans.append('B');
            }
        }

        System.out.println(ans);
    
        
    }
}