package ch06_for;

public class Ex04_ForEx {
    public static void main(String[] args) {
        /**
         * 1부터 10까지의 합계를 출력
         * 출력 예
         * 1+2+3+4+5+6+7+8+9+10=55
         */
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("i = " + i);
            System.out.println("sum = " + sum);
        }
        System.out.println("1부터 10까지의 합계 = " + sum);
    }
}
