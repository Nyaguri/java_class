package ch10_class.ex9;

public class StudentMain {
    public static void main(String[] args) {
        // 기본생성자로 Student 클래스 객체 만들고 setter를 이용하여 필드값 채우기
        Student student = new Student();
        student.setStudentName("이름1");
        student.setStudentNumber("11111111");
        student.setStudentMajor("기계공학");
        student.setStudentMobile("010-1111-1111");
        student.print();

        // 모든 필드를 매개변수로 하는 생성자로 Student 클래스 객체 만들기
        Student student1 = new Student("이름2", "22222222", "자동차 튜닝학", "010-2222-2222");

        // 각각의 객체에서 print 메서드 호출하여 필드값 출력
        student1.print();

        System.out.println("student = " + student);
        System.out.println("student1 = " + student1);
    }
}
