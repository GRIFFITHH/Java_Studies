
public class CastingEx2 {
public static void main(String[] args) {
	int i = 10;
	byte b = (byte)i; // 10�� ����ȯ�� ���ս��� �Ͼ������
	System.out.printf("[int -> byte] i=%d -> b = %d%n",i,b);
	
	i = 300;
	b = (byte)i; //300�� ���ս��� ���� �ٸ����� ��µ�
	System.out.printf("[int -> byte] i=%d -> b=%d%n",i,b);
//	
//	b = 300; //300�� byte�� ���� ����. ���� ��������.
//	i = (int)b; 
//	System.out.printf("[byte -> int] b=%d -> i=%d%n",b,i);
	
	b = 10;
	i = (int)b;
	System.out.printf("[byte -> int]b=%d -> i=%d%n",b,i);
	
	b = -2;
	i = (byte)b;
	System.out.printf("[byte -> int] b=%d -> i=%d%n",b,i);
	
	System.out.println("i="+Integer.toBinaryString(i));
	
	
}
}
