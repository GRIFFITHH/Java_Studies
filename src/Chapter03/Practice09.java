package Chapter03;

public class Practice09 {
	public static void main(String[] args) {
		char ch = '1';
		boolean b = (ch >='a' && ch <='z' || ch>='A' && ch<='Z' || ch>='0' && ch <= '9');
		
		System.out.println(b);
	}
}
