package ch07_while;

import java.util.Scanner;

public class Ex08_WhileEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int serv; // 기능
        int pay = 0; // 잔액
        int m; // 출금 
        int loans; // 대출
        int bank; // 은행 선택
        int account; // 계좌 입력
        while (true) {
            System.out.println("----------------------------------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.이체 | 4.잔고 | 5,대출 | 6.종료");
            System.out.println("----------------------------------------------------------");
            System.out.print("선택 > ");
            serv = scanner.nextInt();
            if (serv == 1) {
                System.out.print("예금액 > ");
                pay = scanner.nextInt();
                System.out.println("현재 잔액은 " + pay + "입니다.");
            } else if (serv == 2) {
                System.out.print("출금액 > ");
                m = scanner.nextInt();
                if (m > pay) {
                    System.out.println("잔고가 부족 합니다.");
                } else {
                    pay -= m;
                    System.out.println("출금이 완료 되었습니다.");
                    System.out.println("현재 잔액은 " + pay + "입니다.");
                }
            } else if (serv == 3) {
                System.out.println("이체 하실 은행을 선택 해주세요 > ");
                System.out.println("011 = 농협 003 = 기업 004 = 국민");
                bank = scanner.nextInt();
                if (bank == 011) {
                    System.out.print("농협 은행 : ");
                    System.out.println("이체 하실 계좌 번호 > ");
                    account = scanner.nextInt();
                    System.out.println("이체 하실 금액 입력 > ");
                    pay = scanner.nextInt();
                    System.out.println("이체 되었습니다. 남은 잔액은 " + pay + "입니다.");
                }
            } else if (serv == 4) {
                System.out.println("현재 잔액은 " + pay + "입니다.");
            } else if (serv == 5) {
                System.out.println("대출 하실 금액 > ");
                loans = scanner.nextInt();
                System.out.println("대출 잔액은 " + loans + "입니다.");
                System.out.println("다음 달에 나갈 대출 이자는 " + (loans / 100) + "입니다.");
            } else {
                System.out.println("종료합니다.");
                break;
            }
        }
    }
}
