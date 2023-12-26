package ch12_classes.ex3;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int serv = 0;
        // memberService 객체 선언
        MemberService memberService = new MemberService();

        while (run) {
            System.out.println("--------------------------------------------------------------------------------------------------------");
            System.out.println("1.회원가입 | 2.로그인 | 3.회원 목록 조회 | 4.회원 정보 수정 | 5.회원탈퇴 | 6.로그아웃 | 0.종료");
            System.out.println("--------------------------------------------------------------------------------------------------------");
            System.out.print("선택> ");
            serv = scanner.nextInt();
            if (serv == 1) {
                // 호출하는 문장
                memberService.membership();
            } else if (serv == 2) {
                // 호출하는 문장
                memberService.login();
            } else if (serv == 3) {
                // 호출하는 문장
                memberService.findAll();
            } else if (serv == 4) {
                // 호출하는 문장
                memberService.upDate();
            } else if (serv == 5) {
                // 호출하는 문장
                memberService.delete();
            } else if (serv == 6) {
                // 호출하는 문장
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
