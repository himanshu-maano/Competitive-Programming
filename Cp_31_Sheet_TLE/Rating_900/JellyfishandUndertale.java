import java.util.*;

public class JellyfishandUndertale {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            long a = reader.nextLong();
            long b = reader.nextLong();
            int n = reader.nextInt();

            int[] tools = new int[n];
            for (int i = 0; i < n; i++) {
                tools[i] = reader.nextInt();
            }

            long totalTime = b;

            for (int x : tools) {
                totalTime += Math.min(x, a - 1);
            }

            System.out.println(totalTime);
        }
        reader.close();
    }
}
