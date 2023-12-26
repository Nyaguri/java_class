package ch12_classes.ex4;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {

    private static List<BoardDTO> boardDTOList = new ArrayList<>();
    public boolean write(BoardDTO boardDTO) {
        return boardDTOList.add(boardDTO);
    }

    public List<BoardDTO> list() {
        return boardDTOList;
    }

    public BoardDTO findById(Long id) {
        BoardDTO boardDTO = null;
        for (BoardDTO boardDTO1 : boardDTOList) {
            if (id.equals(boardDTO1.getId())) {
                boardDTO = boardDTO1;
            }
        }
        return boardDTO;
    }

    public BoardDTO findById2(Long id, Long boardPass) {
        BoardDTO boardDTO = null;
        for (BoardDTO boardDTO1 : boardDTOList) {
            if (id.equals(boardDTO1.getId()) && boardPass.equals(boardDTO1.getBoardPass())) {
                boardDTO = boardDTO1;
            }
        }
        return boardDTO;
    }

    public void hitsup(Long id) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                Long Hits = boardDTOList.get(i).getBoardHits();
                boardDTOList.get(i).setBoardHits(++Hits);
            }
        }
    }

    public boolean update(Long id, String boardTitle, String boardContents) {
        boolean result =  false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                boardDTOList.get(i).setBoardTitle(boardTitle);
                boardDTOList.get(i).setBoardContents(boardContents);
                result = true;
            }
        }
        return result;
    }

    public boolean delete(Long id, Long boardPass) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId()) && boardPass.equals(boardDTOList.get(i).getBoardPass())) {
                boardDTOList.remove(i);
                result = true;
            }
        }
        return result;
    }

    public List<BoardDTO> search(String boardTitle) {
        List<BoardDTO> boardDTOS = new ArrayList<>();
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (boardDTOList.get(i).getBoardTitle().contains(boardTitle)) {
                BoardDTO boardDTO = boardDTOList.get(i);
                boardDTOS.add(boardDTO);
            }
        }
        return boardDTOS;
    }
}