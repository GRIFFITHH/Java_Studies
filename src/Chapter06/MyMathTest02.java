package Chapter06;

class MyMath2 {
	long a, b;
	long add() {return a+b;}
	long substract() {return a-b;}
	long multiply() {return a*b;}
	double divide() {return a/b;}
	
	static long add( long a, long b) {return a+b;}
	static long substract ( long a, long b) {return a-b;}
	static long multiply ( long a, long b) {return a*b;}
	static double divide ( long a, long b) {return a/b;}
}
public class MyMathTest02 {
	public static void main(String[] args) {
		MyMath2 mm = new MyMath2();
//		mm.a=200L;
//		mm.b=100L;
		System.out.println(mm.add(200,400));
		System.out.println(mm.substract());
		System.out.println(mm.multiply());
//		System.out.println(mm.divide());
		System.out.println("줄바꿈");
		System.out.println(MyMath2.add(200, 400)); //객체생성없이 사용가능 static
	}
}
