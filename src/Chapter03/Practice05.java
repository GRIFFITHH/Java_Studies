package Chapter03;

public class Practice05 {
	public static void main(String[] args) {
		int num = 333;
		System.out.println(num/10*10+1); // '/'부터 연산됨으로써 33.3에서 소수점이 날아가버린다.
	}// 나눗셈 연산자는 반올림을 하지 않고 버림을 한다! 4번도 같은 원리!
}
