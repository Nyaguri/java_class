package ch12_classes.ex6_memberboard.service;

import ch12_classes.ex6_memberboard.dto.MemberDTO;
import ch12_classes.ex6_memberboard.repository.MemberRepository;
import ch12_classes.ex6_memberboard.common.CommonVariables;

import java.util.List;
import java.util.Scanner;

public class MemberService {
    MemberRepository memberRepository = new MemberRepository();
    CommonVariables commonVariables = new CommonVariables();
    Scanner sc = new Scanner(System.in);
    public void signUp() {
        boolean checkResult;
        String memberEmail;
        do {
            System.out.print("이메일 : ");
            memberEmail = sc.next();
            checkResult = memberRepository.checkEmail(memberEmail);
            if (checkResult) {
                System.out.println("사용 가능한 이메일 입니다.");
            }else {
                System.out.println("이미 사용중인 이메일 입니다. 다시 입력 해주세요.");
            }
        }while (!checkResult);
        System.out.print("비밀번호 : ");
        String memberPassword = sc.next();
        System.out.print("이름 : ");
        String memberName = sc.next();
        System.out.print("전화번호 : ");
        String memberMobile = sc.next();
        MemberDTO memberDTO = new MemberDTO(memberEmail, memberPassword, memberName, memberMobile);
        boolean result = memberRepository.create(memberDTO);
        if (result) {
            System.out.println("회원가입 성공");
        }else {
            System.out.println("회원가입 실패");
        }
    }

    public void signIn() {
        System.out.print("이메일 : ");
        String memberEmail = sc.next();
        System.out.print("비밀번호 : ");
        String memberPassword = sc.next();
        boolean result = memberRepository.signIn(memberEmail, memberPassword);
        if (result) {
            System.out.println("로그인 성공");
            CommonVariables.loginEmail = memberEmail;
        }else {
            System.out.println("로그인 실패");
        }
    }

    public void list() {
        List<MemberDTO> memberDTOList = memberRepository.list();
        for (int i = 0; i < memberDTOList.size(); i++) {
            System.out.println(memberDTOList);
        }
    }

    public void upDate() {
        if (CommonVariables.loginEmail != null) {
            System.out.print("전화번호 입력 : ");
            String memberMobile = sc.next();
            memberRepository.upDate(memberMobile);
        }else {
            System.out.println("로그인 하세요.");
        }
    }

    public void delete() {
        if (CommonVariables.loginEmail != null) {
            System.out.println("진짜 탈퇴하실 건가요?");
            System.out.print("비밀번호 : ");
            String memberPassword = sc.next();
            boolean result = memberRepository.signIn(CommonVariables.loginEmail, memberPassword);
            if (result) {
                boolean result1 = memberRepository.delete(CommonVariables.loginEmail);
                if (result1) {
                    System.out.println("회원탈퇴가 정상적으로 처리되었습니다. 그동안 감사했습니다.");
                }else {
                    System.out.println("탈퇴가 처리되지 않았습니다. 다시 시도해 주시기 바랍니다.");
                }
            }else {
                System.out.println("비밀번호가 일치하지 않습니다. 메인메뉴로 돌아갑니다.");
            }
        }else {
            System.out.println("로그인 해주세요.");
        }
    }

    public void logOut() {
        CommonVariables.loginEmail = null;
        System.out.println("로그아웃 되었습니다.");
    }
}
