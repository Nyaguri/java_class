package ch13_map.ex03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MemberRepository {
    private static Map<Long, MemberDTO> memberDTOMap = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    public boolean emailCheck(String memberEmail) {
        boolean result = true;
        for (Long i : memberDTOMap.keySet()) {
            if (memberEmail.equals(memberDTOMap.get(i).getMemberEmail())) {
                return false;
            }
        }
        return result;
    }

    public boolean signUp(MemberDTO memberDTO) {
        MemberDTO memberDTO1 = memberDTOMap.put(memberDTO.getId(), memberDTO);
        return memberDTO1 != null;
    }

    public boolean signIn(String memberEmail, String memberPassword) {
        for (Long i : memberDTOMap.keySet()) {
            if (memberEmail.equals(memberDTOMap.get(i).getMemberEmail()) && memberPassword.equals(memberDTOMap.get(i).getMemberPassword())) {
                return true;
            }
        }
        return false;
    }

    public Map<Long, MemberDTO> findAll() {
        return memberDTOMap;
    }

    public void update(String memberMobile) {
        for (Long i : memberDTOMap.keySet()) {
            if (memberMobile.equals(memberDTOMap.get(i).getMemberMobile())) {
                System.out.print("수정할 이메일 : ");
                String memberEmail = sc.next();
                memberDTOMap.get(i).setMemberEmail(memberEmail);
                System.out.print("수정할 비밀번호 : ");
                String memberPassword = sc.next();
                memberDTOMap.get(i).setMemberPassword(memberPassword);
                System.out.print("수정할 이름 : ");
                String memberName = sc.next();
                memberDTOMap.get(i).setMemberName(memberName);
                System.out.print("수정할 전화번호 : ");
                String setMemberMobile = sc.next();
                memberDTOMap.get(i).setMemberMobile(memberMobile);
            }
        }
    }

    public boolean delete(String loginEmail) {
        boolean result = false;
        for (Long i : memberDTOMap.keySet()) {
            if (loginEmail.equals(memberDTOMap.get(i).getMemberEmail())) {
                memberDTOMap.remove(memberDTOMap.get(i).getId());
                return true;
            }
        }
        return result;
    }
}
