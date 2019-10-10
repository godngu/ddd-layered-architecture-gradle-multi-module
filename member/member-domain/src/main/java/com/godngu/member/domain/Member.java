package com.godngu.member.domain;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Slf4j
@Getter
@Entity
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member implements Serializable {

    @Id @GeneratedValue
    private Long memberNo;

    private String name;

    private String email;

    @Builder
    public Member(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
