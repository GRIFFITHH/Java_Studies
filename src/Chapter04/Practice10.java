package Chapter04;

public class Practice10 {
	public static void main(String[] args) {	
		int num = 12345;
		int sum = 0;
		
		for(int i=0;i<5;i++) { //�� �ټ����ΰ�? num�� 1�� �Ǿ������� 10���� ������ �������� 1�̾�!
			sum+=num%(10);	
			num/=(10);
		}
		System.out.println(sum);
		
	}
}
