package ch12_classes.ex6_memberboard.repository;

import ch12_classes.ex6_memberboard.common.CommonVariables;
import ch12_classes.ex6_memberboard.dto.MemberDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberRepository {
    List<MemberDTO> memberDTOList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public boolean checkEmail(String memberEmail) {
        boolean result = true;
        for (MemberDTO memberDTO : memberDTOList) {
            if (memberEmail.equals(memberDTO.getMemberEmail())) {
                result = false;
                break;
            }
        }
        return result;
    }

    public boolean create(MemberDTO memberDTO) {
        return memberDTOList.add(memberDTO);
    }

    public boolean signIn(String memberEmail, String memberPassword) {
        boolean result = false;
        for (MemberDTO memberDTO : memberDTOList) {
            if (memberEmail.equals(memberDTO.getMemberEmail()) && memberPassword.equals(memberDTO.getMemberPassword())) {
                result = true;
                break;
            }
        }
        return result;
    }

    public List<MemberDTO> list() {
        return memberDTOList;
    }

    public void upDate(String memberMobile) {
        for (MemberDTO dto : memberDTOList) {
            if (memberMobile.equals(dto.getMemberMobile())) {
                System.out.print("수정할 이메일 : ");
                String memberEmail = sc.next();
                dto.setMemberEmail(memberEmail);
                System.out.print("수정할 비밀번호 : ");
                String memberPassword = sc.next();
                dto.setMemberPassword(memberPassword);
                System.out.print("수정할 이름 : ");
                String memberName = sc.next();
                dto.setMemberName(memberName);
                System.out.print("수정할 전화번호 : ");
                String setMemberMobile = sc.next();
                dto.setMemberMobile(setMemberMobile);
            }
        }
    }

    public boolean delete(String loginEmail) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (CommonVariables.loginEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                memberDTOList.remove(i);
                result = true;
            }
        }
        return result;
    }
}
