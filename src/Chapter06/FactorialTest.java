package Chapter06;

import java.util.Scanner;

public class FactorialTest {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		n= sc.nextInt();
		
		int result = factorial(n);
		
		System.out.println(result);
	}
	
	static int factorial(int n) {
		int result=0;
		if(n==1||n==0) {
			result = 1;
		} else if(n>1 && n<13) {
			result = n*factorial(n-1);
		}
		return result;
	}
	
}
