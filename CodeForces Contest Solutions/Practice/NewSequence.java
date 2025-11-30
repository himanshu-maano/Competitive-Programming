package Practice;

// import java.util.*;
public class NewSequence {
    public static void main(String[] args) {
        int size = track(20);

        System.out.println(size);
        System.out.println(Math.pow(2, 20) - 1);
    }

    private static int track(int n) {
        if(n == 1) {
            return 1;
        }

        int ans = track(n - 1);

        return (2 * ans )+ 1;
    }
}
