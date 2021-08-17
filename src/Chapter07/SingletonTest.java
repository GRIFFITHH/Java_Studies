package Chapter07;

final class Singleton {
	private static Singleton s = new Singleton();
	
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if(s==null)
			s=new Singleton();
		return s; //Singleton() ��ü ��ȯ
	}
}

public class SingletonTest {
	public static void main(String[] args) {
//	Singleton s = new Singleton(); //constructor �� �������ʴ´ܴ� private�ϱ� �׷���
		Singleton s = Singleton.getInstance(); // s�� �ƹ��͵� ����Ǿ����������� ��ü�� ������ش�.
		Singleton a = Singleton.getInstance(); //s��� ���������� ��ü�� ��������°��� ���������� �ٸ� ���������� ������ִ�.
	}
}
