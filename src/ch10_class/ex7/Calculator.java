package ch10_class.ex7;

import java.util.Scanner;

public class Calculator {
    /**
     * 덧셈 메서드
     * method name: sum
     * parameter: int 타입 2개
     * return: x
     * 실행내용
     *  - 매개변수로 전달 받은 2개 값의 합을 출력
     */

    /**
     * 뺄셈 메서드
     * method name: sub
     * parameter: int 타입 2개
     * return: x
     * 실행내용
     *  - 매개변수로 전달 받은 2개 값의 차를 출력
     */

    /**
     * 곱셈 메서드
     * method name: mul
     * parameter: int 타입 2개
     * return: int 타입
     * 실행내용
     *  - 매개변수로 전달 받은 2개 값의 곱 결과를 리턴
     */

    /**
     * 나눗셈 메서드
     * method name: div
     * parameter: 없음
     * return: int 타입
     * 실행내용
     *  - 스캐너로 나눗셈에 필요한 정수 2개를 입력받음
     *  - 나눗셈 결과를 리턴
     */
    public void sum(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public void sub(int num3, int num4) {
        System.out.println(num3 - num4);
    }

    public int mul(int num5, int num6) {
        return num5 * num6;
    }

    public int div() {
        Scanner scanner = new Scanner(System.in);
        int numb1 = scanner.nextInt();
        int numb2 = scanner.nextInt();
        return numb1 / numb2;
    }
}
