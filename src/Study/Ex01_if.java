package study;

public class Ex01_if {
    public static void main(String[] args) {
//        조건문 if : 조건이 참일 때 실행
//        if(조건문){
//          실행문;
//        }
        int a = 40;
        int b = 30;
        int c = 20;

        if(a>b){
            System.out.println("a는 b보다 크다");
            if(a>c){
                System.out.println("a가 제일 크다.");
            }else{
                System.out.println("c가 제일 크다");
            }
        }else if(b>a){
            System.out.println("b가 a보다 크다");
            if(b>c){
                System.out.println("b가 제일 크다");
            }else{
                System.out.println("");
            }
        }

    }
}
