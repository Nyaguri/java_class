package ch10_class.ex2;

import ch10_class.ex2.Student;

public class StudentMain {
    public static void main(String[] args) {
        // Student 클래스 객체 선언
        Student student1 = new Student();
        // Student 클래스의 필드에 값 저장하기
        student1.StudentName = "학생1";
        student1.StudentMajor = "컴퓨터공학";
        student1.StudentMobile = "010-1111-1111";
        System.out.println("Student1.studentName = " + student1.StudentName);
        System.out.println("student1.studentMajor = " + student1.StudentMajor);
        System.out.println("student1.studentMobile = " + student1.StudentMobile);

        //
        Student student2 = new Student();
        student2.StudentName = "학생2";
        student2.StudentMajor = "경영학";
        student2.StudentMobile = "010-2222-2222";
    }
}
