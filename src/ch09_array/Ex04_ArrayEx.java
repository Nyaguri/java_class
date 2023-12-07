package ch09_array;

import java.util.Scanner;

public class Ex04_ArrayEx {
    public static void main(String[] args) {
        int num[] = {5, 2, 1, 3, 4, 7, 6, 9, 10, 8};
        /**
         * 위와 같은 배열이 있을 때 1 ~ 10 사이의 숫자 중에서 하나를
         * 입력 했을 때 그 숫자가 몇 번 Index 에 있는지 출력
         */
        Scanner scanner = new Scanner(System.in);
        int numb = 0;
        System.out.print("숫자 : ");
        numb = scanner.nextInt();
        for (int i = 0; i < num.length; i++) {
            if (num[i] == numb) {
                System.out.println(numb + "는 " + i + " 번 Index 에 있습니다.");
            }
        }
    }
}
