package ch13_map.ex03;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int serv;
        MemberService memberService = new MemberService();

        while (true) {
            System.out.println("--------------------------------------------------------------------------------------------------------");
            System.out.println("1.회원가입 | 2.로그인 | 3.회원 목록 조회 | 4.회원 정보 수정 | 5.회원탈퇴 | 6.로그아웃 | 0.종료");
            System.out.println("--------------------------------------------------------------------------------------------------------");
            System.out.print("선택> ");
            serv = scanner.nextInt();
            if (serv == 1) {
                memberService.signUp();
            } else if (serv == 2) {
                memberService.login();
            } else if (serv == 3) {
                memberService.findAll();
            } else if (serv == 4) {
                memberService.update();
            } else if (serv == 5) {
                memberService.delete();
            } else if (serv == 6) {
                memberService.logout();
            } else if (serv == 0) {
                System.out.println("종료합니다");
                break;
            }else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }
}
