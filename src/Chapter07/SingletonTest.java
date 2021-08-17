package Chapter07;

final class Singleton {
	private static Singleton s = new Singleton();
	
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if(s==null)
			s=new Singleton();
		return s; //Singleton() 객체 반환
	}
}

public class SingletonTest {
	public static void main(String[] args) {
//	Singleton s = new Singleton(); //constructor 가 보이지않는단다 private니까 그렇다
		Singleton s = Singleton.getInstance(); // s에 아무것도 저장되어있지않으면 객체를 만들어준다.
		Singleton a = Singleton.getInstance(); //s라는 참조변수에 객체가 만들어지는것은 제한하지만 다른 참조변수엔 만들수있다.
	}
}
