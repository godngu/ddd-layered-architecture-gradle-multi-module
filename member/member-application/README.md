# Application

* 서비스에 대한 흐름을 제어하고, 요청과 응답에 대한 비지니스를 처리한다.
* @Service 어노텡이션을 이용하여 구현한다.
* Domain, Infrastructure 모듈을 참조한다.
* User Interface(api)와 통신하는 유일한 창구다.
* Entity가 노출되지 않도록 DTO를 사용한다.
    * 노출될 경우 Persistence context 관리가 어려워진다.