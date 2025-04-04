package com.yb83.spring04;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring04Application {
   //public interface myMax { // 익명함수를 위한 인터페이스
   //int max(int a, int b);}

   public static void main(String[] args) {
    SpringApplication.run(Spring04Application.class, args);

    // 람다식
    //  1. 일반방식
    Spring04Application app = new Spring04Application();
    System.out.println(app.helloJava());

    //  2. 기존익명함수
    //System.out.println(new lambdaFunc()) {public int max(int a, int b) {return a > b ? a : b;}} . max(14, 34);

    //  3. 람다방식 !!
    myFuncInterface fi = () -> {System.out.println("Hello, Java! 난 람다람쥐 호출이야 'ㅅ'!"); };
    fi.printHello();

	myCalc calc = (x, y) -> { return x + y; };
	int result = calc.plus(100,55);
	System.out.println(result);

	// Stream API
	String[] avengers = Arrays.asList("IronMan", "Captain America", "SpiderMan", "Hulk", "AntMan");

	// 정렬
	Collections.sort(avengers);
	System.out.println(hero);

	for (String hore : avengers) {
		System.out.println(heor);
	}

	// 단점은 출력시 반복문 써야되고, 정렬 후 원본 순서가 사라짐
	System.out.println("스트림 aPI");
	// 2. 스트림 API 사용방식
	avengers = Arrays.asList("IronMan", "Captain America", "SpiderMan", "Hulk", "AntMan");
	
	Steam<String> avengerStream = avengers.steam
   
   
   // 일반 메서드 호출
   public String helloJava() {
      return "Hello, Java! 난 일반 호출이야 ^_^! ";
   }

   @FunctionalInterface // 함수형 인터페이스로 지칭. 함수형 인터페이스 만들 때 지켜야할 약속들 체크
   public interface myFuncInterface {
      void printHello();
   }
   
   @FunctionalInterface //안적어도 되지만 안전하게 해줌
   public interface myCalc {
	int plus(int x, int y);
   }

}



