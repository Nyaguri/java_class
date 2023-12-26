package ch12_classes.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberRepository {
    Scanner scanner = new Scanner(System.in);
    private static List<MemberDTO> memberDTOList = new ArrayList<>();

    public boolean membership(MemberDTO memberDTO) {
        return memberDTOList.add(memberDTO);
    }

    public List<MemberDTO> findAll() {
        return memberDTOList;
    }

    public boolean login(String memberEmail, String memberPassword) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberEmail.equals(memberDTOList.get(i).getMemberEmail())&&memberPassword.equals(memberDTOList.get(i).getMemberPassword())) {
                result = true;
            }
        }
        return result;
    }

    public MemberDTO upDate(String memberMobile) {
        MemberDTO memberDTO = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberMobile.equals(memberDTOList.get(i).getMemberMobile())) {
                System.out.print("수정할 이메일 : ");
                String memberEmail = scanner.next();
                memberDTOList.get(i).setMemberEmail(memberEmail);
                System.out.print("수정할 비밀번호 : ");
                String memberPassword = scanner.next();
                memberDTOList.get(i).setMemberPassword(memberPassword);
                System.out.print("수정할 이름 : ");
                String memberName = scanner.next();
                memberDTOList.get(i).setMemberName(memberName);
                System.out.print("수정할 전화번호 : ");
                String setMemberMobile = scanner.next();
                memberDTOList.get(i).setMemberMobile(setMemberMobile);
            }
        }
        return memberDTO;
    }

    public boolean delete(String loginEmail) {
        boolean result = false;
                for (int i = 0; i < memberDTOList.size(); i++) {
                    if (loginEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                        memberDTOList.remove(i);
                        result = true;
                    }
                }
                return result;
    }

    public boolean emailCheck(String memberEmail) {
        boolean result = true;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                // 중복되는 이메일이 있다 => 결과를 false로 주자
                result = false;
            }
        }
        return result;
    }
}
