package basic;

import java.util.Scanner;

public class CelToFahr {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("온도를 입력해주세요.");
		double sell = sc.nextDouble();
		double tole = (sell*9/5) + 32; 
		System.out.println("섭씨온도값: " + sell +"℃");
		System.out.println("변환값: " + tole +"℉");
		
		sc.close();
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("온도를 입력해주세요(℃): ");
		double cel = sc.nextDouble(); //더블은 소수점있는거,인트는 소수점없는거
		
		double fahr = cel * 1.8 + 32;
		
		System.out.printf("입력한 섭씨: %.1f℃\n",cel);
		System.out.printf("변환한 화씨: %.1f℉\n",fahr);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("온도를 입력해주세요(℃): ");
		int cel = sc.nextDouble();
		
		double fahr = cel * 9.0 / 5 + 32;
		
		System.out.printf("입력한 섭씨: %.1f℃\n",cel);
		System.out.printf("변환한 화씨: %.1f℉\n",fahr);
		
		sc.close();
		*/
		
		

	}

}
