package ch15_interface.ex02;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int serv;
        MemberService memberService = new MemberService();

        while (true) {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("1.회원가입 | 2.로그인 | 3.목록조회 | 4.정보수정 | 5.탈퇴 | 6.로그아웃 | 0.종료");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.print("선택> ");
            serv = scan.nextInt();
            if (serv == 1) {
                memberService.save();
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
                break;
            }
        }
    }
}