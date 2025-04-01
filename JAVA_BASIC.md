### Java 기초문법

### 기본
- 소스코드 템플릿

    ```java
    // 한줄 주석.
    /*
     * 여러줄
     * 주석
    */
    package com.yb83.spring01; // 자기 프로젝트의 패키지명(폴더)

    import org.springframework.boot.SpringApplication; // 라이브러리, 클래스 가져오기
    import org.springframework.boot.autoconfigure.SpringBootApplication;

    @SpringBootApplication // 자바프로젝트 실행을 도와주는 어노테이션
    public class Spring01Application { // 자신 클래스명
    
        // 엔트리포인트(프로젝트당 하나만 존재)
        public static void main(String[] args){ // 함수, 클래스, 조건문, 반복무 시작이 중괄호중괄호 : ({)
            SpringApplication.run(Spirng01Application.class, args); // 한줄이 끝나면 반드시 ; 붙이기
            System.out.printn("Hello, Spring Boot"); // 콘솔출력, 문자열 향상 : "
        }
    }```

    - 자바특징
        - 간결하면서 강력한 객체지향 언어
        - 플랫폼 독립적, OS에 영향을 거의 받지 않음
        - 라이브러리가 아주 다양, 생산성 향상
        - GUI 프로그램 개발에는 부적합(Swing, JavaFX로 가능)
        - 정밀하게 HW를 제어하는 프로그램에도 부적합

    - JVM 위에서 동작
        - Java Virtual Machine
        - sourcecode.java -> javac(java compiler) -> bytecode.class -> java로 실행

    - 활용분야
        - 웹에 특화. 안정적이고 보완이 좋아서 인터넷 포털, 인터넷 뱅킹, 쇼핑몰, 기업시스템에 많이 쓰임
        - 