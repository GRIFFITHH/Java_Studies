package Chapter04;

import java.util.Scanner;

public class FlowEx08 {
	public static void main(String[] args) {
		System.out.println("당신의 주민번호를 입력하세요 ex)930731-1000000");
		Scanner sc = new  Scanner(System.in);
		String regNum = sc.nextLine();
		char regId = regNum.charAt(7);
		
		switch(regId) {
		case '1':
			System.out.println("남자입니다.");
			break;
		case '2':
			System.out.println("여자입니다.");
			break;
		}
		
	}
}
