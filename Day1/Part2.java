import java.util.*;
import java.io.*;

public class Part2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("input.txt"));
        int current = 50;
        int count = 0;
        while (input.hasNextLine()) {
            String line = input.nextLine();
            int num = Integer.parseInt(line.substring(1));
            if (line.charAt(0) == 'L') {
                for (int i = 0; i < num; i++) {
                    current--;
                    if (current == 0) {
                        count++;
                    } else if (current < 0) {
                        current = 99;
                    }
                }
            } else {
                for (int i = 0; i < num; i++) {
                    current++;
                    if (current == 100) {
                        current = 0;
                    }
                    if (current == 0) {
                        count++;
                    }
                }
            }
        }

        System.out.println("Count: " + count);
    }
}
