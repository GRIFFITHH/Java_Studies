package Chapter04;

import java.util.Scanner;

public class FlowEx03 {
	public static void main(String[] args) {
		System.out.print("���ڸ� �Է��ϼ���.>");
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		if(input==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0 �Դϴ�.");
			
		}else {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
		}
	}
}
