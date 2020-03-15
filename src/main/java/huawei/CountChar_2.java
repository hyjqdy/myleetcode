package huawei;

import java.util.Scanner;
import java.util.stream.IntStream;

public class CountChar_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String input = scan.nextLine();
            String target = scan.nextLine();
            int count = (int) IntStream.range(0, input.length()).filter(i -> target.equalsIgnoreCase(input.substring(i, i + 1))).count();
            System.out.println(count);
        }
    }
}
