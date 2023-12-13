package ch10_class.ex4;

import java.util.Arrays;

public class StudentMain {
    public static void main(String[] args) {
        // 기본생성자로 student1 객체 생성
        Student student1 = new Student();
        student1.studentName = "이름1";
        student1.studentNumber = "111111111";
        student1.studentMajor = "통계학";
        System.out.println("student1.studentName = " + student1.studentName + ", student1.studentNumber = " + student1.studentNumber + ", student1.studentMajor" + student1.studentMajor);
        
        // 매개변수 있는 생성자로 student2 객체 생성
        Student student2 = new Student("이름2", "20230526", "기계공학");
    }
}
