package ch10_class.ex7;

import java.util.Scanner;
public class CalculatorMain {
    public static void main(String[] args) {
        /**
         * 실행하면 반복문으로 메뉴를 출력
         * 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈
         * 각 번호를 선택하면 Calculator 클래스에 있는 해당 메서드를 호출하여 결과를 출력함
         */
        int serv;
        int input;
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while (true) {
            System.out.println("------------------------------------------------------");
            System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 나눗셈 | 5. 종료");
            System.out.println("------------------------------------------------------");
            System.out.print("선택 > ");
            serv = scanner.nextInt();
            if(serv == 1) {
                calculator.sum(20, 10);
            } else if (serv == 2) {
                calculator.sub(20, 10);
            } else if (serv == 3) {
                int result = calculator.mul(20, 10);
                System.out.println("result = " + result);
            } else if(serv == 4) {
                System.out.println(calculator.div());
            } else {
                System.out.println("종료합니다");
                break;
            }
        }
    }
}
