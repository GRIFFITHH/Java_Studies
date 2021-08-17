package Chapter03;

public class OperatorEx11 {
	public static void main(String[] args) {
		char d = 'd';
		char g = 'g';
		char zero = '0';
		char two = '2';
		
		System.out.printf("'%c'-'%c'=%d%n",g,d,g-d);
		System.out.printf("'%c'-'%c'=%d%n",two,zero,two-zero);
		System.out.printf("'%c'=%d%n",d,(int)d);
		System.out.printf("'%c'=%d%n",g,(int)g);
		System.out.printf("'%c'=%d%n",zero,(int)zero);
		System.out.printf("'%c'=%d%n",two,(int)two);
	}
}
