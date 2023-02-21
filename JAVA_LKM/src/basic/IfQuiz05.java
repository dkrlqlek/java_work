package basic;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class IfQuiz05 {

	public static void main(String[] args) {
		
		/*
		 # 국어, 영어, 수학 점수를 각각 입력받아서
		  평균을 구해 보세요. (평균은 소수점 첫째 자리까지 출력)
		 평균이 90점이 넘는다면, 다시 한 번 조건을 검사해서
		 95 ~ 100 -> A+
		 94 ~ 90 -> A0
		 80점대는 B, 70점대는 C, 60점대는 D, 나머지는
		 모두 F 처리하시면 됩니다. (100점이 만점)
		 
		 ex)
		 평균 점수: 95.5
		 당신의 학점은 A+ 입니다.
		 */
		//print:다음칸에 안넘어가는거 println다음칸에 넘어가 입력,출력,변수
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어: ");
		double korea = sc.nextDouble();
		System.out.print("영어: ");
		double eng = sc.nextDouble();
		System.out.print("수학: ");
		double math = sc.nextDouble();
		
		double avg = (korea + eng + math) / 3;
		System.out.printf("평균 점수%.1f\n", avg );
		if(avg >= 90) {
			if(avg >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("A0");
			}
		} 
		else if(avg >= 80) {
			System.out.println("B");
		}
		else if(avg >= 70) {
			System.out.println("C");
		}
		else if(avg >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		
		
		

	}

}
