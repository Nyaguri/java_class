package ch10_class.ex10;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        /**
         * 메뉴
         * 1. 회원가입(기본생성자이용)
         *      회원가입 정보는 스캐너로 받음.
         * 2. 로그인
         * 3. 종료
         */
        int serv;
        Scanner scanner = new Scanner(System.in);
        Member member = new Member();
        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("1. 회원가입 | 2. 로그인 | 3. 종료");
            System.out.println("-------------------------------------");
            System.out.print("선택 > ");
            serv = scanner.nextInt();
            if (serv == 1) {
                System.out.print("회원가입 하실 이메일을 적어주세요 : ");
                member.setMemberEmail(scanner.next());
                System.out.print("회원가입 하실 비밀번호를 적어주세요 : ");
                member.setMemberPassword(scanner.next());
                System.out.print("이름을 적어주세요 : ");
                member.setMemberName(scanner.next());
                System.out.print("전화번호를 적어주세요 : ");
                member.setMemberMobile(scanner.next());
            } else if (serv == 2) {
                boolean result = member.memberLogin(member.getMemberEmail(), member.getMemberPassword());
                System.out.println(result);
            } else {
                System.out.println("종료합니다");
                break;
            }
        }
    }
}
