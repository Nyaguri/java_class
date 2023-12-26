package ch13_map.ex03;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MemberService {
    private static String loginEmail = null;
    Scanner scanner = new Scanner(System.in);
    MemberRepository memberRepository = new MemberRepository();

    public void signUp() {
        boolean checkResult;
        String memberEmail;
        do {
            System.out.print("이메일: ");
            memberEmail = scanner.next();
            checkResult = memberRepository.emailCheck(memberEmail);
            if (checkResult) {
                System.out.println("사용 가능한 이메일 입니다.");
            } else {
                System.out.println("이미 사용 중인 이메일 입니다. 다른 이메일을 입력해주세요.");
            }
        } while (!checkResult);
        System.out.print("사용하실 비밀번호: ");
        String memberPassword = scanner.next();
        System.out.print("사용하실 이름: ");
        String memberName = scanner.next();
        System.out.print("사용자의 전화번호: ");
        String memberMobile = scanner.next();
        MemberDTO memberDTO1 = new MemberDTO(memberEmail, memberPassword, memberName, memberMobile);
        boolean result = memberRepository.signUp(memberDTO1);
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
        boolean result = memberRepository.signIn(memberEmail, memberPassword);
        if (result) {
            System.out.println("로그인 성공");
            System.out.println(memberEmail + "님 환영합니다!");
            loginEmail = memberEmail;
        } else {
            System.out.println("이메일 또는 비밀번호를 다시 입력해주세요");
        }
    }

    public void findAll() {
        Map<Long, MemberDTO> memberDTOMap = memberRepository.findAll();
        for (Long i : memberDTOMap.keySet()) {
            System.out.println(memberDTOMap.get(i));
        }
    }

    public void update() {
        if (loginEmail != null) {
            System.out.print("전화번호 입력 : ");
            String memberMobile = scanner.next();
            memberRepository.update(memberMobile);
        } else {
            System.out.println("로그인하세요");
        }
    }

    public void delete() {
        if (loginEmail != null) {
            System.out.println("진짜 탈퇴하실 건가요?");
            System.out.print("비밀번호 : ");
            String memberPassword = scanner.next();
            boolean result = memberRepository.signIn(loginEmail, memberPassword);
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
