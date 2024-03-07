package clapho.commutingsystem.controller;

import clapho.commutingsystem.dtos.team.TeamCreateRequest;
import clapho.commutingsystem.dtos.team.TeamResponse;
import clapho.commutingsystem.service.team.TeamService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping("/api/team")
    public void createTeam(@RequestBody TeamCreateRequest request) {
        teamService.create(request);
    }

    @GetMapping("/api/teams")
    public List<TeamResponse> findAllTeams() {
        return teamService.getAllTeams();
    }
}
