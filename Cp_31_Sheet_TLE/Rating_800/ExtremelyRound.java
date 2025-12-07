package Rating_800;

import java.util.*;

public class ExtremelyRound {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=999999; i++) {
            if(isRoundNum(i)) {
                list.add(i);
            }
        }

        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while(test-- > 0) {
            int n = reader.nextInt();

            if(n <= 10) {
                System.out.println(n);
                continue;
            }

            int roundNum = 0;
            for(int i=0; i<list.size(); i++) {
                if(list.get(i) <= n) {
                    roundNum++;
                } else {
                    break;
                }
            }

            System.out.println(roundNum);
        }
        reader.close();
    }

    static boolean isRoundNum(int n) {
        int numCnt = 0;
        while(n != 0) {
            int lastDigit = n % 10;
            if(lastDigit != 0) {
                numCnt++;
            }
            n /= 10;
        }

        return numCnt == 1;
    }
}