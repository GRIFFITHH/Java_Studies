package Chapter07;

public class PointTest {
	public static void main(String[] args) {
		Point3D p3 = new Point3D(1,2,3);
		System.out.println(p3.getLocation());
	}
}

class Point2D {
	int x,y;
	public Point2D() {
		
	}
	Point2D(int x, int y){
		this.x=x;
		this.y=y;
	}
	String getLocation() {
		return "x:" + x + ", y:" + y;
	}
}

class Point3D extends Point2D {
	int z;
	
	Point3D(int x,int y,int z){ // Error!!
		//super(); �����Ͻ� ����
		this.x=x;
		this.y=y;
		this.z=z;
	}
	String getLocation() {
		return "x:" + x + ", y:" + y +", z:" + z;
	}
}
