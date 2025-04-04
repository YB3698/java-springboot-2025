package com.yb83.spring02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring02Application {

<<<<<<< HEAD
	public static void main(String[] args) {
		SpringApplication.run(Spring02Application.class, args);

		// 예외처리 : 0으로 나눌 수 없음음
=======
	public void sayNickName(String nickName) throws Exception {
		if (nickName.equals("애슐리")) {
			
			throw new Exception("이 별명은 안돼요~!!"); // 자신이 예외를 처리하지 않음. 호출한 main메서드에 예외를 던짐
		}

		System.out.println("당신의 별명은 " + nickName);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Spring02Application.class, args);

		// 예외처리. 0으로 나눌 수 없음
>>>>>>> 27b10b2f32332609b71b7614cc3868c08a5ae472
		int result = 0;
		try {
			result = 17 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
<<<<<<< HEAD
		System.out.println(result);

		String[] names = {"Hugo", "Ashley", "Jini"};
		try {
		System.out.println(names[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		// 예외처리. null값은 여러가지 (함수호출 등) 처리를 할 수 없음음
=======

		System.out.println(result);

		// 예외처리. 배열의 인덱스가 길이를 넘어가면 안됨
		String[] names = { "yb", "Ashley", "Jini" };
		try {
			System.out.println(names[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} finally {
			System.out.println("예외발생 유무와 상관없이 실행");
			// DB연결종료, 파일클로즈, 네트워크연결끊기
		}

		// 예외처리. null값은 여러가지(함수호출 등) 처리를 할 수 없음
>>>>>>> 27b10b2f32332609b71b7614cc3868c08a5ae472
		String name = null;
		try {
			String[] names2 = name.split(" ");
			System.out.println(names2[0]);
<<<<<<< HEAD
		} catch (Exception e) { // (NullPointerException e) {
			System.out.println(e.getMessage()); // e 보다는 e.getMessage() 추천
=======
		} catch (Exception e) { //(NullPointerException e) {
			System.out.println(e.getMessage());  // e 보다는 e.getMessage() 추천
>>>>>>> 27b10b2f32332609b71b7614cc3868c08a5ae472
		}

		// 예외처리. 호출한 메서드에서 던진 예외를 받아서 처리
		Spring02Application app = new Spring02Application();
		try {
			app.sayNickName("애슐리");
<<<<<<< HEAD
		}
		System.out.println("프로그램 종료!"); // 정상적으로 프로그램 종료
=======
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("프로그램 종료!");  // 정상적으로 프로그램 종료
>>>>>>> 27b10b2f32332609b71b7614cc3868c08a5ae472
	}

}
