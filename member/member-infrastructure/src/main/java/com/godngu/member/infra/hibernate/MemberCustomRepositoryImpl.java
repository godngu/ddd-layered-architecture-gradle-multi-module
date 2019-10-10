package com.godngu.member.infra.hibernate;

import com.godngu.member.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional
@RequiredArgsConstructor
public class MemberCustomRepositoryImpl implements MemberCustomRepository {

    private final EntityManager entityManager;

    @Override
    public Member bringMemberByMemberNo(Long memberNo) {
        return entityManager.createQuery("SELECT m FROM Member m WHERE m.memberNo = :memberNo", Member.class)
                .setParameter("memberNo", memberNo)
                .getSingleResult();
    }
}
