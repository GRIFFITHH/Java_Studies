package Chapter04;

import java.util.Scanner;

public class Practice14 {
	public static void main(String[] args) {
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			count++;
			System.out.println("1�� 100������ ���� �Է��ϼ���:");
			input = sc.nextInt();
			if(input>answer)
				System.out.println("�� ���� ���� �Է��ϼ���");
			else if(input<answer)
				System.out.println("�� ū���� �Է��ϼ���");
			else {
				System.out.println("�����Դϴ�! ������ �����մϴ�.");
				System.out.println("�õ� Ƚ��:"+count);
				break;
			}
		}while(true);
	}
}
