package com.godngu.member.service;

import com.godngu.member.domain.MemberRepository;
import com.godngu.member.service.dto.MemberDto;
import com.godngu.member.service.dto.MemberSignUpDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    private final ModelMapper modelMapper;

    @Override
    public MemberDto signUp(MemberSignUpDto dto) {
        return modelMapper.map(memberRepository.save(dto.toEntity()), MemberDto.class);
    }

    @Override
    public MemberDto getMember(Long memberNo) {
        return modelMapper.map(memberRepository.findMemberByMemberNo(memberNo), MemberDto.class);
    }
}
