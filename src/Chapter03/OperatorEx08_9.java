package Chapter03;

public class OperatorEx08_9 {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		
		
		long c1 = a*b; 
		// int의 연산결과는 int 타입이다 int 타입의 연산결과값이 -1454759936라는것 
		//int값이 담을수있는 2*10^9를 넘어버려서 오버플로우가 발생!
		long c2 = (long)a*b;
		System.out.println(c1);
		System.out.println(c2);
		
		long d = 1_000_000*1_000_000;
		long e = 1_000_000*1_000_000L; //long과 int의 연산이므로 int는 자동으로 long으로 형변환된다.
		System.out.println(d);
		System.out.println(e);
	}
}
