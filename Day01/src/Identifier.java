
public class Identifier {

	public static void main(String[] args) {
		
		//꼭 지켜야 할 규칙 (안 지킬 시 에러가 발생할 수 있습니다.)
		//1. 식별자의 이름은 중복을 허용하지 않습니다.
		//그리고, 대/소문자를 철저하게 구분합니다.
		
		int age = 35;
//		int age = 40; (x)
		int Age = 40;
		System.out.println(age);
		System.out.println(Age);
		
		//2. 식별자 이름은 숫자로 지정하거나 숫자로 시작하시면 안됩니다.
//		int 700 = 365; (x)
//		int 7number = 7; (x)
		int number7111 = 7;
		int number7ber = 7;
		
		//3, 식별자 이름에 공백을 포함할 수 없습니다.
//		int my birth day = 19921013; (x)
		int mybirthday = 19921013;
		int mybirthDay = 19921013; //camel case
		
		
		//4. 식별자 이름에 쓸 수 있는 특수문자는 밑줄(_), 달러기호($)
		//뿐입니다. 하지만 사용을 권장하지는 않습니다.
		//저 특수문자들은 사용하기로 약속한 곳이 지정되어 있습니다.
		String $hello = "안녕";
		
		//5. 키워드(예약어)는 식별자 이름으로 사용이 불가능합니다.
		//키워드는 이미 어떠한 기능을 내포하고 있는 지정 문자입니다.
//		String class = "클래스"; (x)
		String Class = "클래스"; //(권장하지 않습니다.)
		String className = "클래스";
		
		//6. 한글이나 한자 같은 식별자 이름도 지정이 가능합니다.
		//하지만 사용을 권장하지는 않습니다.
		int 숫자 = 10;
		String 名 = "홍길동";
		System.out.println(숫자);
		System.out.println(名);		
//		int 이름을 대충 짖지말자 변수명 따로지어주는 사이트있씀 구글검색
//	8비트=>1바이트 1킬로바이트 124바이트 1메가바이트 1240바이트
//		원주률 실수형은 double더블 string기분데이터타입이 아니면서 편하게쓸수있다.
//	int 20억정도		
		
		
		
		
		

	}

}
