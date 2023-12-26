package ch12_classes.ex5;

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
        for (ClientDTO clientDTO : clientDTOList) {
            if (accountNumber.equals(clientDTO.getAccountNumber())) {
                result = false;
                break;
            }
        }
        return result;
    }

    public boolean accountCheck2(String accountNumber) {
        boolean result = false;
        for (ClientDTO clientDTO : clientDTOList) {
            if (accountNumber.equals(clientDTO.getAccountNumber())) {
                result = true;
                break;
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
        boolean result = false;
        for (ClientDTO clientDTO : clientDTOList) {
            if (accountNumber.equals(clientDTO.getAccountNumber())) {
                System.out.println((clientDTO.getClientName() + "님의" + " 잔액은 " + clientDTO.getBalance() + "원 입니다."));
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
        for (AccountDTO accountDTO : accountDTOList) {
            if (accountNumber.equals(accountDTO.getAccountNumber())) {
                System.out.println("accountDTOList = " + accountDTO);
            }
        }
    }

    public void historyDeposit(String accountNumber) {
        for (AccountDTO accountDTO : accountDTOList) {
            if (accountNumber.equals(accountDTO.getAccountNumber())) {
                System.out.println("accountDTOList = " + accountDTO.getDeposit());
            }
        }
    }

    public void historyWithdraw(String accountNumber) {
        for (AccountDTO accountDTO : accountDTOList) {
            if (accountNumber.equals(accountDTO.getAccountNumber())) {
                System.out.println("accountDTOList = " + accountDTO.getWithdraw());
            }
        }
    }

    public void accountTransfer(String accountNumberFrom, String accountNumberTo, Long money) {
        for (ClientDTO clientDTO : clientDTOList) {
            if (accountNumberFrom.equals(clientDTO.getAccountNumber())) {
                long balance = clientDTO.getBalance();
                balance = balance - money;
                clientDTO.setBalance(balance);
                AccountDTO accountDTO = new AccountDTO(accountNumberFrom, 0L, money);
                accountDTOList.add(accountDTO);
            } else if (accountNumberTo.equals(clientDTO.getAccountNumber())) {
                long balance = clientDTO.getBalance();
                balance = balance + money;
                clientDTO.setBalance(balance);
                AccountDTO accountDTO = new AccountDTO(accountNumberTo, money, 0L);
                accountDTOList.add(accountDTO);
            }
        }
    }
}
