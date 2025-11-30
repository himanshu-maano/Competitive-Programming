import java.util.*;

public class St_Chroma {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            int n = reader.nextInt();
            int x = reader.nextInt();

            int[] ans = new int[n];

            for (int i = 0; i < n; i++) {
                ans[i] = i;
            }

            if (ans[n - 1] != x && x < n) {
                int temp = ans[n - 1];
                ans[n - 1] = ans[x];
                ans[x] = temp;
            }

            printArray(ans);
        }
        reader.close();
    }

    private static void printArray(int[] arr) {
        for(int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
