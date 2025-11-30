import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int test = reader.nextInt();

        while (test-- > 0) {
            int n = reader.nextInt();

            int[][] grid = new int[n][n];
            HashSet<Integer> set = new HashSet<>();
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    grid[i][j] = reader.nextInt();
                    set.add(grid[i][j]);
                }
            }

            int[] passcode = new int[2*n];

            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    passcode[i+j+1] = grid[i][j];
                }
            }

            int leftover = -1;
            for(int i=1; i<=2*n; i++) {
                if(!set.contains(i)) {
                    leftover = i;
                }
            }

            passcode[0] = leftover;

            printArr(passcode);
            
        } 
        reader.close();
    }

    private static void printArr(int[] arr) {
        for(int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
