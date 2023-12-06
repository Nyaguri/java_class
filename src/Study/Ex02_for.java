package study;

public class Ex02_for {
    public static void main(String[] args) {
//        int dan = 2;
        for(int dan=2; dan<=9; dan++){
            for(int i=1; i<=9; i++){
//                System.out.println(dan+"*"+i+"="+(dan*i));
            }
        }


        for(int i=0; i<5; i++){
            for(int k=1; k<5-i; k++){
                System.out.print(" ");
            }
            for(int j=0; j<i*2+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
