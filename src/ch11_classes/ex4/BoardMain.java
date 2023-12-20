package ch11_classes.ex4;

import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BoardService boardService = new BoardService();
        boolean run = true;
        int serv = 0;
        while (run) {
            System.out.println("--------------------------------------------------------------------------------------------------------");
            System.out.println("1. 글 작성 | 2. 글 목록 | 3. 글 조회 | 4. 글 수정 | 5. 글 삭제 | 6. 검색 | 7. 캐스트데이터 | 0.종료");
            System.out.println("--------------------------------------------------------------------------------------------------------");
            System.out.print("선택 > ");
            serv = scanner.nextInt();
            if (serv == 1) {
                // 호출 할 문장
                boardService.write();
            } else if (serv == 2) {
                // 호출 할 문장
                boardService.list();
            } else if (serv == 3) {
                // 호출 할 문장
                boardService.findById();
            } else if (serv == 4) {
                // 호출 할 문장
                boardService.refact();
            } else if (serv == 5) {
                // 호출 할 문장
                boardService.delete();
            } else if (serv == 6) {
                // 호출 할 문장
                boardService.search();
            } else if (serv == 7) {
                boardService.testData();
            } else if (serv == 0) {
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
            }
        }
    }
}
