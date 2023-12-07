package ch08_string;

import java.util.Scanner;

public class Ex02_StringEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1;
        System.out.println("메세지를 입력 하세요.");
        System.out.println("프로그램을 종료 하려면 '종료'를 입력 하세요.");
        while (true) {
            System.out.print(">");
            str1 = scanner.next();
            if (str1.equals("종료")) {
                break;
            }
            System.out.println(str1);
        }
    }
}
