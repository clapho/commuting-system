package clapho.commutingsystem.controller;

import clapho.commutingsystem.dtos.member.MemberCreateRequest;
import clapho.commutingsystem.dtos.member.MemberResponse;
import clapho.commutingsystem.service.member.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/api/member")
    public void createMember(@RequestBody MemberCreateRequest request) {
        memberService.create(request);
    }

    @GetMapping("/api/member")
    public List<MemberResponse> getAllMembers() {
        return memberService.getAllMembers();
    }
}
