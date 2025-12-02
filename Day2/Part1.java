import java.io.*;
import java.util.*;

public class Part1 {
    public static void main(String[] args) throws Exception {
        String[] ranges = null;
        Long sum = 0L;
        Scanner input = new Scanner(new File("input.txt"));
        String temp = input.nextLine();
        ranges = temp.split(",");

        for (String range : ranges) {
            String[] bounds = range.split("-");
            for (Long i = Long.parseLong(bounds[0]); i <= Long.parseLong(bounds[1]); i++) {
                if (isInvalid(i)) {
                    sum += i;
                }
            }
        }
        System.out.print(sum);
    }

    public static boolean isInvalid(Long l) {
        String s = l.toString();
        if (s.length() % 2 == 1)
            return false;
        String firsthalf = s.substring(0, s.length() / 2);
        String secondhalf = s.substring(s.length() / 2);
        return firsthalf.equals(secondhalf);
    }
}