package ch09_array;
import java.util.Scanner;

public class Ex05_ArrayEx {
    public static void main(String[] args) {
        /**
         * 거스름 돈 계산 하기
         * 필요한 거스름 돈을 입력했을 때 각 동전 별로 몇 개가 필요한지 계산
         * 예)
         *        170 이라고 입력하면
         *        100원 1개
         *        50원 1개
         *        10원 2개
         *
         *        780 이라고 입력하면
         *        500원 1개
         *        100원 2개
         *        50원 1개
         *        10원 3개
         *
         */
        int[] coin = {500, 100, 50, 10};
        int[] cnt = new int [4];
        int money;
        Scanner scanner = new Scanner(System.in);
        money = scanner.nextInt();
        for (int i = 0; i < coin.length; i++) {
            cnt[i] = money / coin[i];
            money %= coin[i];
            System.out.println(coin[i] + "원 동전 " + cnt[i] + "개");
        }
    }
}
