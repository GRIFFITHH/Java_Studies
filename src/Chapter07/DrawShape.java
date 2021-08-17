package Chapter07;

class Shape {
	String color = "black";
	void draw() {
		System.out.printf("[color=%s]%n",color);
	}
}

class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	Point(){
		this(0,0);
	}
	String getXY() {
		return "("+x+"+"+y+")";
	}
}

class Circle extends Shape { //circle has a shape
	Point center; // point 객체 선언
	int r;
	
	Circle() {
		this(new Point(0, 0),100); 
		//circle은 점(circle is a point)가 아니라 circle은 점을 가지고 있다.(circle has a point)
		// 따라서 new Point(0,0) 객체 생성
	}
	Circle (Point center,int r){
		this.center=center;
		this.r=r;
	}
	void draw() {
		System.out.printf("PointCenter=(%d,%d),radius=%d,color=%s",center.x,center.y,r,color);
	}
}

class Triangle extends Shape {
	Point[] p;
	
	Triangle(Point[] p){
		this.p=p;
	}
	void draw() {
		System.out.printf("[P1=%s],[P2=%s],[P3=%s],color=%s%n",p[0].getXY(),p[1].getXY(),p[2].getXY(),color);
	}
}

public class DrawShape {
	public static void main(String[] args) {
		Point[] p = { new Point(100,100),
					  new Point(140, 50),
					  new Point(200,100)
		};
		
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150,150), 50);
		
		t.draw();
		c.draw();
	}
}
