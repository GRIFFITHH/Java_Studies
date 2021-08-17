package Chapter06_practice;

public class Practice18 {

	public static void change(int str) {
		str+=456;
		System.out.println(str);
	}
	
	public static void main(String[] args) {
	int str = 123;
	System.out.println(str);
	change(str);
	System.out.println("After change:"+str);
}
}
