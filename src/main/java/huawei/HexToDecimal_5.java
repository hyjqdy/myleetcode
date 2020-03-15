package huawei;

import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

public class HexToDecimal_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('0', 0);
        map.put('1', 1);
        map.put('2', 2);
        map.put('3', 3);
        map.put('4', 4);
        map.put('5', 5);
        map.put('6', 6);
        map.put('7', 7);
        map.put('8', 8);
        map.put('9', 9);
        map.put('A', 10);
        map.put('B', 11);
        map.put('C', 12);
        map.put('D', 13);
        map.put('E', 14);
        map.put('F', 15);

        while (scanner.hasNext()) {
            String hex = scanner.next().replaceFirst("0x", "").toUpperCase();
            int length = hex.length();
            int sum = IntStream.range(0, length).map(i -> (int) (map.get(hex.charAt(i)) * Math.pow(16, length - 1 - i))).sum();
            System.out.println(sum);
        }
    }
}
