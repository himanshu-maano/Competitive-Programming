package Rating_800;

import java.util.*;

public class EverybodyLikesGoodArrays {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while(test-- > 0) {
            int size = reader.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = reader.nextInt();
            }

            int parityCnt = 0;
            for (int i = 0; i < size - 1; i++) {
                if((arr[i] & 1) == (arr[i+1] & 1)) {
                    parityCnt++;
                }
            }

            System.out.println(parityCnt);
        }
        reader.close();
    }
}
