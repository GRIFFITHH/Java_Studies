package Chapter04;

import java.util.Scanner;

public class FlowEx07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����(1),����(2),��(3) �� �ϳ��� ���ÿ�");
		int user = sc.nextInt();
		int com = (int)(Math.random()*3)+1;
		if(user<1 || 3<user) {
			System.out.println("�߸��� �Է��Դϴ�.");
			//�ٽ� ������ �����ϰ� �Ϸ��� ��� �ؾ�����??
		}else {
			
		switch(user-com) {
		
		case -1: case 2:
			System.out.println("�й�");
			break;
		case 0:
			System.out.println("���");
			break;
		case 1: case -2:
			System.out.println("�̱�");
			break;
			
		}
		}
		System.out.println("user:"+user);
		System.out.println("com:"+com);
	}
}
