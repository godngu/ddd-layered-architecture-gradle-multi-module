package com.godngu.member;

import org.springframework.boot.test.context.SpringBootTest;

import java.lang.annotation.*;


@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = MemberServiceApplicationTest.class)
public @interface ServiceTest {
}
