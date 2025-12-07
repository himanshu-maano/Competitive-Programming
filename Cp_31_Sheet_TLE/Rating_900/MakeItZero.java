import java.util.*;

public class MakeItZero {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            int size = reader.nextInt();

            int[] nums = new int[size];
            for (int i = 0; i < size; i++) {
                nums[i] = reader.nextInt();
            }

            if ((size & 1) == 0) {
                System.out.println(2);
                System.out.println(1 + " " + size);
                System.out.println(1 + " " + size);
            } else {
                System.out.println(4);
                System.out.println(1 + " " + (size - 1));
                System.out.println(1 + " " + (size - 1));
                System.out.println((size - 1) + " " + size);
                System.out.println((size - 1) + " " + size);
            }
        }
        reader.close();
    }
}
