package Chapter03;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("정수를 입력해주떼여");
		int num =sc.nextInt() ;
		System.out.println( num>0 ? "양수" : (num < 0 ? "음수": 0)  );
		}

}
