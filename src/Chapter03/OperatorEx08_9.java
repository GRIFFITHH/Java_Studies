package Chapter03;

public class OperatorEx08_9 {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		
		
		long c1 = a*b; 
		// int�� �������� int Ÿ���̴� int Ÿ���� ���������� -1454759936��°� 
		//int���� �������ִ� 2*10^9�� �Ѿ������ �����÷ο찡 �߻�!
		long c2 = (long)a*b;
		System.out.println(c1);
		System.out.println(c2);
		
		long d = 1_000_000*1_000_000;
		long e = 1_000_000*1_000_000L; //long�� int�� �����̹Ƿ� int�� �ڵ����� long���� ����ȯ�ȴ�.
		System.out.println(d);
		System.out.println(e);
	}
}
