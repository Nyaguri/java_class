package ch12_classes.ex5;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankService bankService = new BankService();
        int serv;
        while (true) {
            System.out.println("---------------------------------------------------------------------------------------------------------");
            System.out.println("1. 신규 계좌 등록 | 2. 잔액 조회 | 3. 입금 | 4. 출금 | 5. 입출금 내역 조회 | 6. 계좌 이체 | 0. 종료");
            System.out.println("---------------------------------------------------------------------------------------------------------");
            System.out.print("선택 > ");
            serv = scanner.nextInt();
            if (serv == 1) {
                bankService.create();
            } else if (serv == 2) {
                bankService.balanceInquiry();
            } else if (serv == 3) {
                bankService.deposit();
            } else if (serv == 4) {
                bankService.withdraw();
            } else if (serv == 5) {
                bankService.history();
            } else if (serv == 6) {
                bankService.accountTransfer();
            } else if (serv == 0) {
                System.out.println("종료합니다");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }
}
