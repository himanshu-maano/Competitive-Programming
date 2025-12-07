import java.util.*;

public class C_Traffic_Light {
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
        char c = sc.next().charAt(0);
        String s = sc.next();

        /* int gIdx = -1;
        for(int i=0; i<n; i++) {a
            if(s.charAt(i) == 'g') {
                if(gIdx == -1) gIdx = i;
            }
        }

        int maxLen = 0;
        for(int i=0; i<n;) {
            if(s.charAt(i) == c) {
                boolean found = false;
                for(int j=i+1; j<n; j++) {
                    if(s.charAt(j) == 'g') {
                        maxLen = Math.max(maxLen, j-i);
                        found = true;
                        i = j+1;
                        break;
                    }
                }
                if(found) {
                    continue;
                } else {
                    maxLen = Math.max(maxLen, n - i + gIdx);
                    break;
                }
            }
            i++;
        }
        
        System.out.println((c == 'g') ? 0 : maxLen); */


        int maxLen = 0;
        int lastIdxGreen = -1;
        for(int i=2*n-1; i>=0; i--) {
            char ch = s.charAt(i % n);
            if(ch == 'g') {
                lastIdxGreen = i;
            }
            if(ch == c && lastIdxGreen != -1) {
                maxLen = Math.max(maxLen, lastIdxGreen - i);
            }
        }

        System.out.println(maxLen);
    }
}
