package com.yb83.spring02;
<<<<<<< HEAD
import java.util.Scanner;
=======
>>>>>>> 27b10b2f32332609b71b7614cc3868c08a5ae472

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

<<<<<<< HEAD
=======
import java.util.Scanner;  // 콘솔 입력받을 클래스 선언

>>>>>>> 27b10b2f32332609b71b7614cc3868c08a5ae472
@SpringBootApplication
public class Spring02Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring02Application.class, args);

		Scanner scan = new Scanner(System.in);
<<<<<<< HEAD
		
=======

>>>>>>> 27b10b2f32332609b71b7614cc3868c08a5ae472
		System.out.print(">> 아이디 입력 : ");
		String userid = scan.next();
		System.out.print(">> 비밀번호 입력 : ");
		String passwd = scan.next();

		System.out.println("입력 아이디 --> " + userid);
		System.out.println("입력 비밀번호 --> " + passwd);

<<<<<<< HEAD
		if (userid == "yb83" && passwd.equals("12345")) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!! 아이디 또는 비밀번호 오류!!");
		}

		switch (passwd) {
			case "12345":
				System.out.println("패스워드 변경 요망")
=======
		// if문 연습
		if (userid.equals("yb") && passwd.equals("12345")) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!! 아이디 또는 비밀번호 오류!");
		}

		// switch문 연습
		switch (passwd) {
			case "12345":
				System.out.println("패스워드 변경요망");
>>>>>>> 27b10b2f32332609b71b7614cc3868c08a5ae472
				break;
			case "12":
				System.out.println("패스워드 오류!");
				break;
			case "34":
				System.out.println("패스워드 오류2!!");
				break;
			default:
				System.out.println("전체 오류!");
				break;
		}

		// 3항연산 연습
		String result = (passwd.equals("12345")) ? "메인화면진입" : "로그인화면으로";
<<<<<<< HEAD
		System.out.println("다음화면 >> " + result);
	}
}


=======
		System.out.println("다음화면 >> " + result);		
	}
}
>>>>>>> 27b10b2f32332609b71b7614cc3868c08a5ae472
