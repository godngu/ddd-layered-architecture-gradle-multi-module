package com.godngu.member.service;

import com.godngu.member.service.dto.MemberDto;
import com.godngu.member.service.dto.MemberSignUpDto;

public interface MemberService {

    MemberDto signUp(MemberSignUpDto dto);

    MemberDto getMember(Long memberNo);
}
