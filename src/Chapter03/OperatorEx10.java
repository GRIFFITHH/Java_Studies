package Chapter03;

public class OperatorEx10 {
	public static void main(String[] args) {
		int a = 1000000;
		
		int result1=a*a/a;
		int result2=a/a*a;
		
		System.out.println(result1); //a*a�� �����÷ο� �Ǿ����
		System.out.println(result2);
	}
}