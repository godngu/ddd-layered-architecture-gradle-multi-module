package com.godngu.member.api;

import com.godngu.member.service.dto.MemberSignUpDto;
import com.godngu.member.service.MemberService;
import com.godngu.member.service.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberRestController {

    private final MemberService memberService;

    @PostMapping("/member/signup")
    public MemberDto signUp(@RequestBody MemberSignUpDto dto) {
        return memberService.signUp(dto);
    }

    @GetMapping("/member/{memberNo}")
    public MemberDto getMember(@PathVariable Long memberNo) {
        return memberService.getMember(memberNo);
    }
}
