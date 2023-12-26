package ch12_classes.ex6_memberboard;

import ch12_classes.ex6_memberboard.service.BoardService;
import ch12_classes.ex6_memberboard.service.MemberService;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        BoardService boardService = new BoardService();
        Scanner sc = new Scanner(System.in);
        int serv;
        while (true) {
            System.out.println("======  회원관리  ======");
            System.out.println("------------------------------------------------------------------------------------------------------------");
            System.out.println("1. 회원가입 | 2. 로그인 | 3. 회원 목록 | 4. 회원 수정 | 5. 회원 탈퇴 | 6. 로그아웃 | 7. 게시판 메뉴 | 0. 종료");
            System.out.println("------------------------------------------------------------------------------------------------------------");
            System.out.print("선택 > ");
            serv = sc.nextInt();
            if (serv == 1) {
                memberService.signUp();
            } else if (serv == 2) {
                memberService.signIn();
            } else if (serv == 3) {
                memberService.list();
            } else if (serv == 4) {
                memberService.upDate();
            } else if (serv == 5) {
                memberService.delete();
            } else if (serv == 6) {
                memberService.logOut();
            } else if (serv == 7) {
                boardService.boardMenu();
            } else if (serv == 0) {
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println("잘못 입력 하셨습니다. 다시 입력 해주세요.");
            }
        }
    }
}
