import java.util.*;
import java.io.*;

public class A {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }
    
    private static void solve() {
        int r = sc.nextInt();
        int x = sc.nextInt();
        int d = sc.nextInt();

        int n = sc.nextInt();

        char[] a = sc.next().toCharArray();

        int one = 0, two = 0;
        for(int i=0; i<n; i++) {
            if(a[i] == '1') {
                one++;
            } else {
                if(r < x) {
                    two++;
                } else if(r - (one * d) < x) {
                    two++;
                }
            }
        }


        System.out.println(one + two);
    
        
    }
}