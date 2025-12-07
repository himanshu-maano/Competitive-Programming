package Rating_800;

import java.util.Scanner;

public class Buttons {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            int a = reader.nextInt();
            int b = reader.nextInt();
            int c = reader.nextInt();

            int first = a;
            int second = b;
            if((c & 1) == 1) {
                first += (c / 2) + 1;
                second += (c / 2);
                if(first > second) {
                    System.out.println("First");
                } else{
                    System.out.println("Second");
                }
            } else{
                first += (c / 2);
                second += (c / 2);
                if(first > second) {
                    System.out.println("First");
                } else{
                    System.out.println("Second");
                }
            }
        }
        reader.close();
    }
}
