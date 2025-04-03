package com.yb83.spring02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring02Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring02Application.class, args);

		// 예외처리 : 0으로 나눌 수 없음음
		int result = 0;
		try {
			result = 17 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println(result);

		String[] names = {"Hugo", "Ashley", "Jini"};
		try {
		System.out.println(names[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		// 예외처리. null값은 여러가지 (함수호출 등) 처리를 할 수 없음음
		String name = null;
		try {
			String[] names2 = name.split(" ");
			System.out.println(names2[0]);
		} catch (Exception e) { // (NullPointerException e) {
			System.out.println(e.getMessage()); // e 보다는 e.getMessage() 추천
		}

		// 예외처리. 호출한 메서드에서 던진 예외를 받아서 처리
		Spring02Application app = new Spring02Application();
		try {
			app.sayNickName("애슐리");
		}
		System.out.println("프로그램 종료!"); // 정상적으로 프로그램 종료
	}

}
