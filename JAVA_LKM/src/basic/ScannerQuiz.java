package basic;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //스캐너 객체를 생성sc가 받는역활을한다
		

		/*
		 - 스캐너를 사용하여 이름과 나이를 입력받아서
		 
		 이름: XXX
		 나이: XX세
		 출생년도: XXXX년
		 
		 을 출력하세요. (출력 함수는 마음대로 사용해서 출력하시고
		 출생년도는 입력사항이 아닙니다.)
		 */
		
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		System.out.printf("이름:%s\n",name);
		System.out.printf("나이:%d세\n",age);
		
		System.out.println("출생년도: " + (2023 - age) + "년");
		
		sc.close();
		
		
	    
		
		

	}

}
