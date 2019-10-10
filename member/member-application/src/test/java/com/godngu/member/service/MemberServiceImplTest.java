package com.godngu.member.service;

import com.godngu.member.ServiceTest;
import com.godngu.member.service.dto.MemberDto;
import com.godngu.member.service.dto.MemberSignUpDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@RunWith(SpringRunner.class)
@ServiceTest
public class MemberServiceImplTest {

    @Autowired
    MemberService memberService;

    @Test
    public void signUp() {
        MemberDto member = memberService.signUp(new MemberSignUpDto("kiljun", "test@email.com"));
        assertThat(member.getMemberNo()).isNotNull();
    }
}