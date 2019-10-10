

## 참고 URL
* https://github.com/ChristophKnabe/spring-ddd-bank
* https://github.com/MohammedRiazKhan/HospitalSystem/tree/master/src/main/java/me/mohammedriazkhan/service
* https://github.com/eternity-oop
* https://github.com/ihoneymon/multi-module
* https://jojoldu.tistory.com/444
* http://woowabros.github.io/study/2019/07/01/multi-module.html



## 접근 방향
* 단방향 접근을 원칙으로 한다.
* api > application
* application > domain
* application > infrastructure
* infrastructure > domain


## DDD Layered Architecture 설명



## 정리되지 않은 내용들
* Domain Model을 보호하기 위해서, Application Layer에서는 DTO로 데이터를 핸들링 한다.
* 각 Layer별로 간섭을 막기 위해서 Multi Module로 계측을 명확히 구분한다.
* 계층별로 테스트를 하기 위해서는 *ApplicationTest.java를 test 하위에 두어야 한다.
    * 계층별로 테스트 모듈에 @SpringBootApplication이 존재하므로 중복이라는 오류가 발생할 수 있다.
    * 이 경우 계층별로 테스트 대상이 되는 Application을 명확하게 지정해줘야 한다.
    ```java
    @SpringBootTest(classes = MemberApplication.class)  
    @SpringBootTest(classes = MemberServiceApplicationTest.class)
    @ContextConfiguration(classes = MemberInfraApplicationTest.class)
    ```
* build.gradle에서 compile, implementation을 명확하게 구분하여 사용한다.
    * implementation은 선언된 class에 대한 접근을 제한할 수 있다.
    ```groovy
    # 프로젝트 dependency
    implementation project(':member:member-domain')
    implementation project(':member:member-infrastructure')
    ```
* 이렇게 복잡하게 멀티 모듈로 구현한 이유는
    1. root domain 단위로 서버를 분리하기 용이하다 => MSA
    2. 레이어별로 모듈을 분리 함으로써 격리할 수 있다 => 실수 방지?
    3. 역할을 명확하게 할 수 있다.
        1. 소스의 역할
        2. dependency 관리
    4. 프로젝트가 커졌을 경우 유리하다.