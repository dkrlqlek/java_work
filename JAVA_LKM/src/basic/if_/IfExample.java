package basic.if_;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요: ");
		int point = sc.nextInt();
		System.out.println("내 점수: " + point + "점");
		System.out.println("----------------------");
//		만약에 if(참)반응else(거짓)반응 폴스 >=크거나 작거나 참인경우에반응하고 
//		트루 거짓된실행하지않고건너뛴다 그리고 거짓까지 포함할때 else
//		폴스 조건이맞으면 건너뛴다 트루 반응한다
		if(point >= 70) {
			System.out.println("70점 이상입니다.");
			System.out.println("합격하셨습니다!");
		} else {
			System.out.println("70점 미만입니다.");
			System.out.println("불합격하셨습니다 ㅠㅠ");
		}
		
		System.out.println("시험 치르느라 수고하셨습니다~");
		
		
		
		
		sc.close();
		
	}

}
