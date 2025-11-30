import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            int test = reader.nextInt();
            while (test-- > 0) {
                int n = reader.nextInt();
                String s = reader.next();

                int cnt = 0;

                for (int i = 0; i < n; i++) {
                    cnt += modifString(s, i);
                }

                
                System.out.println(cnt);
                
            }
            reader.close();
    }

    private static int modifString(String s, int idx) {
        StringBuilder sb = new StringBuilder(s);

        sb.setCharAt(idx, sb.charAt(idx) == '1' ? '0' : '1');

        int cnt = 0;
        for(char ch : sb.toString().toCharArray()) {
            if(ch == '1') {
                cnt++;
            }
        }

        return cnt;
    }
}
