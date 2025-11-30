import java.util.*;
import java.io.*;

public class B_Make_Connected {

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
        char[][] a = new char[n][n];
        for(int i=0; i<n; i++) {
            char[] c = sc.next().toCharArray();
            a[i] = c;
        }

        


    
        
    }
}