package com.godngu.member.service.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberDto {

    private Long memberNo;

    private String name;

    private String email;
}
