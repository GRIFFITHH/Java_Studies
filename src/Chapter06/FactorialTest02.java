package Chapter06;

import java.util.Scanner;

public class FactorialTest02 {
	public static void main(String[] args) {
		long result = 0;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			result = factorial(i);
			if (i <= 20) {
				System.out.printf(" %2d! = %20d", i, result);
				System.out.println();
			} else {
				System.out.println("��ȿ���� ���� �����Դϴ�. �����մϴ�.");
				break;
			}
		}
	}

	static long factorial(int n) {
		if (n <= 0 || n > 20)
			return -1;
		if (n <= 1)
			return 1;
		return n * factorial(n - 1);
	}
}
