import java.util.*;

public class Chemistry {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            int size = reader.nextInt();
            int k = reader.nextInt();
            String s = reader.next();

            HashMap<Character, Integer> map = new HashMap<>();
            for (char ch : s.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            int odd_Cnt = 0;
            for (int x : map.values()) {
                if ((x & 1) == 1) {
                    odd_Cnt++;
                }
            }

            if (k >= odd_Cnt - 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        reader.close();
    }
}
