package Rating_800;

import java.util.Scanner;

public class DontTrytoCount {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        StringBuilder ans = new StringBuilder();
        while (test-- > 0) {
            int n = reader.nextInt();
            int m = reader.nextInt();
            String x = reader.next();
            String s = reader.next();

            if (x.contains(s)) {
                ans.append(0);
                ans.append("\n");
                continue;
            }

            StringBuilder copy = new StringBuilder(x);
            boolean isfound = false;
            int count = 0;
            while(count < 6) {
                copy.append(copy);
                count++;
                if (copy.toString().contains(s)) {
                    isfound = true;
                    break;
                }
            }

            if (isfound) {
                ans.append(count);
                ans.append("\n");
            } else{
                ans.append(-1);
                ans.append("\n");
            }
        }
        System.out.println(ans);
        reader.close();
    }
}
