package Chapter04;

import java.util.Scanner;

public class FlowEx08 {
	public static void main(String[] args) {
		System.out.println("����� �ֹι�ȣ�� �Է��ϼ��� ex)930731-1000000");
		Scanner sc = new  Scanner(System.in);
		String regNum = sc.nextLine();
		char regId = regNum.charAt(7);
		
		switch(regId) {
		case '1':
			System.out.println("�����Դϴ�.");
			break;
		case '2':
			System.out.println("�����Դϴ�.");
			break;
		}
		
	}
}
