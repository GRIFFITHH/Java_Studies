package Chapter06;


class MemberCall1 {
	int iv =10; //인스턴스변수
	static int cv =20; //클래스 변수
	
	int iv2 =cv;
//	static int cv2 = iv; ERROR 클래스변수는 인스턴스 변수를 사용할 수 없음
	static int cv2 =  new MemberCall1().iv; //클래스 변수가 인스턴스변수를 사용하는 방법
	
	static void staticMethod() {
		System.out.println(cv);
//		System.out.println(iv); ERROR 클래스 매서드는 인스턴스변수를 함부로 사용할수없다.
		MemberCall1 c = new MemberCall1(); 
		System.out.println(c.iv); //클래스 메서드에서 인스턴스변수를 사용하는 방법
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); //인스턴스 메서드는 어떤변수든 자유자재로 사용가능
	}
	
	static void staticMethod1() {
		staticMethod();
//		instanceMethod(); ERROR
		MemberCall1 c = new MemberCall1();
		c.instanceMethod1();//객체를 생성해야 사용가능하다
	}
	
	void instanceMethod2() {
		staticMethod();
		instanceMethod1();
	}
}


public class MemberCall {
	public static void main(String[] args) {
		
	}
}
