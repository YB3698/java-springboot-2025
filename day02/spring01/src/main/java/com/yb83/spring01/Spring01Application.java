package com.yb83.spring01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring01Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring01Application.class, args);

		// while문 - 조건에 맞지 않으면 한번도 실행안됨
		int num = 10;

		while (num >= 0) {
			System.out.println(num);
<<<<<<< HEAD
			num--;  // num을 1식 감소시키는 것
		}

		System.out.println("whele문 종료!");
		
		
		// do-while문 - 조건에 맞지 않아도 한번은 실행됨
		int cnt = 1;
		do {
			System.out.println(cnt);
			cnt++; // cnt를 1씩 증가시키는 것
		} while (cnt < 1);
		
		System.out.println("do-while문 종료!");
		
		num = 1;
		
		//break, continue
		while(num < 11) {
			if (num % 2 == 0) {
				num++;  // num을 1씩 감소
				break;  // if문 조건이 참이면 반복문 완전히 탈출
				// continue;를 쓰면 if문 조건이 참이면 빠져 나가서 반복문 위로 다시 올라감
			}	
		}
		System.out.println(num);
		num++;	// num을 1씩 감소
=======
			num--;  // num를 1씩 감소
		}

		System.out.println("while문 종료!");

		// do-while문 - 조건에 맞지 않아도 한번은 실행이 됨
		int cnt = 1;
		do {
			System.out.println(cnt);
			cnt++; // cnt를 1씩 증가
		} while (cnt < 10);

		System.out.println("do-while문 종료!");

		num = 1;
		// break, continue		
		while (num < 11) {
			if (num % 2 == 0) {
				num++;  // num를 1씩 감소
				break; // if문 조건이 참이면 반복문 완전히 탈출
				//continue; // if문 조건이 참이면 빠져나가서 반복문 위로 다시 올라감
			}

			System.out.println(num);
			num++;  // num를 1씩 감소			
		}

		System.out.println("break/continue 종료!");
>>>>>>> 27b10b2f32332609b71b7614cc3868c08a5ae472
	}

}
