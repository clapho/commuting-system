package clapho.commutingsystem.dtos.member;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class MemberCreateRequest {

    private String name;
    private String teamName;
    private String role;
    private LocalDate birthDay;
    private LocalDate workStartDate;

    public MemberCreateRequest(String name, String teamName, String role, LocalDate birthDay, LocalDate workStartDate) {
        this.name = name;
        this.teamName = teamName;
        this.role = role;
        this.birthDay = birthDay;
        this.workStartDate = workStartDate;
    }
}
