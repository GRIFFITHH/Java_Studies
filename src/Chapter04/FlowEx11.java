package Chapter04;

import java.util.Scanner;

public class FlowEx11 {
	public static void main(String[] args) {
		System.out.println("����� �ֹι�ȣ�� �Է��ϼ��� ex)930731-1000000");
		Scanner sc = new  Scanner(System.in);
		String regNum = sc.nextLine();
		char regId = regNum.charAt(7);
		
		switch(regId) {
		case '1': case '3':
			switch(regId) {
			case '1':
				System.out.println("2000�� ���� ����� �����Դϴ�.");
				break;
			case '3':
				System.out.println("2000�� ���� ����� �����Դϴ�.");
			}
			break;
		case '2': case '4':
			switch(regId) {
			case '2':
				System.out.println("2000�� ���� ����� �����Դϴ�.");
				break;
			case '4':
				System.out.println("2000�� ���� ����� �����Դϴ�.");
			}
			break;
		}
	}
}
