package Chapter06;

class Mathmathics { //MyMath��� Ŭ������ ����� �ش�.
	long add (long a , long b) {
		long result = a+b;
		return result;
	}
}

public class MyMathTest {
	public static void main(String[] args) {	
		Mathmathics mm; //�������� mm ���� 
       		mm = new Mathmathics(); 
            	//�������� mm�� new�� �̿��Ͽ� ��ü�� (��Ȯ�� ���ϸ� �ּҸ�)����  
            	//'='�� �̿��Ͽ� �ּ�����
		long result1 = mm.add(1L, 2L);//������ ��ü�� ����Ͽ� ������ result1�� ���� ����
        //�̶� �Է����ִ� ���� type�� �����ؾ��Ѵ�.
		
		System.out.println("add(1L, 2L)="+result1);
	}
}