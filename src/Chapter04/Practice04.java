package Chapter04;
//�ٽ�Ǯ��
public class Practice04 {
	public static void main(String[] args) {
		int x=0,y=1,sum=0;
		
		for(int i=1;sum<100;y=-y,i++) {
// , �� ��� ����ϴ°���?=>� ��쿡�� �ʱ�ȭ���� �� �̻� ���� �� �ְ�, ������ ���� �� �̻� ���� �� �ִ�. 
//�̷� ��쿡�� ��ǥ(,)�� �����ؼ� �ۼ��Ѵ�.
//[��ó] String �ڹ��ʺ� = "�ݺ���:for��";|�ۼ��� ������
			x=y*i;
			sum+=x;
//			if(sum>=100) {
//				break;
//			}
		}
	System.out.println(x+","+sum);
	}
}
