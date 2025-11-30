import java.util.*;
public class A_Shift_Sort {
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

        int cnt0 = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '0') {
                cnt0++;
            }
        }

        int op = 0;
        for(int i=0; i<cnt0; i++) {
            char ch = s.charAt(i);
            if(ch == '1') {
                op++;
            }
        }

        System.out.println(op);
        
    }
}