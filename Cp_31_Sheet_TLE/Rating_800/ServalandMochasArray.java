package Rating_800;

import java.util.*;

public class ServalandMochasArray {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            int size = reader.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = reader.nextInt();
            }

            
            boolean isGood = false;
            for (int i = 0; i < arr.length-1; i++) {
                int prefix = 0;
                for (int j = i+1; j < arr.length; j++) {
                    prefix = gcd(arr[i], arr[j]);
                    if (prefix <= 2) {
                        isGood = true;
                        break;
                    }
                }
                if(isGood) {
                    break;
                }
            }

            if (isGood) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        reader.close();
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}

/*
 *
 * static int gcd(int a, int b) {
 * while (b != 0) {
 * int temp = b;
 * b = a % b;
 * a = temp;
 * }
 * return a;
 * }
 */
