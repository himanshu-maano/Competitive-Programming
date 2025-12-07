package Rating_800;

import java.util.Scanner;

public class TargetPractice {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            char[][] grid = new char[10][10];
            for (int i = 0; i < 10; i++) {
                grid[i] = reader.next().toCharArray();
            }

            int point = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid.length; j++) {
                    if (grid[i][j] == 'X') {
                        if (i == 0 || j == 0 || (i == 9) || (j == 9)) {
                            point += 1;
                        } else if ((i > 0 && i < 9 && (j == 1 || j == 8)) || (j > 0 && j < 9 && (i == 1 || i == 8))) {
                            point += 2;
                        } else if ((i > 1 && i < 8 && (j == 2 || j == 7)) || (j > 1 && j < 8 && (i == 2 || i == 7))) {
                            point += 3;
                        } else if ((i > 2 && i < 7 && (j == 3 || j == 6)) || (j > 2 && j < 7 && (i == 3 || i == 6))) {
                            point += 4;
                        } else if ((i > 3 && i < 6 && (j == 4 || j == 5)) || (j > 3 && j < 6 && (i == 4 || i == 5))) {
                            point += 5;
                        }
                    }
                }
            }

            System.out.println(point);

        }
        reader.close();
    }
}
