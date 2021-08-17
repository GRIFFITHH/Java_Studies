
public class CastingEx2 {
public static void main(String[] args) {
	int i = 10;
	byte b = (byte)i; // 10은 형변환시 값손실이 일어나지않음
	System.out.printf("[int -> byte] i=%d -> b = %d%n",i,b);
	
	i = 300;
	b = (byte)i; //300은 값손실이 생겨 다른값이 출력됨
	System.out.printf("[int -> byte] i=%d -> b=%d%n",i,b);
//	
//	b = 300; //300은 byte에 담길수 없다. 따라서 오류난다.
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
