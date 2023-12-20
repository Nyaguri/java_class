package ch11_classes.ex5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class BankService {
    BankRepository bankRepository = new BankRepository();
    Scanner scanner = new Scanner(System.in);
    int serv1 = 0;

    public void create() {
        boolean checkResult;
        String accountNumber;
        System.out.print("이름 : ");
        String clientName = scanner.next();
        do {
            System.out.print("계좌번호 : ");
            accountNumber = scanner.next();
            checkResult = bankRepository.accountCheck(accountNumber);
            if (checkResult) {
                System.out.println("사용 가능한 계좌번호 입니다.");
            } else {
                System.out.println("이미 사용중인 계좌번호 입니다. 다시 입력 해주세요.");
            }
        } while (!checkResult);
        System.out.print("계좌 비밀번호 : ");
        String clientPass = scanner.next();
        ClientDTO clientDTO = new ClientDTO(clientName, accountNumber, clientPass);
        boolean result1 = bankRepository.create(clientDTO);
        if (result1) {
            System.out.println("계좌 등록 성공");
        } else {
            System.out.println("계좌 등록 실패");
        }
    }

    public void balanceInquiry() {
        System.out.print("계좌번호 : ");
        String accountNumber = scanner.next();
        boolean result = bankRepository.balanceInquiry(accountNumber);
        if (result) {
        } else {
            System.out.println("존재하지 않는 계좌 번호입니다.");
        }
    }

    public void deposit() {
        boolean run = true;
        do {
            System.out.print("계좌번호 : ");
            String accountNumber = scanner.next();
            boolean result = bankRepository.accountCheck2(accountNumber);
            if (result) {
                System.out.print("입금할 금액 : ");
                Long deposit = scanner.nextLong();
                String clientCreatedAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd,HH:mm:ss"));
                bankRepository.deposit(accountNumber, deposit, clientCreatedAt);
                run = false;
            } else {
                System.out.println("없는 계좌번호 입니다.");
            }
        } while (run);
    }

    public void withdraw() {
        boolean run = true;
        do {
            System.out.print("계좌번호 : ");
            String accountNumber = scanner.next();
            boolean result = bankRepository.accountCheck2(accountNumber);
            if (result) {
                System.out.print("비밀번호 : ");
                String clientPass = scanner.next();
                System.out.print("출금할 금액 : ");
                Long withdraw = scanner.nextLong();
                String clientCreatedAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd,HH:mm:ss"));
                bankRepository.withdraw(accountNumber, clientPass, withdraw, clientCreatedAt);
                run = false;
            } else {
                System.out.println("없는 계좌번호 입니다.");
            }
        } while (run);
    }

    public void history() {
        boolean run = true;

        System.out.print("계좌번호 : ");
        String accountNumber = scanner.next();
        boolean result = bankRepository.accountCheck2(accountNumber);
        if (result) {
            while (run) {
                System.out.println("-------------------------------------------------------");
                System.out.println("1. 전체 내역 | 2. 입금 내역 | 3. 출금 내역 | 4. 종료");
                System.out.println("-------------------------------------------------------");
                System.out.print("선택 > ");
                serv1 = scanner.nextInt();
                if (serv1 == 1) {
                    bankRepository.historyAll(accountNumber);
                } else if (serv1 == 2) {
                    bankRepository.historyDeposit(accountNumber);
                } else if (serv1 == 3) {
                    bankRepository.historyWithdraw(accountNumber);
                } else if (serv1 == 4) {
                    System.out.println("종료합니다.");
                    run = false;
                } else {
                }
            }
        } else {
            System.out.println("없는 계좌번호 입니다.");
        }
    }
}
