package ch12_classes.ex3;

import java.util.List;
import java.util.Scanner;

public class MemberService {
    private static String loginEmail = null;
    Scanner scanner = new Scanner(System.in);
    MemberRepository memberRepository = new MemberRepository();

    public void membership() {
        // 중복체크 결과를 담을 변수
        boolean checkResult = false;
        String memberEmail = null;
        do {
            System.out.print("이메일: ");
            memberEmail = scanner.next();
            // checkResult가 true => 사용가능(반복문 종료), checkResult가 false => 사용불가(다시 이메일입력)
            checkResult = memberRepository.emailCheck(memberEmail);
            if (checkResult) {
                System.out.println("사용 가능한 이메일 입니다.");
            } else {
                System.out.println("이미 사용 중인 이메일 입니다. 다른 이메일을 입력해주세요.");
            }
        } while (!checkResult); // checkResult 값이 false라면 계속 반복되도록
        System.out.print("사용하실 비밀번호: ");
        String memberPassword = scanner.next();
        System.out.print("사용하실 이름: ");
        String memberName = scanner.next();
        System.out.print("사용자의 전화번호: ");
        String memberMobile = scanner.next();
        MemberDTO memberDTO = new MemberDTO(memberEmail, memberPassword, memberName, memberMobile);
        boolean result = memberRepository.membership(memberDTO);
        if (result) {
            System.out.println("회원가입 성공");
        } else {
            System.out.println("회원가입 실패");
        }
    }

    public void login() {
        System.out.print("이메일: ");
        String memberEmail = scanner.next();
        System.out.print("비밀번호: ");
        String memberPassword = scanner.next();
//        MemberDTo loginResult = memberRepository.login(memberEmail, memberPassword);
//        if (loginResult != null) {
//              System.out.println("로그인 성공");
//              System.out.println(memberEmail + "님 환영합니다!");
//              loginEmail = memberEmail;
        boolean result = memberRepository.login(memberEmail, memberPassword);
        if (result) {
            System.out.println("로그인 성공");
            loginEmail = memberEmail;
        } else {
            System.out.println("로그인 실패");
//            System.out.println("이메일 또는 비밀번호를 다시 입력해주세요");
        }
    }

    public void findAll() {
        List<MemberDTO> memberDTOList = memberRepository.findAll();
        for (MemberDTO memberDTO : memberDTOList) {
            System.out.println("memberDTO = " + memberDTO);
        }
    }

    public void upDate() {
        if (loginEmail != null) {
            System.out.print("전화번호 입력 : ");
            String memberMobile = scanner.next();
            memberRepository.upDate(memberMobile);
        } else {
            System.out.println("로그인하세요");
        }
    }

    public void delete() {
        if (loginEmail != null) {
            System.out.println("진짜 탈퇴하실 건가요?");
            System.out.print("비밀번호 : ");
            String memberPassword = scanner.next();
            boolean result = memberRepository.login(loginEmail, memberPassword);
            if (result) {
                boolean result2 = memberRepository.delete(loginEmail);
                if (result2) {
                    System.out.println("회원탈퇴가 정상적으로 처리되었습니다! 그동안 감사했습니다!");
                } else {
                    System.out.println("탈퇴가 처리되지 않았습니다! 다시 시도해 주시기 바랍니다!");
                }
            } else {
                System.out.println("비밀번호가 일치하지 않습니다! 메인메뉴로 돌아갑니다!");
            }
        } else {
            System.out.println("로그인 해주세요!");
        }
    }

    public void logout() {
        loginEmail = null;
        System.out.println("로그아웃 되었습니다");
    }
}
