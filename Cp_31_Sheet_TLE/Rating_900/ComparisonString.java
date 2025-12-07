package Rating_900;

import java.util.Scanner;

public class ComparisonString {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            int n = reader.nextInt();
            String s = reader.next();

            int len = 1;
            int maxLen = 1;
            for(int i=0; i<n-1; i++) {
                if(s.charAt(i) == s.charAt(i+1)) {
                    len++;
                }else {
                    len = 1;
                }
                maxLen = Math.max(maxLen, len);
            }

            System.out.println(maxLen + 1);
        }
        reader.close();
    }
}
