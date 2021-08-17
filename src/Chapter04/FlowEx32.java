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
			System.out.print("원하는 메뉴 (1~3)을 선택하세요, 종료하시려면 0 을 눌러주세요");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (menu<1 || menu>3) {
				System.out.println("숫자를 잘못입력하셨습니다.>>선택창으로 돌아갑니다.");
				continue;
			}else {
				System.out.println("귀하가 선택하신 menu는"+menu+"입니다.");
				continue;
			}
		}
	}
}
