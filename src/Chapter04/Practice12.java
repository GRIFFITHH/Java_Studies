package Chapter04;

public class Practice12 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 3; j++) {
				int x = j + 1 + (i - 1) / 3 * 3;
				int y = i % 3 == 0 ? 3 : i % 3;

				System.out.print(x + "*" + y + "=" + x * y + "\t");// "\t" 탭쳐줌
			}
			System.out.println(); //3개씩 출력후 밑으로 줄바꿈
			if (i % 3 == 0) // 만약 i가 3의 배수이면 즉 3번째줄의 출력이면 이때 한줄공백을 넣어줌
				System.out.println();
		}
	}
}