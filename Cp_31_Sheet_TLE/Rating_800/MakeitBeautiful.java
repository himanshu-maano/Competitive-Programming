package Rating_800;

import java.util.*;

public class MakeitBeautiful {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            int size = reader.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = reader.nextInt();
            }

            if (isEqual(arr)) {
                System.out.println("NO");
                continue;
            }

            Arrays.sort(arr);
            int max = arr[size-1];
            
            System.out.println("YES");
            System.out.print(max + " ");
            for (int i = 0; i < size - 1; i++) {
               System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        reader.close();
    }

    static boolean isEqual(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                return false;
            }
        }
        return true;
    }
}
