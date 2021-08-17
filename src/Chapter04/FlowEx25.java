package Chapter04;

import java.util.Scanner;

public class FlowEx25 {
	public static void main(String[] args) {
		int num=0,sum=0;
		System.out.println("숫자를 입력하세요 ex)12345 >");
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num!=0) {
			sum+= num%10;
			System.out.printf("sum=%3d num=%d%n",sum,num);
			num/=10; 
		}
	}
}
