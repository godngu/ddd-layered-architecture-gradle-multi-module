package com.godngu.member.infra.exception;

import lombok.Getter;

@Getter
public class MemberNotFoundException extends RuntimeException {

    private Long memberNo;

    public MemberNotFoundException(Long memberNo) {
        this.memberNo = memberNo;
    }

    public MemberNotFoundException(String message, Long memberNo) {
        super(message);
        this.memberNo = memberNo;
    }

    public MemberNotFoundException(String message, Throwable cause, Long memberNo) {
        super(message, cause);
        this.memberNo = memberNo;
    }

    public MemberNotFoundException(Throwable cause, Long memberNo) {
        super(cause);
        this.memberNo = memberNo;
    }

    public MemberNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Long memberNo) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.memberNo = memberNo;
    }
}
