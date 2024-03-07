package clapho.commutingsystem.service.member;

import clapho.commutingsystem.domain.member.Member;
import clapho.commutingsystem.domain.member.MemberRepository;
import clapho.commutingsystem.dtos.member.MemberCreateRequest;
import clapho.commutingsystem.dtos.member.MemberResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void create(MemberCreateRequest request) {
        memberRepository.save(new Member(
                request.getName(),
                request.getTeamName(),
                request.getRole(),
                request.getBirthDay(),
                request.getWorkStartDate()));
    }

    public List<MemberResponse> getAllMembers() {
        return memberRepository.findAll().stream()
                .map(MemberResponse::new)
                .collect(Collectors.toList());
    }
}
