package huawei;

import java.util.Scanner;

public class ZhiShuYinZi_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();

        if (num < 2) {
            System.out.println(num);
        }

        for (int i = 2; i <= num; ) {
            if (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            } else {
                i++;
            }
        }
    }
}
