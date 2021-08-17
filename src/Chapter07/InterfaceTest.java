package Chapter07;

class A {
	public void method( inter i) { //inter�� ����� Ŭ������ ��ü�� �޾Ƶ��δ�.
		i.method();
	}
	
}

interface inter { //������
	void method();
}

class C implements inter { //�˸���1
	public void method() {
		System.out.println("Ŭ���� C");
	}
}

class B implements inter { //�˸���2
	public void method() {
		System.out.println("Ŭ���� B");
	}
}


public class InterfaceTest {
	public static void main(String[] args) {
		A a = new A(); //A�� interface��� �����⸸�� ���Ƿ�
		a.method(new C()); // �˸��̸� �����Ӱ� �ٲ㾵���ִ�. �˸����� ������ �����Ӱ� �ٲ㼭 �������ִ�.
		a.method(new B()); // new�� ��ü�� �ּҸ� �Ҵ��ϹǷ� inter�� ��ӹ��� B��ü�� �ּҸ� �־���
	}
}
