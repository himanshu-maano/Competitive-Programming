package Rating_800;

import java.util.Scanner;

public class ForbiddenInteger {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            int n = reader.nextInt();
            int k = reader.nextInt();
            int x = reader.nextInt();

            if (k == 1 && x == 1) {
                System.out.println("NO");
            } else if (k == 2) {
                if (x == 1) {
                    if ((n & 1) == 0) {
                        System.out.println("YES");
                        System.out.println(n / 2);
                        for (int i = 1; i <= n / 2; i++) {
                            System.out.print(2 + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("NO");
                    }
                } else if (x == 2) {
                    System.out.println("YES");
                    System.out.println(n);
                    for (int i = 1; i <= n; i++) {
                        System.out.print(1 + " ");
                    }
                    System.out.println();
                }
            } else if (k > 2) {
                System.out.println("YES");

                if (x != 1) {
                    System.out.println(n);
                    for (int i = 1; i <= n; i++) {
                        System.out.print(1 + " ");
                    }
                    System.out.println();
                } else {
                    if ((n & 1) == 0) {
                        System.out.println(n / 2);
                        for (int i = 1; i <= n / 2; i++) {
                            System.out.print(2 + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println(n / 2);
                        for (int i = 1; i < n / 2; i++) {
                            System.out.print(2 + " ");
                        }
                        System.out.println(3);
                    }
                }
            }
        }
        reader.close();
    }
}