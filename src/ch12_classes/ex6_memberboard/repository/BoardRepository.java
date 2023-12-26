package ch12_classes.ex6_memberboard.repository;

import ch12_classes.ex6_memberboard.common.CommonVariables;
import ch12_classes.ex6_memberboard.dto.BoardDTO;

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
        BoardDTO boardDTO =  null;
        for (BoardDTO boardDTO1 : boardDTOList) {
            if (id.equals(boardDTO1.getId())) {
                boardDTO = boardDTO1;
            }
        }
        return boardDTO;
    }

    public void hitsUp(Long id) {
        for (BoardDTO boardDTO : boardDTOList) {
            if (id.equals(boardDTO.getId())) {
                Long hits = boardDTO.getBoardHits();
                boardDTO.setBoardHits(++hits);
            }
        }
    }

    public boolean update(String boardTitle, String boardContents) {
        boolean result = false;
        for (BoardDTO boardDTO : boardDTOList) {
            if (boardDTO.getBoardWriter().equals(CommonVariables.loginEmail)) {
                boardDTO.setBoardTitle(boardTitle);
                boardDTO.setBoardContents(boardContents);
                result = true;
            }
        }
        return result;
    }

    public boolean delete() {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (boardDTOList.get(i).getBoardWriter().equals(CommonVariables.loginEmail)) {
                boardDTOList.remove(i);
                result = true;
            }
        }
        return result;
    }

    public List<BoardDTO> search(String boardTitle) {
        List<BoardDTO> boardDTOS = new ArrayList<>();
        for (BoardDTO dto : boardDTOList) {
            if (dto.getBoardTitle().contains(boardTitle)) {
                boardDTOS.add(dto);
            }
        }
        return boardDTOS;
    }
}
