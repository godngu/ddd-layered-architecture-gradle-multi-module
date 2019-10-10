package com.godngu.member.infra;

import com.godngu.member.InfraTest;
import com.godngu.member.domain.Member;
import com.godngu.member.infra.hibernate.MemberJpaRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@RunWith(SpringRunner.class)
@InfraTest
public class MemberJpaRepositoryTest {

    @Autowired
    MemberJpaRepository memberJpaRepository;

    @Test
    public void bringMemberByMemberNo() {
        // given
        Member savedMember = memberJpaRepository.save(new Member("kiljun", "kil@email.com"));

        // when
        Member foundMember = memberJpaRepository.bringMemberByMemberNo(savedMember.getMemberNo());

        // then
        assertThat(foundMember).isEqualTo(savedMember);
    }
}