package Chapter03;

public class OperatorEx15 {
	public static void main(String[] args) {
		char LowerCase = 'a';
		char UpperCase = (char)(LowerCase-32); // char형과 int의 연산결과는 int이므로 char로 형변환을 해주어야한다.
		System.out.println(UpperCase);
	}
}
