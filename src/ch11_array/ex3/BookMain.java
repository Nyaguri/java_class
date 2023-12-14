package ch11_array.ex3;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {
        // Book 객체를 담기위한 bookList 객체 선언
        List<Book> bookList = new ArrayList<>();
        // 기본생성자로 Book 객체(book1) 생성 후 bookList 에 추가
        Book book1 = new Book();
        book1.setId(1L);
        book1.setBookTitle("전지적 독자 시점");
        book1.setBookAuthor("싱숑");
        book1.setBookPrice(12150);
        book1.setBookPublisher("문피아");
        bookList.add(book1);
        // 매개변수 생성자로 Book 객체(book2) 생성 후 bookList 에 추가
        Book book2 = new Book(2L, "테메레르", "나오미 노빅", 10800, "노블마인");
        bookList.add(book2);
        // for 를 이용하여 bookList 의 전체 데이터 출력
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("bookList = " + bookList.get(i));
        }
        // for each 를 이용하여 bookList 의 전체 데이터 출력
        for (Book book : bookList) {
            System.out.println("book = " + book);
        }
        // list 의 0번 인덱스에 담긴 책의 가격을 50000으로 변경
        bookList.get(0).setBookPrice(50000);
        // list 의 1번 인덱스에 담긴 출판사의 제목을 "안녕출판사"로 변경
        bookList.get(1).setBookPublisher("안녕출판사");
        // for 를 이용하여 bookList 의 전체 데이터 출력
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("bookList = " + bookList.get(i));
        }
        // for each 를 이용하여 bookList 의 전체 데이터 출력
        for (Book book : bookList) {
            System.out.println("book = " + book);
        }
    }
}
