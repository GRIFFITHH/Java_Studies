package Chapter04;

public class Practice12 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 3; j++) {
				int x = j + 1 + (i - 1) / 3 * 3;
				int y = i % 3 == 0 ? 3 : i % 3;

				System.out.print(x + "*" + y + "=" + x * y + "\t");// "\t" ������
			}
			System.out.println(); //3���� ����� ������ �ٹٲ�
			if (i % 3 == 0) // ���� i�� 3�� ����̸� �� 3��°���� ����̸� �̶� ���ٰ����� �־���
				System.out.println();
		}
	}
}