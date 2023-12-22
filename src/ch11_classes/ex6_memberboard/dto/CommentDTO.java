package ch11_classes.ex6_memberboard.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CommentDTO {
    private Long id;
    private Long boardId;
    private String commentWriter;
    private String commentContents;
    private String commentCreatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBoardId() {
        return boardId;
    }

    public void setBoardId(Long boardId) {
        this.boardId = boardId;
    }

    public String getCommentWriter() {
        return commentWriter;
    }

    public void setCommentWriter(String commentWriter) {
        this.commentWriter = commentWriter;
    }

    public String getCommentContents() {
        return commentContents;
    }

    public void setCommentContents(String commentContents) {
        this.commentContents = commentContents;
    }

    public String getCommentCreatedAt() {
        return commentCreatedAt;
    }

    public void setCommentCreatedAt(String commentCreatedAt) {
        this.commentCreatedAt = commentCreatedAt;
    }

    private static Long idValue = 1L;
    private static Long BoardId = 1L;
    public CommentDTO(String commentWriter, String commentContents) {
        this.id = idValue++;
        this.boardId = BoardId++;
        this.commentWriter = commentWriter;
        this.commentContents = commentContents;
        this.commentCreatedAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "id : " + id + "\n" +
                "글 번호 : " + boardId + "\n" +
                "작성자 : " + commentWriter + "\n" +
                "댓글 내용 : " + commentContents + "\n" +
                "작성 시간" + commentCreatedAt;
    }
}
