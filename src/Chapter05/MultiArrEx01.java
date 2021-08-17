package Chapter05;

import java.util.Scanner;

public class MultiArrEx01 {
	public static void main(String[] args) {
		final int SIZE = 10;
		int x = 0, y = 0;
		
		char[][] board = new char [SIZE][SIZE];
		byte[][] shipBoard = {
				//	1	2	3	4	5	6	7	8	9  board�� �迭�� 10x10 shipBoard�� �迭ũ��� 9x9�̴�. �׷��� �Է��ϴ� ���ڿ� index�� ���ڸ� ���� ��ų �� �ֱ⶧�� ���� �Է��ϱ� ���ؼ�
		/*1*/	{   0,	0,	0,	0,	0,	0,	1,	0,	0 },
		/*2*/	{   1,	1,	1,	1,	0,	0,	1,	0,	0 },
		/*3*/	{   0,	0,	0,	0,	0,	0,	1,	0,	0 },
		/*4*/	{   0,	0,	0,	0,	0,	0,	1,	0,	0 },
		/*5*/	{   0,	0,	0,	0,	0,	0,	0,	0,	0 },
		/*6*/	{   1,	1,	0,	1,	0,	0,	0,	0,	0 },
		/*7*/	{   0,	0,	0,	1,	0,	0,	0,	0,	0 },
		/*8*/	{   0,	0,	0,	1,	0,	0,	0,	0,	0 },
		/*9*/	{   0,	0,	0,	0,	0,	1,	1,	1,	0 }  
		};
		
		for(int i=1;i<SIZE;i++)
			board[0][i] = board[i][0] = (char)(i+'0'); // ȭ�鿡�� ��ǥ�� ��ġ�� Ȯ�ν����� ù��° ��,��
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.printf("��ǥ�� �Է��ϼ���.(�����00)>");
			String input = sc.nextLine();
			
			if(input.length()==2) {
				x = input.charAt(0)-'0'; // �Է��� String ���ڿ��� ù��° ���ڿ��� '0'������ �������� ���´�. ex) '1'-'0' = int 1
				y = input.charAt(1)-'0';
				
				if(x==0 && y==0) break;
			}
			if(input.length()!=2 || x<=0||x>=SIZE||y<=0||y>=SIZE) { //2�ڸ� ��ǥ�� �Է����־���ϴµ� 1�ڸ� �Է��ϸ� �ȵǰԲ�
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���");
				continue;
			}
			board[x][y] = shipBoard[x-1][y-1]==1 ? 'O':'X'; // �迭�� 2������ �ñ������� ���ؾ��� ����� �ʿ�!
			
			for(int i = 0 ;i<SIZE;i++) {
				System.out.println(board[i]);
				System.out.println();
			}
			
		}
	}
}
