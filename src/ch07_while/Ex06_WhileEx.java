package ch07_while;

import java.util.Scanner;

public class Ex06_WhileEx {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int avg, input, sum = 0, num = 0;
//        System.out.println("정수를 입력하고 마지막에 0을 입력하세요 : ");
//        while ((input = scanner.nextInt()) != 0) {
//            sum += input;
//            num++;
//        }
//        avg = sum / num;
//        System.out.println("입력한 숫자는 " + num + " 개 입니다.");
//        System.out.println("평균은 " + avg + " 입니다.");






        Scanner scanner = new Scanner(System.in);
        int avg, input, sum = 0, num = 0;
            System.out.println("정수를 입력하고 마지막에 0을 입력하세요 : ");
        while((input = scanner.nextInt()) != 0){
            sum += input;
            num++;
        }
        avg = sum / num;
        System.out.println("입력한 숫자는 " + num + " 합계는 " + sum + ", 평균은 " + avg + "입니다.");
    }
}
