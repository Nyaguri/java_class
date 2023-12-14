package ch11_classes.ex1;

public class StudentRepository {
    public void method1() {
        System.out.println("StudentRepository.method1");
    }

    /**
     * method name : method2
     * parameter : String
     * return : x
     * 실행내용 : 전달 받은 매개변수 값 출력
     */

    public void method2(String str1, String str2) {
        System.out.println(str1 + str2);
        System.out.println("StudentRepository.method2");
    }

    public void method3() {
        System.out.println("StudentRepository.method3");
    }
}
