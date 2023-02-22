package basic.if_;

import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		 키와 나이를 입력받아서 사용자 놀이기구에
		 탑승 할 수 있는지의 여부를 판단 하시면 됩니다.
		 키 140cm 이상, 나이가 8세 이상인 사용자만
		 놀이기구 탑승이 가능하다고 가정하고, 판단 할 수 있는
		 로직을 작성해 보세요.
		 하나의 조건이라도 만족하지 못한다면 탑승이 불가능합니다.
		 
		 놀이기구 탑승 여부와 관계없이 "오늘 하루 즐거운 시간 되세요!"
		 를 출력하세요.
		 뛰어쓰기 안되는문자 네스트 앤드 &&(논리연산자)
		 int 소수점없는 숫자 double 소수점있는 숫자 String 문자
		 */
		System.out.print("키: ");
		int dog = sc.nextInt();
		System.out.print("나이: ");
		int age = sc.nextInt();

		if(dog >= 140 && age >= 8) {
			System.out.println("탑승가능하다");
		}
		else {
			System.out.println("탑승이불가능하다");
		}
		System.out.println("오늘 하루 즐거운 시간되세요!");
		sc.close();
		
	}

}
