package ch11_classes.ex6_memberboard.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MemberDTO {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private String memberMobile;
    private String memberCreatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    public String getMemberCreatedAt() {
        return memberCreatedAt;
    }

    public void setMemberCreatedAt(String memberCreatedAt) {
        this.memberCreatedAt = memberCreatedAt;
    }

    private static Long idValue = 1L;
    public MemberDTO(String memberEmail, String memberPassword, String memberName, String memberMobile) {
        this.id = idValue++;
        this.memberEmail = memberEmail;
        this.memberPassword = memberPassword;
        this.memberName = memberName;
        this.memberMobile = memberMobile;
        this.memberCreatedAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "id : " + id + '\n' +
                "이메일 : " + memberEmail + '\n' +
                "비밀번호 : " + memberPassword + '\n' +
                "이름 : " + memberName + '\n' +
                "전화번호 : " + memberMobile + '\n' +
                "회원 가입 시간 : " + memberCreatedAt;
    }
}
