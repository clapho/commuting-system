package clapho.commutingsystem.dtos.member;

import clapho.commutingsystem.domain.member.Member;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class MemberResponse {

    private String name;
    private String teamName;
    private String role;
    private LocalDate birthDay;
    private LocalDate workStateDate;

    public MemberResponse(String name, String teamName, String role, LocalDate birthDay, LocalDate workStateDate) {
        this.name = name;
        this.teamName = teamName;
        this.role = role;
        this.birthDay = birthDay;
        this.workStateDate = workStateDate;
    }

    public MemberResponse(Member member) {
        this.name = member.getName();
        this.teamName = member.getTeamName();
        this.role = member.getRole();
        this.birthDay = member.getBirthday();
        this.workStateDate = member.getWorkStartDate();
    }
}
