package Rating_800;

import java.util.*;

public class PrependandAppend {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while(test-- > 0) {
            int size = reader.nextInt();
            String s = reader.next();
            
            int l = 0, r = size - 1;
            while(l <= r) {
                if(s.charAt(l++) != s.charAt(r--)) {
                    size -= 2;
                } else {
                    break;
                }
            }

            System.out.println(size);
        }
        reader.close();
    }
}
