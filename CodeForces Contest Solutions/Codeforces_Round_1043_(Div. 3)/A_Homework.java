import java.util.*;
public class A_Homework {
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
        String a = sc.next();

        int m = sc.nextInt();
        String b = sc.next();

        sc.nextLine();
        String c = sc.next();

        StringBuilder sb = new StringBuilder(a);

        for(int i=0; i<m; i++) {
            if(c.charAt(i) == 'V') {
                sb.insert(0, b.charAt(i));
            } else {
                sb.append(b.charAt(i));
            }
        }

        System.out.println(sb.toString());
        
    }
}