package ch06_for;

public class Ex08_NestedFor {
    public static void main(String[] args) {
        for(int i = 2; i <= 9; i++){
            System.out.println("[====="+i+"단=====]");
            for(int j = 1; j <= 9; j++){
                System.out.println("  "+i+ " X " +j+ " = " +(i * j));
//                System.out.print("\t"); = 문장 사이에 적당한 간격을 낼 때
//                System.out.print("\n"); = 줄 바꿀 때
            }
        }
    }
}
