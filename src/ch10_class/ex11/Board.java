package ch10_class.ex11;

import java.util.Objects;

public class Board {
    /**
     * 게시글 클래스
     * <p>
     * 필드
     * 글번호(id) - Long 타입
     * 제목(boardTitle)
     * 작성자(boardWriter)
     * 내용(boardContents)
     * 조회수(boardHits)
     * <p>
     * 필드에 대한 getter/setter
     * <p>
     * 생성자 2가지
     * <p>
     * toString method
     * <p>
     * 글조회 method
     * name: findById
     * parameter: id
     * return: x
     * 실행내용
     * main으로부터 글번호를 전달받고 글번호가 일치하면 해당 게시글의 내용을
     * print로 출력해준다.
     * 단 출력하기 전에 조회수 값을 1 증가 시켜야 한다.
     */
    private Long id;
    private String boardTitle;
    private String boardWriter;
    private String boardContents;
    private int boardHits;

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

    public int getBoardHits() {
        return boardHits;
    }

    public void setBoardHits(int boardHits) {
        this.boardHits = boardHits;
    }

    public Board() {

    }

    public Board(Long id, String boardTitle, String boardWriter, String boardContents, int boardHits) {
        this.id = id;
        this.boardTitle = boardTitle;
        this.boardWriter = boardWriter;
        this.boardContents = boardContents;
        this.boardHits = boardHits;
    }

    @Override
    public String toString() {
        return "글 번호 : " + id + "\n" +
                "글 제목 : " + boardTitle + "\n" +
                "작성자 : " + boardWriter + "\n" +
                "글 내용 : " + boardContents + "\n" +
                "조회수 : " + boardHits;
    }

    public void findById(Long id) {
        this.id = id;
        if (Objects.equals(getId(), id)) {
            boardHits++;
        }
    }
}
