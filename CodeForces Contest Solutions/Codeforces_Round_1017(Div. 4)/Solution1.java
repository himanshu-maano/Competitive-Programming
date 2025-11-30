
import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int test = reader.nextInt();
        reader.nextLine();
        while (test-- > 0) {
            String s = reader.nextLine();

            String[] str = s.trim().split(" ");

            StringBuilder ans = new StringBuilder();

            for(String st : str) {
                ans.append(st.charAt(0));
            }

            System.out.println(ans);
        }
        reader.close();
    }
}
