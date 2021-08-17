package Chapter06_practice;

class MyPoint {
	int x; // �ν��Ͻ�����
	int y;
	
	MyPoint (int x, int y){
		this.x=x;
		this.y=y;
	}
	
	double getDistance (int x1, int y1) { //�Ű������� ���������̴�. 253page
		//**static�� �پ������� ������ ���µ�? -> static�� ������ �ν��Ͻ� ������ �� �� ���!
		//������ �Ÿ��� ���ϴ� �޼��带 �����
		double a = (x-x1)*(x-x1);//x1,y1�� ���� �Է¹޴� ���������̴�. �ä���
		double b = (y-y1)*(y-y1);
		
		return Math.sqrt((a+b));
		
	}
	
}

public class Practice07 {
	public static void main(String args[]) {
		MyPoint p = new MyPoint(1,1);
		// p (2,2) . �� �� �Ÿ��� ���Ѵ�
		System.out.println(p.getDistance(2,2));
		}
}
