package ch09_array;

import java.util.Scanner;

public class Ex06_ArrayEx {
    public static void main(String[] args) {
        /**
         * 크기가 5인 정수형 배열을 선언하고
         * 스캐너로 배열에 값을 저장한 뒤
         * 입력된 값 중에서 가장 큰 값을 출력
         */
        int[] num = new int[5];
        int max = 0;
        int min = 2147483647;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("최대값은 " + max + " 최소값은 " + min);
    }
}

