package ch11_classes.ex1;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int serv = 0;
        StudentService studentService = new StudentService();
        //

        while (run) {
            System.out.println("---------------------------------------------------------------------");
            System.out.println("1. method1 호출 | 2. method2 호출 | 3. method3 호출 | 종료");
            System.out.println("---------------------------------------------------------------------");
            System.out.print("선택 > ");
            serv = scanner.nextInt();
            if (serv == 1) {
                System.out.println("메서드 호출 전");
                studentService.method1();
                System.out.println("메서드 호출 후");
            } else if (serv == 2) {
                System.out.println("메서드 호출 전");
                studentService.method2();
                System.out.println("메서드 호출 후");
            } else if (serv == 3) {

            } else if (serv == 4) {

            }else {

            }
        }
    }
}
