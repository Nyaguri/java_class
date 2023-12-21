package ch11_classes.ex6_memberboard.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CommentDTO {
    private Long id;
    private String boardId;
    private String commentWriter;
    private String commentContents;
    private String commentCreatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
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

    private static Long idValue = 0L;
    public CommentDTO(String boardId, String commentWriter, String commentContents) {
        this.id = idValue++;
        this.boardId = boardId;
        this.commentWriter = commentWriter;
        this.commentContents = commentContents;
        this.commentCreatedAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "CommentDTO{" +
                "id=" + id +
                ", boardId='" + boardId + '\'' +
                ", commentWriter='" + commentWriter + '\'' +
                ", commentContents='" + commentContents + '\'' +
                ", commentCreatedAt='" + commentCreatedAt + '\'' +
                '}';
    }
}
