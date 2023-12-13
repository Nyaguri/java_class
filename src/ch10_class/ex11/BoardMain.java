package ch10_class.ex11;

import java.util.Objects;
import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {
        /**
         * 메뉴
         * 1. 글작성(매개변수 있는 생성자이용)
         *      글작성 정보는 스캐너로 받음. 글번호도 같이 입력함.
         * 2. 글조회
         *      글번호를 입력 받고 Board 클래스의 findById로 글번호를 넘긴다.
         * 3. 종료
         */
        int serv;
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("1. 글 작성 | 2. 글 조회 | 3. 종료");
            System.out.println("-------------------------------------");
            System.out.print("선택 > ");
            serv = scanner.nextInt();
            if (serv == 1) {
                System.out.print("작성하실 글 번호 : ");
                scanner.nextLine();
                board.setId(scanner.nextLong());
                System.out.print("작성자 이름 : ");
                scanner.nextLine();
                board.setBoardWriter(scanner.next());
                System.out.print("작성하실 글 제목 : ");
                scanner.nextLine();
                board.setBoardTitle(scanner.nextLine());
                System.out.print("작성하실 글 내용 : ");
                board.setBoardContents(scanner.nextLine());
                System.out.print("등록 하실거면 Enter");
                scanner.nextLine();
            } else if (serv == 2) {
                System.out.print("조회하실 글 번호 : ");
//                board.findById(scanner.nextLong());
                Long id = scanner.nextLong();
                board.findById(id);
                System.out.println(board);
            } else if (serv == 3) {
                System.out.println("종료합니다");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다 다시 입력해주세요");
            }
        }
    }
}
