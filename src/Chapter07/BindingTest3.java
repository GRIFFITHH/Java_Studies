package Chapter07;

public class BindingTest3 {
	public static void main(String[] args) {
		Parent p =new Child();
		Child c =new Child();
		
		System.out.println("p.x="+p.x);
		p.method();
		System.out.println();
		System.out.println("c.x="+c.x); 
		// 인스턴스변수에 직접 접근하면 참조변수의 타입(p,Parent냐c,Child냐)에 따라 사용되는 인스턴스변수가 달라질 수 있으므로
		// 실제론 private로 멤버변수의 접근을 제한한다.
		c.method();
	}
}

class Parent {
	int x = 100;
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	int x = 200;
	void method() {
		System.out.println("x="+x);
		System.out.println("super.x="+super.x);
		System.out.println("this.x="+this.x);
	}
}