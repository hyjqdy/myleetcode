package saima;

import java.util.Scanner;

public class GuShen {
    public static void main(String[] args) {
        int date;
        Scanner sc = new Scanner(System.in);
        date = sc.nextInt();

        int price = 1, priceDownDate = 3, priceDownNum = 1;
        for (int i = 2; i <= date; i++) {
            if (priceDownDate == i) {
                priceDownNum++;
                priceDownDate = (priceDownNum * priceDownNum + 3 * priceDownNum) / 2 + 1;
                price--;
            } else {
                price++;
            }
        }
        System.out.println(price);
    }
}
