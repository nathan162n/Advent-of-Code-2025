import java.io.*;
import java.util.*;

public class Part2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("input.txt"));

        Long sum = 0L;

        String temp = input.nextLine();
        String[] bounds = temp.split(",");
        for (String bound : bounds) {
            String[] range = bound.split("-");
            for (Long i = Long.parseLong(range[0]); i <= Long.parseLong(range[1]); i++) {
                if (isInvalid(i)) {
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }

    public static boolean isInvalid(Long l) {
        String s = l.toString();
        int len = s.length();
        for (int i = 1; i <= len / 2; i++) {
            if (len % i != 0) {
                continue;
            }
            if (s.replace(s.substring(0, i), "").equals("")) {
                return true;
            }
        }
        return false;
    }
}
