package Chapter04;

import java.util.Scanner;

public class FlowEx32 {
	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("���ϴ� �޴� (1~3)�� �����ϼ���, �����Ͻ÷��� 0 �� �����ּ���");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else if (menu<1 || menu>3) {
				System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�.>>����â���� ���ư��ϴ�.");
				continue;
			}else {
				System.out.println("���ϰ� �����Ͻ� menu��"+menu+"�Դϴ�.");
				continue;
			}
		}
	}
}
