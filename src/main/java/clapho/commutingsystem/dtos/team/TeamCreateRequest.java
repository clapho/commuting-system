package clapho.commutingsystem.dtos.team;

import lombok.Getter;

@Getter
public class TeamCreateRequest {

    private String name;
    private String manager;
    private int teamCount;

    public TeamCreateRequest(String name, String manager, int teamCount) {
        this.name = name;
        this.manager = manager;
        this.teamCount = teamCount;
    }
}
