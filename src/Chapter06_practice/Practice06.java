package Chapter06_practice;

public class Practice06 {
	
	static double getDistance (int x,int y,int x1, int y1) {
		//두점간 거리를 구하는 메서드를 만든것
		double a = (x-x1)*(x-x1);
		double b = (y-y1)*(y-y1);
		
		return Math.sqrt((a+b));
		
	}
	
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
}
