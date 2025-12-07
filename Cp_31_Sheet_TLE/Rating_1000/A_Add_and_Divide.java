import java.util.*;

public class A_Add_and_Divide {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        long a = sc.nextLong();
        long b = sc.nextLong();

        if(b > a) {
            System.out.println(1);
            return;
        } else if(a == b || b > (a / b)) {
            System.out.println(2);
            return;
        }

        int min = 10000000;

        for(int step=0; step<32; step++, b++) {
            if(b == 1){
                continue;
            }
            long temp = a;
            int op = 0;
            while(temp > 0) {
                temp /= b;
                op++;
            }
            min = Math.min(min, (step + op)); 
        }

        System.out.println(min);


    }
}