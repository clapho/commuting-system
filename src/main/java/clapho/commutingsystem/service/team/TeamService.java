package clapho.commutingsystem.service.team;

import clapho.commutingsystem.domain.team.Team;
import clapho.commutingsystem.domain.team.TeamRepository;
import clapho.commutingsystem.dtos.team.TeamCreateRequest;
import clapho.commutingsystem.dtos.team.TeamResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository;

    @Transactional
    public void create(TeamCreateRequest request) {
        teamRepository.save(new Team(
                request.getName(),
                request.getManager(),
                request.getTeamCount()));
    }

    @Transactional(readOnly = true)
    public List<TeamResponse> getAllTeams() {
        return teamRepository.findAll().stream()
                .map(TeamResponse::new)
                .collect(Collectors.toList());
    }
}
