package Chapter04;

public class Practice09 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		int sumCh=0;
		
		for(int i =0;i<str.length();i++) {
//	�����ڵ�	sum += str.charAt(i) - '0';  '0'�� �ǹ̿� �� ���°��� �������.

			int c = str.charAt(i);
			sum+=c-'0';
			sumCh+=c;
		}
		System.out.println("�ڸ��� ���ڰ� ��="+sum);
		System.out.println("���ڸ� ������ �����ڵ尪�� ��="+sumCh);
	}
}
