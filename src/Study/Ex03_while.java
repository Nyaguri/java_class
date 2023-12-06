package study;

import java.util.Scanner;

public class Ex03_while {
    public static void main(String[] args) {
//        int i = 0;
//        while(true){
//            i++;
////            System.out.println(i);
//            if(i==10){
//                break;
//            }
//        }
//
//        boolean run = true;
//        int a = 0;
//        while(run){
//            a++;
//            System.out.println(a);
//            if(a==10){
//                run = false;
//            }
//        }


        boolean run = true;
        Scanner sc = new Scanner(System.in);

        while(run){
            System.out.println("메뉴 선택");
            int menu = sc.nextInt();
            switch(menu){
                case 1:
                    System.out.println("1번을 선택하셨습니다");
                    break;
                case 2:
                    System.out.println("2번을 선택하셨습니다");
                    break;
                case 3:
                    System.out.println("3번을 선택하셨습니다");
                    break;
                case 0:
                    System.out.println("종료합니다.");
                    run = false;
                    break;
                default:
                    System.out.println("잘못 선택하셨습니다.");
            }
        }






    }
}
