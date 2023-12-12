package ch10_class.ex5;

public class BookMain {
    public static void main(String[] args) {
        // 책 정보는 시중에 있는 실제 책으로 해봅시다.

        // 기본 생성자로 객체 만들고 필드 값 채우기
        Book book1 = new Book();
        book1.bookTitle = "전지적 독자 시점";
        book1.bookAuthor = "싱숑";
        book1.bookPublisher = "문피아";
        book1.isbn = "9788934967354";
        book1.bookPrice = "12150원";

        // 매개변수 2개 있는 생성자로 객체 만들고 필드 값 채우기
        Book book2 = new Book("네크로멘서 학교의 소환천재", "일제사격");
        book2.bookPublisher = "kwbooks";
        book2.isbn = "1231231231231";
        book2.bookPrice = "12150원";

        // 모든 매개변수 있는 생성자로 객체 만들고 필드 값 채우기
        Book book3 = new Book("테메레르", "나오미 노빅, 공보경", "노블마인", "9788901068381", "10800원");
    }
}
