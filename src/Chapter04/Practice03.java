package Chapter04;

public class Practice03 {
	public static void main(String[] args) {
		int sum =0;
		int totalSum =0;
		for(int i=1;i<=10;i++) {
			sum+=i;
			totalSum+=sum;
			System.out.print(sum+",");	
		}
		System.out.println("гу>>"+totalSum);
	}
}
