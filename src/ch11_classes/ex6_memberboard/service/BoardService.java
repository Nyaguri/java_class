package ch11_classes.ex6_memberboard.service;

import ch11_classes.ex6_memberboard.common.CommonVariables;
import ch11_classes.ex6_memberboard.dto.BoardDTO;
import ch11_classes.ex6_memberboard.repository.BoardRepository;

import java.util.List;
import java.util.Scanner;

public class BoardService {
    BoardRepository boardRepository = new BoardRepository();
    Scanner sc = new Scanner(System.in);
    int serv;

    public void boardMenu() {
        while (true) {
            if (CommonVariables.loginEmail != null) {
                System.out.println("------------------------------------------------------------------------------------------------------------");
                System.out.println("1. 글 작성 | 2. 글 목록 | 3. 글 조회 | 4. 글 수정 | 5. 글 삭제 | 6. 검색 | 99. sample | 0. 메인메뉴");
                System.out.println("------------------------------------------------------------------------------------------------------------");
                System.out.print("선택 > ");
                serv = sc.nextInt();
                if (serv == 1) {
                    write();
                } else if (serv == 2) {
                    list();
                } else if (serv == 3) {
                    findById();
                } else if (serv == 4) {
                    reFact();
                } else if (serv == 5) {
                    delete();
                } else if (serv == 6) {
                    search();
                } else if (serv == 0) {
                    // 호출할 문장
                    break;
                } else {
                    System.out.println("잘못 입력하였습니다. 다시 입력 바랍니다.");
                }
            } else {
                System.out.println("로그인 해주세요.");
                break;
            }
        }
    }

    public void write() {
        System.out.print("글 제목 : ");
        String boardTitle = sc.next();
        String boardWriter = CommonVariables.loginEmail;
        System.out.print("글 내용 : ");
        String boardContents = sc.next();
        BoardDTO boardDTO = new BoardDTO(boardTitle, boardWriter, boardContents);
        boolean result = boardRepository.write(boardDTO);
        if (result) {
            System.out.println("등록 성공");
        } else {
            System.out.println("등록 실패");
        }
    }

    public void list() {
        List<BoardDTO> boardDTOList = boardRepository.list();
        listPrint(boardDTOList);
    }

    public void findById() {
        System.out.print("조회 할 글 : ");
        Long id = sc.nextLong();
        BoardDTO boardDTO = boardRepository.findById(id);
        boardRepository.hitsUp(id);
        if (boardDTO != null) {
            System.out.println(boardDTO);
        } else {
            System.out.println("조회 결과가 없습니다.");
        }
    }

    public void reFact() {
        System.out.print("수정 할 글 : ");
        Long id = sc.nextLong();
        BoardDTO boardDTO = boardRepository.findById(id);
        if (boardDTO != null) {
            System.out.print("수정 할 제목 : ");
            String boardTitle = sc.next();
            System.out.print("수정 할 내용 : ");
            String boardContents = sc.next();
            boolean result = boardRepository.update(boardTitle, boardContents);
            if (result) {
                System.out.println("수정 성공");
            } else {
                System.out.println("작성자만 수정 가능 합니다.");
            }
        }
    }


    public void delete() {
        System.out.print("삭제 할 글 : ");
        Long id = sc.nextLong();
        BoardDTO boardDTO = boardRepository.findById(id);
        if (boardDTO != null) {
            boolean result = boardRepository.delete();
            if (result) {
                System.out.println("삭제 완료");
            } else {
                System.out.println("작성자만 삭제 가능합니다.");
            }
        }
    }

    public void search() {
        System.out.print("검색어 : ");
        String boardTitle = sc.next();
        List<BoardDTO> searchList = boardRepository.search(boardTitle);
        if (!searchList.isEmpty()) {
            System.out.println("검색 결과 : ");
            listPrint(searchList);
        }else {
            System.out.println("검색 결과가 없습니다.");
        }
    }


    private void listPrint(List<BoardDTO> boardDTOList) {
        System.out.println("id\t" + "title\t" + "writer\t" + "hits\t" + "date\t");
        for (BoardDTO boardDTO : boardDTOList) {
            System.out.println(boardDTO.getId() + "\t" + boardDTO.getBoardTitle() + "\t" +
                    boardDTO.getBoardWriter() + "\t" + boardDTO.getBoardHits() + "\t" +
                    boardDTO.getBoardCreatedAt() + "\t");
        }
    }
}


