package com.yb83.spring04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring04Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring04Application.class, args);
<<<<<<< HEAD
		// 문자열, 시간타입 핸들링
		String greeting = "Hello";
		System.out.println(greeting);
=======

		// 문자열, 시간타입 핸들링
		String string1 = "Hello"; // 일반적으로 사용
		System.out.println(string1);
		
		String string2 = new String("Hello"); // 기본
		System.out.println(string2);
>>>>>>> 27b10b2f32332609b71b7614cc3868c08a5ae472

		System.out.println(string1 == string2); // 둘이 같은 주소를 쓰는 변수인지 질문
		System.out.println(string1.equals(string2)); // 둘이 가지고 있는 데이터가 같은지

<<<<<<< HEAD
		String string3 = string2; // stirng2번의 주소를 string3에 할당

		System.out.println(string2 == stirng3);
		System.out.pringln(string2.equals(string3));

		//문자열 메서드 연습
		String carstr = "avante, ionic, x3";
		String[] cars = carstr.split(".");
=======
		String string3 = string2; // string2번의 주소를 string3에 할당

		System.out.println(string2 == string3);
		System.out.println(string2.equals(string3));

		// 문자열 메서드 연습
		String carstr = "avante, ionic, x3";
		String[] cars = carstr.split(",");
>>>>>>> 27b10b2f32332609b71b7614cc3868c08a5ae472
		for (String car : cars) {
			System.out.println(car.trim());
		}

		for (String car : cars) {
			System.out.println(car.toUpperCase());
		}

<<<<<<< HEAD
		String caresult = carstr.replace(",", "/");
		System.out.println(caresult);
		String caresult2 = carstr.replace(",", "/"); // Java에서 ''는 Char(글자 한자)
		System.out.println(caresult2);

		Char[] charLst = string1.toCharArray(); //
		for (char oneChar : charLst) {
			System.out.println(oneChar);
		}
		System.out.println(caresult1.indexOf(:io)); // avante/ionic/x3 io의 위치는 7
		System.out.println(caresult1.lastindexOf("")); // avante/ionic/x3 io의 위치는 7
		
=======
		String caresult1 = carstr.replace(", ", "/");
		System.out.println(caresult1);
		String caresult2 = carstr.replace(',', '/'); // Java에서 ''는 Char(글자 한자)
		System.out.println(caresult2);
		
		char[] charLst = string1.toCharArray();  // 
		for (char oneChar : charLst) {
			System.out.println(oneChar);
		}

		System.out.println(caresult1.indexOf("io")); // avante/ionic/x3 io의 위치는 7
		System.out.println(caresult1.lastIndexOf("n")); // 9
		System.out.println(caresult1.length()); // 15

>>>>>>> 27b10b2f32332609b71b7614cc3868c08a5ae472
	}
}
