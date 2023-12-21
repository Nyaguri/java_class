package ch11_classes.ex5;

import java.util.ArrayList;
import java.util.List;

public class BankRepository {
    List<ClientDTO> clientDTOList = new ArrayList<>();
    List<AccountDTO> accountDTOList = new ArrayList<>();

    public boolean create(ClientDTO clientDTO) {
        return clientDTOList.add(clientDTO);
    }

    public boolean accountCheck(String accountNumber) {
        boolean result = true;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (accountNumber.equals(clientDTOList.get(i).getAccountNumber())) {
                result = false;
            }
        }
        return result;
    }

    public boolean accountCheck2(String accountNumber) {
        boolean result = false;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (accountNumber.equals(clientDTOList.get(i).getAccountNumber())) {
                result = true;
            }
        }
        return result;
    }

    public ClientDTO accountCheck3(String accountNumber) {
        for (ClientDTO clientDTO : clientDTOList) {
            if (accountNumber.equals(clientDTO.getAccountNumber())) {
                return clientDTO;
            }
        }
        return null;
    }

    public boolean balanceInquiry(String accountNumber) {
//        String string = "없는 계좌 번호 입니다.";
//        for (ClientDTO clientDTO : clientDTOList) {
//            if (clientDTO.getAccountNumber().equals(accountNumber)) ;
//            string = clientDTO.getClientName() + "님의 현재 잔액 : " + clientDTO.getBalance() + "원 입니다.";
//            break;
//        }
//        return string;
//    }
        boolean result = false;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (accountNumber.equals(clientDTOList.get(i).getAccountNumber())) {
                System.out.println((clientDTOList.get(i).getClientName() + "님의" + " 잔액은 " + clientDTOList.get(i).getBalance() + "원 입니다."));
                result = true;
            }
        }
        return result;
    }

    public void deposit(String accountNumber, Long money, String clientCreatedAt) {
        for (ClientDTO clientDTO : clientDTOList) {
            if (accountNumber.equals(clientDTO.getAccountNumber())) {
                clientDTO.setBalance(clientDTO.getBalance() + money);
                System.out.println("잔액 : " + clientDTO.getBalance() + "원");
                AccountDTO accountDTO = new AccountDTO(accountNumber, money, 0L);
                accountDTOList.add(accountDTO);
                System.out.println("입금이 완료 되었습니다.");
            }
        }
    }

    public void withdraw(String accountNumber, String clientPass, Long money, String clientCreatedAt) {
        for (ClientDTO clientDTO : clientDTOList) {
            if (accountNumber.equals(clientDTO.getAccountNumber()) && money < clientDTO.getBalance()) {
                clientDTO.setBalance(clientDTO.getBalance() - money);
                System.out.println("잔액 : " + clientDTO.getBalance() + "원");
                AccountDTO accountDTO = new AccountDTO(accountNumber, 0L, money);
                accountDTOList.add(accountDTO);
                System.out.println("출금이 완료 되었습니다.");
            } else if (accountNumber.equals(clientDTO.getAccountNumber()) && money > clientDTO.getBalance()) {
                System.out.println("잔액이 부족합니다.");
            }
        }
    }

    public void historyAll(String accountNumber) {
        for (int i = 0; i < accountDTOList.size(); i++) {
            if (accountNumber.equals(accountDTOList.get(i).getAccountNumber())) {
                System.out.println("accountDTOList = " + accountDTOList.get(i));
            }
        }
    }

    public void historyDeposit(String accountNumber) {
        for (int i = 0; i < accountDTOList.size(); i++) {
            if (accountNumber.equals(accountDTOList.get(i).getAccountNumber())) {
                System.out.println("accountDTOList = " + accountDTOList.get(i).getDeposit());
            }
        }
    }

    public void historyWithdraw(String accountNumber) {
        for (int i = 0; i < accountDTOList.size(); i++) {
            if (accountNumber.equals(accountDTOList.get(i).getAccountNumber())) {
                System.out.println("accountDTOList = " + accountDTOList.get(i).getWithdraw());
            }
        }
    }

    public void accountTransfer(String accountNumberFrom, String accountNumberTo, Long money) {
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (accountNumberFrom.equals(clientDTOList.get(i).getAccountNumber())) {
                long balance = clientDTOList.get(i).getBalance();
                balance = balance - money;
                clientDTOList.get(i).setBalance(balance);
                AccountDTO accountDTO = new AccountDTO(accountNumberFrom, 0L, money);
                accountDTOList.add(accountDTO);
            } else if (accountNumberTo.equals(clientDTOList.get(i).getAccountNumber())) {
                long balance = clientDTOList.get(i).getBalance();
                balance = balance + money;
                clientDTOList.get(i).setBalance(balance);
                AccountDTO accountDTO = new AccountDTO(accountNumberTo, money, 0L);
                accountDTOList.add(accountDTO);
            }
        }
    }
}
