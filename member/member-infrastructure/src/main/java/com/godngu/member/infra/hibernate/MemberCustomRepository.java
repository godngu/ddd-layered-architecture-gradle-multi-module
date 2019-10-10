package com.godngu.member.infra.hibernate;

import com.godngu.member.domain.Member;

public interface MemberCustomRepository {

    Member bringMemberByMemberNo(Long memberNo);
}
