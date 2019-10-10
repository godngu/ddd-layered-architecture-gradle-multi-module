package com.godngu.member.domain;

public interface MemberRepository {

    Member save(Member member);

    Member findMemberByMemberNo(Long memberNo);
}
