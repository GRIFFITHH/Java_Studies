package Chapter03;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("������ �Է����ֶ���");
		int num =sc.nextInt() ;
		System.out.println( num>0 ? "���" : (num < 0 ? "����": 0)  );
		}

}
