package ch07_while;

import java.util.Scanner;

public class Ex05_WhileEx {
    public static void main(String[] args) {
        /**
         * random() 메서드를 이용해서 1 ~ 100 사이의 숫자를 하나 만들고
         * 반복문 안에서 해당 숫자를 맞출 때까지 계속 숫자를 입력 받도록 하고
         * 숫자를 맞추면 종료하고 몇 번만에 맞췄는지를 출력헤줌
         */
        Scanner scanner = new Scanner(System.in);
        int i = (int) (Math.random() * 100) + 1;;
        int answer;
        int t = 0;
        while (true) {
            System.out.print("1부터 100까지의 숫자를 입력하세요 : ");
            answer = scanner.nextInt();
            if(answer == i){
                t++;
                System.out.println("맞췄습니다.");
                System.out.println("시도 횟수는 " + t + " 입니다.");
                break;
            }else if(answer > i){
                System.out.println("Down!");
                t++;
            }else if(answer < i){
                System.out.println("Up!");
                t++;
            }
        }

    }
}
