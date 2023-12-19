package ch11_classes.ex4;

public class BoardDTO {
    /**
     * 필드
     * id
     * 글제목(boardTitle)
     * 작성자(boardWriter)
     * 내용(boardContents)
     * 비밀번호(boardPass)
     *
     * 생성자
     *
     * toString
     */
    private Long id;
    private String boardTitle;
    private String boardWriter;
    private String boardContents;
    private Long boardPass;
    private Long boardHits;
    private String createdAt;

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

    public Long getBoardPass() {
        return boardPass;
    }

    public void setBoardPass(Long boardPass) {
        this.boardPass = boardPass;
    }

    public Long getBoardHits() {
        return boardHits;
    }

    public void setBoardHits(Long boardHits) {
        this.boardHits = boardHits;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public BoardDTO() {

    }

    private static Long idvalue = 1L;
    private static Long Hits = 0L;
    public BoardDTO(String boardTitle, String boardWriter, String boardContents, Long boardPass) {
        this.id = idvalue++;
        this.boardTitle = boardTitle;
        this.boardWriter = boardWriter;
        this.boardContents = boardContents;
        this.boardPass = boardPass;
        this.boardHits = Hits;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "글 번호 : " + id + '\n' +
                "글 제목 : '" + boardTitle + '\n' +
                "작성자 : " + boardWriter + '\n' +
                "글 내용 : " + boardContents + '\n' +
                "비밀번호 : " + boardPass + '\n' +
                "조회수 : " + boardHits;
    }
}
