package com.godngu.member.infra.hibernate;

import com.godngu.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberJpaRepository extends JpaRepository<Member, Long>, MemberCustomRepository {
}
