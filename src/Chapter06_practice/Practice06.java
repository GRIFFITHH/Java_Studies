package Chapter06_practice;

public class Practice06 {
	
	static double getDistance (int x,int y,int x1, int y1) {
		//������ �Ÿ��� ���ϴ� �޼��带 �����
		double a = (x-x1)*(x-x1);
		double b = (y-y1)*(y-y1);
		
		return Math.sqrt((a+b));
		
	}
	
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
}
