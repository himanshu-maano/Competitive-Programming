import java.util.*;

public class Solution4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int test = reader.nextInt();

        while (test-- > 0) {
            String p = reader.next();
            String s = reader.next();

            if(p.equals(s)) {
                System.out.println("YES");
                continue;
            }

            HashMap<Character, Integer> map = new HashMap<>();
            for(char ch : s.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            

        }
        reader.close();
    }
}
