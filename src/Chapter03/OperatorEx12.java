package Chapter03;

public class OperatorEx12 {
	public static void main(String[] args) {
		char c1 = 'a'; // c1���� a�� �����ڵ尡 �����
		char c2 = c1; // c1�� ����� ���� c2�� �����
		char c3 = ' '; // ����(blank)�� ����� , �ʱ�ȭ
		
		int i = c1 +1;
		
		c3 = (char)(c1+1);
		c2++;
		c2++;//�ڵ尪 97 �� 2�� ���������Ƿ� 99�� �ش��ϴ� ���ڸ� ����Ѵ� c2��!
		System.out.println(c1);
		System.out.println((int)c1);
		System.out.println("i="+i);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);//c1+1�� 98�̰� char�� ����ȯ�����Ƿ�
	}
}
