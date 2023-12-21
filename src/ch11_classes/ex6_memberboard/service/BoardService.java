package ch11_classes.ex6_memberboard.service;

import ch11_classes.ex6_memberboard.common.CommonVariables;

import java.util.Scanner;

public class BoardService {
    Scanner sc = new Scanner(System.in);
    int serv;
    public void boardMenu() {
        if (CommonVariables.loginEmail != null) { // while문으로 전체를 돌려버리자
            System.out.println("------------------------------------------------------------------------------------------------------------");
            System.out.println("1. 글 작성 | 2. 글 목록 | 3. 글 조회 | 4. 글 수정 | 5. 글 삭제 | 6. 검색 | 99. sample | 0. 메인메뉴");
            System.out.println("------------------------------------------------------------------------------------------------------------");
            System.out.print("선택 > ");
            serv = sc.nextInt();
            if (serv == 1) {
                // 호출할 문장
            } else if (serv == 2) {
                // 호출할 문장
            } else if (serv == 3) {
                // 호출할 문장
            } else if (serv == 4) {
                // 호출할 문장
            } else if (serv == 5) {
                // 호출할 문장
            } else if (serv == 6) {
                // 호출할 문장
            } else if (serv == 0) {
                // 호출할 문장
            }else {
                System.out.println("잘못 입력하였습니다. 다시 입력 바랍니다.");
            }
        } else {
            System.out.println("로그인 해주세요.");
        }
    }
}

