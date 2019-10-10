package com.godngu.member.service.dto;

import com.godngu.member.domain.Member;
import lombok.*;

import java.io.Serializable;

@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberSignUpDto implements Serializable {

    private String name;
    private String email;

    @Builder
    public MemberSignUpDto(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Member toEntity() {
        return Member.builder()
                .name(this.name)
                .email(this.email)
                .build();
    }

}
