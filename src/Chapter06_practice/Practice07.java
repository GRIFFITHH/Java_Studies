package Chapter06_practice;

class MyPoint {
	int x; // 인스턴스변수
	int y;
	
	MyPoint (int x, int y){
		this.x=x;
		this.y=y;
	}
	
	double getDistance (int x1, int y1) { //매개변수도 지역변수이다. 253page
		//**static이 붙었을때는 에러가 났는데? -> static이 붙으면 인스턴스 변수를 쓸 수 없어서!
		//두점간 거리를 구하는 메서드를 만든것
		double a = (x-x1)*(x-x1);//x1,y1은 직접 입력받는 지역변수이다. ㅓㅏㅡ
		double b = (y-y1)*(y-y1);
		
		return Math.sqrt((a+b));
		
	}
	
}

public class Practice07 {
	public static void main(String args[]) {
		MyPoint p = new MyPoint(1,1);
		// p (2,2) . 와 의 거리를 구한다
		System.out.println(p.getDistance(2,2));
		}
}
