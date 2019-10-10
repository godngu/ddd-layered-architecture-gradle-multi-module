package com.godngu.member.infra;

import com.godngu.member.domain.Member;
import com.godngu.member.domain.MemberRepository;
import com.godngu.member.infra.exception.MemberNotFoundException;
import com.godngu.member.infra.hibernate.MemberJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepository {

    private final MemberJpaRepository memberJpaRepository;

    @Override
    public Member save(Member member) {
        return memberJpaRepository.save(member);
    }

    @Override
    public Member findMemberByMemberNo(Long memberNo) {
        return memberJpaRepository.findById(memberNo).orElseThrow(() -> new MemberNotFoundException(memberNo));
    }
}
