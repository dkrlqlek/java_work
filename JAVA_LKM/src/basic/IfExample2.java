package basic;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요: ");
		int age = sc.nextInt();
//		20살이상은 트루로 빠져서 안나옴 17살~19살까지
//		폴스는 17이여도 빠져나간다 14~16까지 
		if(age >= 20) {
			System.out.println("성인입니다.");
		} else if(age >= 17) {
			System.out.println("고등학생입니다.");
		} else if(age >= 14) {
			System.out.println("중학생입니다.");
		} else if(age >= 8) {
			System.out.println("초등학생입니다.");
		} else {
			System.out.println("미취학 아동입니다.");
		}
		
		sc.close();

	}

}
