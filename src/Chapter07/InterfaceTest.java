package Chapter07;

class A {
	public void method( inter i) { //inter를 상속한 클래스의 객체만 받아들인다.
		i.method();
	}
	
}

interface inter { //껍데기
	void method();
}

class C implements inter { //알맹이1
	public void method() {
		System.out.println("클래스 C");
	}
}

class B implements inter { //알맹이2
	public void method() {
		System.out.println("클래스 B");
	}
}


public class InterfaceTest {
	public static void main(String[] args) {
		A a = new A(); //A는 interface라는 껍데기만을 쓰므로
		a.method(new C()); // 알맹이를 자유롭게 바꿔쓸수있다. 알맹이의 내용을 자유롭게 바꿔서 쓸수도있다.
		a.method(new B()); // new는 객체의 주소를 할당하므로 inter를 상속받은 B객체의 주소를 넣어줌
	}
}
