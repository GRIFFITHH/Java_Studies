package Chapter04;

import java.util.Scanner;

public class FlowEx07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(1),바위(2),보(3) 중 하나를 내시오");
		int user = sc.nextInt();
		int com = (int)(Math.random()*3)+1;
		if(user<1 || 3<user) {
			System.out.println("잘못된 입력입니다.");
			//다시 게임을 시작하게 하려면 어떻게 해야하지??
		}else {
			
		switch(user-com) {
		
		case -1: case 2:
			System.out.println("패배");
			break;
		case 0:
			System.out.println("비김");
			break;
		case 1: case -2:
			System.out.println("이김");
			break;
			
		}
		}
		System.out.println("user:"+user);
		System.out.println("com:"+com);
	}
}
