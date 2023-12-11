package ch10_class.ex3;

import ch10_class.ex3.Student;

public class StudentMain {
    public static void main(String[] args) {
        // 기본생성자로 객체 선언
        Student student1 = new Student();

        // 매개변수가 있는 생성자로 객체 선언
        Student student2 = new Student("123");

        // 매개변수가 2개 있는 생성자로 객체 선언
        Student student3 = new Student("이름1", "체육학");

        // 이름, 학과, 전화번호를 매개변수로 하는 생성자로 객체 선언
        Student student4 = new Student("이름4", "역사학", "010-4444-4444");
    }
}
