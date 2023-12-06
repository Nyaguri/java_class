package ch07_while;

public class Ex07_WhileEx {
    public static void main(String[] args) {
        /**
         * 1 + (-2) + 3 + (-4) + 5 + (-6) ~~~
         * 처럼 계산을 했을 때 합계가 100이 됐을 때의 슷자를 출력
         * 정답 ; 199
         */
        int sum = 0;
        // 1, 2, 3, 4, 5 ~~~
        int cnt = 1;
        // 1, -2, 3, -4, 5, -6 ~~~
        int num = 0;
        // 부호형 변수
        int s = 1;
        boolean run = true;
        while (run) {
            sum += num;
            if(sum >= 100){
                run = false;
            }else {
            num = s * cnt;
            s = -s; // 1, -1, 1, -1
            cnt++;
            }
//            System.out.println("num, s, cnt" + num + s + cnt);
        }
        System.out.println(sum);
        System.out.println(num);
    }
}
