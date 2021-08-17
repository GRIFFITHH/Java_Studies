package Practice;

abstract class TestA { // 추상클래스

	abstract void test1 (int x); // 내용을 구현하지않은 추상메서드
    	abstract void test2 ();
    
    }

class TestC {
	
}

class TestB extends TestC {
	
}


public class AbstractClass_practice {
public static void main(String[] args) {
	TestB b = new TestB();
}
}
