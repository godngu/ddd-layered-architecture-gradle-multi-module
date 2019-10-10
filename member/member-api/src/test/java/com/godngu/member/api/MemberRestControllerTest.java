package com.godngu.member.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.godngu.member.ApiTest;
import com.godngu.member.service.dto.MemberSignUpDto;
import com.godngu.member.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.any;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Slf4j
@RunWith(SpringRunner.class)
@ApiTest
public class MemberRestControllerTest {

    @Autowired
    MemberService memberService;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void signUp() throws Exception {
        mockMvc.perform(
                post("/members/member/signup")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new MemberSignUpDto("kiljun", "test@email.com"))))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("name").value("kiljun"))
                .andExpect(jsonPath("memberNo", is(any(Integer.class))))
        ;
    }
}