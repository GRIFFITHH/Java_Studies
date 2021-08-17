package Chapter04;

import java.util.Scanner;

public class FlowEx17 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요. > ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int num = Integer.parseInt(str);
		
		for(int i=0;i<num;i++) {
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
	}
	}
}
