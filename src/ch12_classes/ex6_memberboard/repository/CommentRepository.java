package ch12_classes.ex6_memberboard.repository;

import ch12_classes.ex6_memberboard.dto.CommentDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommentRepository {
    private static List<CommentDTO> commentDTOList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int serv;

    public boolean comment(CommentDTO commentDTO) {
        return commentDTOList.add(commentDTO);
    }

    public List<CommentDTO> list() {
        return commentDTOList;
    }
}
