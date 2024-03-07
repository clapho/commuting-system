package clapho.commutingsystem.dtos.team;

import clapho.commutingsystem.domain.team.Team;
import lombok.Getter;

@Getter
public class TeamResponse {

    private String name;
    private String manager;
    private int memberCount;

    public TeamResponse(String name, String manager, int memberCount) {
        this.name = name;
        this.manager = manager;
        this.memberCount = memberCount;
    }

    public TeamResponse(Team team) {
        this.name = team.getName();
        this.manager = team.getManager();
        this.memberCount = team.getMemberCount();
    }
}
