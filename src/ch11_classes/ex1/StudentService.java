package ch11_classes.ex1;

public class StudentService {
    /**
     *
     */
    StudentRepository studentRepository = new StudentRepository();
    public void method1() {
        System.out.println("studentService.method1");
        // Repository의 method1 호출
        studentRepository.method1();
    }

    public void method2() {
        System.out.println("studentService.method2");
        String str1 = "집에 가고 싶다";
        String str2 = " 갈꾸야 보내줘어어어어어";
        studentRepository.method2(str1, str2);
    }

    public void method3() {
        System.out.println("studentService.method3");
    }
}
