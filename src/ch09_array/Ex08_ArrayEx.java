package ch09_array;

import java.util.Scanner;

public class Ex08_ArrayEx {
    public static void main(String[] args) {
        /**
         * 스캐너로 입력 받은 숫자의 크기를 갖는 배열을 만들어 봅시다.
         * 예로 들어 5를 입력하면
         * 크기가 5인 배열이 만들어져야 함
         */
        int[] num = null;
        int numb, in;
        Scanner scanner = new Scanner(System.in);
        System.out.print("배열 크기를 정해주세요 : ");
        numb = scanner.nextInt();
        num = new int[numb];
        System.out.println("num 배열의 크기 : " + num.length);
        for(int i = 0; i < num.length; i++){
            System.out.print("num[" + i + "]입력 : ");
            in = scanner.nextInt();
        }
    }
}
