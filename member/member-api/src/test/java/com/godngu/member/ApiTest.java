package com.godngu.member;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.annotation.*;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
        classes = MemberApplication.class,
        webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public @interface ApiTest {
}

