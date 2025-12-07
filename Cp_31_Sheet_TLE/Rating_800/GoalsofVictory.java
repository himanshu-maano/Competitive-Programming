package Rating_800;

import java.util.Scanner;

public class GoalsofVictory {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while(test-- > 0) {
            int size = reader.nextInt();
            int[] teamEfficiency = new int[size-1];
            for (int i = 0; i < teamEfficiency.length; i++) {
                teamEfficiency[i] = reader.nextInt();
            }

            int totalEfficiency = 0;
            for(int x : teamEfficiency) {
                totalEfficiency += x;
            }

            System.out.println(-totalEfficiency);
        }
        reader.close();
    }
}
