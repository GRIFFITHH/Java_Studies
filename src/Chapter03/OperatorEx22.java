package Chapter03;

public class OperatorEx22 {
	public static void main(String[] args) {
		float f = 0.1f;
		double d = 0.1;
		double d2 = f;
		
		System.out.printf("10.0==10.0f %b%n",10.0==10.0f);
		System.out.printf("0.1==0.1f %b%n",0.1==0.1f);
		System.out.printf("f=%19.17f%n",f); //전체 19자리중 17자리만 
		System.out.printf("d=%19.17f%n",d);
		System.out.printf("d2=%19.17f%n",d2);
		System.out.printf("d==f %b%n",d==f);
		System.out.printf("d==d2 %b%n",d==d2);
		System.out.printf("d2==f %b%n",d2==f);
		System.out.printf("(float)d==f %b%n",(float)d==f);
		
		System.out.println("-----------------------------");
		double v = 0.1;
		float b = 0.1f;
		
		System.out.printf("v==b %b%n",(float)v==b);
		System.out.printf("v==b %b%n",v==b); // 두가지 비교의 차이를 잘 파악하자
		
	}
}
