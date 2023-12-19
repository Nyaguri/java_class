package ch11_classes.ex4;

import java.util.List;
import java.util.Scanner;

public class BoardService {
    Scanner scanner = new Scanner(System.in);
    BoardRepository boardRepository = new BoardRepository();

    public void write() {
        System.out.print("글 제목 : ");
        String boardTitle = scanner.next();
        System.out.print("작성자 : ");
        String boardWriter = scanner.next();
        System.out.print("내용 : ");
        scanner.nextLine();
        String boardContents = scanner.nextLine();
        System.out.print("비밀번호 : ");
        Long boardPass = scanner.nextLong();
        scanner.nextLine();
        BoardDTO boardDTO = new BoardDTO(boardTitle, boardWriter, boardContents, boardPass);
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
        Long id = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findById(id);
        boardRepository.hitsup(id);
        if (boardDTO != null) {
            System.out.println(boardDTO);
        } else {
            System.out.println("조회 결과가 없습니다.");
        }
    }

    public void refact() {
        System.out.println("수정 할 글 : ");
        Long id = scanner.nextLong();
        System.out.println("비밀번호 : ");
        Long boardPass = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findById2(id, boardPass);
        if (boardDTO != null) {
            System.out.print("수정 할 제목 : ");
            String boardTitle = scanner.next();
            System.out.print("수정 할 내용 : ");
            String boardContents = scanner.nextLine();
            scanner.nextLine();
            boolean updateResult = boardRepository.update(id, boardTitle, boardContents);
            if (updateResult) {
                System.out.println("수정 성공");
            } else {
                System.out.println("수정 실패");
            }
        }else {
            System.out.println("비밀번호가 틀렸습니다.");
        }
    }


    public void delete() {
        System.out.print("삭제 할 글 : ");
        Long id = scanner.nextLong();
        System.out.print("비밀번호 : ");
        Long boardPass = scanner.nextLong();
        boolean result = boardRepository.delete(id, boardPass);
        if (result) {
            System.out.println("삭제 성공");
        } else {
            System.out.println("비밀번호가 틀렸습니다.");
        }
    }


    public void search() {
        System.out.print("검색어: ");
        String bookTitle = scanner.next();
        List<BoardDTO> searchList = boardRepository.search(bookTitle);
        if (searchList.size() > 0) {
            System.out.println("검색 결과");
            // 출력 전용 메서드로 검색결과 리스트를 넘겨줌
            listPrint(searchList);
        } else {
            System.out.println("검색결과가 없습니다!");
        }
    }

    // 목록 출력 전용 메서드
    // findById, search 메서드로 부터 list 데이터를 전달 받아서 출력을 하는 메서드
    private void listPrint(List<BoardDTO> boardDTOList) {
        System.out.println("id\t" + "title\t" + "writer\t" + "hits\t" + "date\t");
        for (BoardDTO boardDTO: boardDTOList) {
            System.out.println(boardDTO.getId() + "\t" + boardDTO.getBoardTitle() + "\t" +
                    boardDTO.getBoardWriter() + "\t" + boardDTO.getBoardHits() + "\t" +
                    boardDTO.getCreatedAt() + "\t");
        }
    }
}


