package Chapter05;

import java.util.Scanner;

public class MultiArrEx01 {
	public static void main(String[] args) {
		final int SIZE = 10;
		int x = 0, y = 0;
		
		char[][] board = new char [SIZE][SIZE];
		byte[][] shipBoard = {
				//	1	2	3	4	5	6	7	8	9  board의 배열은 10x10 shipBoard의 배열크기는 9x9이다. 그래야 입력하는 숫자와 index의 숫자를 통일 시킬 수 있기때문 쉽게 입력하기 위해서
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
			board[0][i] = board[i][0] = (char)(i+'0'); // 화면에서 좌표의 위치를 확인시켜줄 첫번째 행,열
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.printf("좌표를 입력하세요.(종료는00)>");
			String input = sc.nextLine();
			
			if(input.length()==2) {
				x = input.charAt(0)-'0'; // 입력한 String 문자열의 첫번째 문자에서 '0'을빼면 정수값이 나온다. ex) '1'-'0' = int 1
				y = input.charAt(1)-'0';
				
				if(x==0 && y==0) break;
			}
			if(input.length()!=2 || x<=0||x>=SIZE||y<=0||y>=SIZE) { //2자리 좌표를 입력해주어야하는데 1자리 입력하면 안되게끔
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
				continue;
			}
			board[x][y] = shipBoard[x-1][y-1]==1 ? 'O':'X'; // 배열을 2개만든 궁극적이유 비교해야할 대상이 필요!
			
			for(int i = 0 ;i<SIZE;i++) {
				System.out.println(board[i]);
				System.out.println();
			}
			
		}
	}
}
