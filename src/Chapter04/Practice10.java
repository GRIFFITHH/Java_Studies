package Chapter04;

public class Practice10 {
	public static void main(String[] args) {	
		int num = 12345;
		int sum = 0;
		
		for(int i=0;i<5;i++) { //왜 다섯번인가? num이 1이 되었을때도 10으로 나누면 나머지가 1이야!
			sum+=num%(10);	
			num/=(10);
		}
		System.out.println(sum);
		
	}
}
