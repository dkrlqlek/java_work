package basic.operator;

public class AssignmentOperater {

	public static void main(String[] args) {
		/*
		 # 대입 연산자 (=)
		 # 복합 대입 연산자 (+=, -+, *=, /=(몫만), %=(나머지))퍼센트기호 나머지
		 - 변수에 값을 대입할때 사용하는 연산자 입니다.
		 - 복합 대입 연산자는 대입 연사자에 산술 연산자가 결합되어 있다.
		 */

		int a = 5;
		int b = 5;
		
		b =+ 3; // b = +3;(x)
		System.out.println(b);
		
		a += 3; //a = a + 3
		System.out.println(a);
		
		System.out.println("-------------------");
		
		a -= 4; //a = a - 4 =4
		System.out.println(a);
		
		a *= 6; //a = a * 6 =24
		System.out.println(a);
		
		a /= 5; //a = a / 5 =4
		System.out.println(a);
		
		a %= 3; //a = a % 3 =1
		System.out.println(a);
		
		
	}

}
