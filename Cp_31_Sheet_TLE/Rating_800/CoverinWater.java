package Rating_800;

import java.util.Scanner;

public class CoverinWater {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        StringBuilder ans = new StringBuilder();
        while (test-- > 0) {
            int size = reader.nextInt();
            String s = reader.next();

            int emptySpace = 0;
            boolean isLen3 = false;

            for (int i = 0; i < size; i++) {
                if(s.charAt(i) == '.') {
                    emptySpace++;
                }
                if(i < size - 2 && (s.charAt(i) == '.' && s.charAt(i + 1) == '.' && s.charAt(i + 2) == '.')){
                    isLen3 = true;
                }
            }

            if (isLen3) {
                ans.append(2);
                ans.append("\n");
            } else {
                ans.append(emptySpace);
                ans.append("\n");
            }
        }
        System.out.println(ans);
        reader.close();
    }
}
