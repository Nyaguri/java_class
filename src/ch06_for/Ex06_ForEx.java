package ch06_for;


import java.util.Scanner;
public class Ex06_ForEx {
    public static void main(String[] args) {
        /**
         * 1부터 100까지의 숫자 중에서 3의 배수만 출력 하고 합계도 구하기
         */
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int end;
        int temp;
        System.out.print("끝 값을 입력하세요 : ");
        end = sc.nextInt();
        for (int i = 1; i <= end; i++) {
            if (i % 3 == 0) {
                temp = i;
                if (i < end - 1) {
                    System.out.print(i + " + ");
                    sum += i;
                } else {
                    System.out.println(i + " = " + sum);
                }

            }
        }
        System.out.println("3의 배수의 총합은 " + sum + " 입니다.");
    }
}


