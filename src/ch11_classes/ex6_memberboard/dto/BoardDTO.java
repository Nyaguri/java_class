package ch11_classes.ex6_memberboard.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BoardDTO {
    private Long id;
    private String boardTitle;
    private String boardWriter;
    private String boardContents;
    private Long boardHits;
    private String boardCreatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardWriter() {
        return boardWriter;
    }

    public void setBoardWriter(String boardWriter) {
        this.boardWriter = boardWriter;
    }

    public String getBoardContents() {
        return boardContents;
    }

    public void setBoardContents(String boardContents) {
        this.boardContents = boardContents;
    }

    public Long getBoardHits() {
        return boardHits;
    }

    public void setBoardHits(Long boardHits) {
        this.boardHits = boardHits;
    }

    public String getBoardCreatedAt() {
        return boardCreatedAt;
    }

    public void setBoardCreatedAt(String boardCreatedAt) {
        this.boardCreatedAt = boardCreatedAt;
    }

    private static Long idValue = 1L;

    public BoardDTO(String boardTitle, String boardWriter, String boardContents, Long boardHits) {
        this.id = idValue++;
        this.boardTitle = boardTitle;
        this.boardWriter = boardWriter;
        this.boardContents = boardContents;
        this.boardHits = boardHits;
        this.boardCreatedAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "BoardDTO{" +
                "id=" + id +
                ", boardTitle='" + boardTitle + '\'' +
                ", boardWriter='" + boardWriter + '\'' +
                ", boardContents='" + boardContents + '\'' +
                ", boardHits=" + boardHits +
                ", boardCreatedAt='" + boardCreatedAt + '\'' +
                '}';
    }
}
