package Rating_900;

import java.util.*;

public class Forked {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            int a = reader.nextInt();
            int b = reader.nextInt();
            int x_king = reader.nextInt();
            int y_king = reader.nextInt();
            int x_Queen = reader.nextInt();
            int y_Queen = reader.nextInt();

            Set<String> king = new HashSet<>();
            Set<String> queen = new HashSet<>();

            int[] dx = { 1, -1, -1, 1 };
            int[] dy = { 1, 1, -1, -1 };

            for(int i=0; i<4; i++) {
                king.add("(" + (x_king + dx[i]*a) + "," + (y_king + dy[i]*b) + ")");
                king.add("(" + (x_king + dx[i]*b) + "," + (y_king + dy[i]*a) + ")");

                queen.add("(" + (x_Queen + dx[i]*a) + "," + (y_Queen + dy[i]*b) + ")");
                queen.add("(" + (x_Queen + dx[i]*b) + "," + (y_Queen + dy[i]*a) + ")");
            }

            king.retainAll(queen);

            System.out.println(king.size());
        }
        reader.close();
    }
}
