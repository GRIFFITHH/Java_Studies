package Chapter06;
//method�� ���۰� ��������� �� �� �ִ� ����
public class CallStackTest2 {
	public static void main(String[] args) {
		System.out.println("main(String[] args)�� ���۵Ǿ���");
		firstMethod();
		System.out.println("main(String[] args)�� ����Ǿ���");
	}


static void firstMethod() { //�޼���� �Լ��� �Ű������� �ʿ��ϴ�.
	System.out.println("firstMethod()�� ���۵Ǿ���");
	secondMethod();
	System.out.println("firstMethod()�� ����Ǿ���");
	
}

static void secondMethod() {
	System.out.println("secondMethod()�� ���۵Ǿ���");
	System.out.println("secondMethod()�� ����Ǿ���");
}

}