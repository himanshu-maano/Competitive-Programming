package Rating_800;

import java.util.*;

public class OneandTwo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            int size = reader.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = reader.nextInt();
            }

            int twoCnt = 0;
            for(int x : arr) {
                if(x == 2) {
                    twoCnt++;
                }
            }
            int k;
            int prefixtwoCnt = 0;
            for (k = 0; k < size; k++) {
                if(arr[k] == 2) {
                    prefixtwoCnt++;
                    twoCnt--;
                }
                if(prefixtwoCnt == twoCnt) {
                    break;
                }
            }
            k = k == size ? -1 : k + 1;
            System.out.println(k);
        }
        reader.close();
    }
}
