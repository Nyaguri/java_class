package ch10_class.ex3;

public class Student {
    String StudentName;
    String StudentMajor;
    String StudentMobile;


    // 기본생성자
    public Student() {
        System.out.println("Student 기본생성자");
    }

    // 매개변수가 있는 생성자
    public Student(String StudentName) {
        System.out.println("name를 매개변수로 하는 생성자");
        System.out.println("StudentName = " + StudentName);
    }

    // 매개변수가 2개 있는 생성자
    public Student(String StudentName, String StudentMajor) {
        System.out.println("StudentName = " + StudentName + ", StudentMajor = " + StudentMajor);
    }

    // 이름, 학과, 전화번호를 매개변수로 하는 생성자
    public Student(String StudentName, String StudentMajor, String StudentMobile) {
        System.out.println("StudentName = " + StudentName + ", StudentMajor = " + StudentMajor + ", StudentMobile = " + StudentMobile);
    }

}
