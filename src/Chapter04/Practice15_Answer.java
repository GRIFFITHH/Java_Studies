package Chapter04;

public class Practice15_Answer {
	public static void main(String[] args) {
		int number = 1234321;
		int tmp = number;
		
		int result =0;
		
		while(tmp!=0) {
			result = result*10 + tmp%10;
			tmp /= 10; 
			//tmp�� 10�� �������� �ڸ����� ���ϰ� 
			//result�� 10�� ���ذ��� �ǵڿ� �ִ� ���ڸ� ������ �θ鼭 �������� ���ڸ� ������ش�.
		}
		if(number == result)
			System.out.println( number + " �� ȸ���� �Դϴ�."); 
			else
			System.out.println( number + "�� ȸ������ �ƴմϴ� ."); 
	}	
	
}
