package Practice;

abstract class TestA { // �߻�Ŭ����

	abstract void test1 (int x); // ������ ������������ �߻�޼���
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
