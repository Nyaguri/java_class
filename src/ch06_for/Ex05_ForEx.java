package ch06_for;

import java.util.Scanner;

public class Ex05_ForEx {
    public static void main(String[] args) {
        /**
         * 두 개의 정수를 입력 받아서 시작값부터 끝값까지의 합계 출력
         * 입력 예
         *  시작값: 110
         *   끝값: 555
         * 출력 예
         *   110 부터 555 까지의 합은 000 입니다.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력해주세요");
        int a = scanner.nextInt();
        System.out.println("두번째 숫자를 입력해주세요");
        int b = scanner.nextInt();
        int sum = 0;
        for(int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(a + " 부터 " + b + " 까지의 합은 " + sum + " 입니다.");
    }
}
