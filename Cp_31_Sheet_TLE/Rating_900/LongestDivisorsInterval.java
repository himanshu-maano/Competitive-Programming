import java.util.Scanner;

public class LongestDivisorsInterval {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            long n = reader.nextLong();

            long size = 1;
            for (long i = 1; i <= n; i++) {
                if (n % i != 0) {
                    size = i - 1;
                    break;
                }
            }

            System.out.println(n == 2 ? 2 : size);
        }
        reader.close();
    }
}
