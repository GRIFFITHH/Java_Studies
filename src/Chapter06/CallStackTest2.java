package Chapter06;
//method의 시작과 종료순서를 알 수 있는 예제
public class CallStackTest2 {
	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작되었음");
		firstMethod();
		System.out.println("main(String[] args)이 종료되었음");
	}


static void firstMethod() { //메서드는 함수다 매개변수가 필요하다.
	System.out.println("firstMethod()이 시작되었음");
	secondMethod();
	System.out.println("firstMethod()이 종료되었음");
	
}

static void secondMethod() {
	System.out.println("secondMethod()이 시작되었음");
	System.out.println("secondMethod()이 종료되었음");
}

}