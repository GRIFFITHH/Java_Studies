package Chapter06;


class MemberCall1 {
	int iv =10; //�ν��Ͻ�����
	static int cv =20; //Ŭ���� ����
	
	int iv2 =cv;
//	static int cv2 = iv; ERROR Ŭ���������� �ν��Ͻ� ������ ����� �� ����
	static int cv2 =  new MemberCall1().iv; //Ŭ���� ������ �ν��Ͻ������� ����ϴ� ���
	
	static void staticMethod() {
		System.out.println(cv);
//		System.out.println(iv); ERROR Ŭ���� �ż���� �ν��Ͻ������� �Ժη� ����Ҽ�����.
		MemberCall1 c = new MemberCall1(); 
		System.out.println(c.iv); //Ŭ���� �޼��忡�� �ν��Ͻ������� ����ϴ� ���
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); //�ν��Ͻ� �޼���� ������� ��������� ��밡��
	}
	
	static void staticMethod1() {
		staticMethod();
//		instanceMethod(); ERROR
		MemberCall1 c = new MemberCall1();
		c.instanceMethod1();//��ü�� �����ؾ� ��밡���ϴ�
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
