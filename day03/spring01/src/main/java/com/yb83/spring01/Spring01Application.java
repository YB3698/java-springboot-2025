package com.yb83.spring01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

<<<<<<< HEAD
import com.yb83.Cat;

=======
>>>>>>> 27b10b2f32332609b71b7614cc3868c08a5ae472
@SpringBootApplication
public class Spring01Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring01Application.class, args);

		// 인터페이스 연습.
		Dog ppoppy = new Dog("뽀삐", 12);
		Cat kitty = new Cat("키티", 8);

		ppoppy.introduce();
<<<<<<< HEAD
		ppoppy.cry();
=======
		ppoppy.cry();	
>>>>>>> 27b10b2f32332609b71b7614cc3868c08a5ae472
		kitty.introduce();
		kitty.cry();

		// 인터페이스는 특이하게 사용하는 경우가 있음
<<<<<<< HEAD
		// 변수를 선언 시 상위 인터페이스인 Animal을 사용하면
		// 클래스를 변경해도 문제가 발생하지 않음
		// 스프링의 의존성 주입(Dependency Injection)에 핵심이 됨
		Animal choonsam = new Dog("춘삼이", 10);
=======
		// 변수를 선언시 상위인터페이스인 Animal을 사용하면
		// 클래스를 변경해도 문제가 발생하지 않음
		// 스프링의 의존성 주입(Dependency Injection)에 핵심이 됨
		Animal choonsam = new Cat("춘삼이", 10);
>>>>>>> 27b10b2f32332609b71b7614cc3868c08a5ae472
		choonsam.introduce();
		choonsam.cry();
	}

}
