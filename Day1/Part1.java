import java.util.*;
import java.io.*;

public class Part1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("input.txt"));
        int current = 50;
        int count = 0;
        while (input.hasNextLine()) {
            String line = input.nextLine();
            int num = Integer.parseInt(line.substring(1));
            if (line.charAt(0) == 'L') {
                current -= num;
                if (current < 0) {
                    current = current % 100;
                }
            } else {
                current += num;
                if (current > 99) {
                    current = current % 100;
                }
            }
            if (current == 0)
                count++;
        }

        System.out.println("Count: " + count);
    }
}
