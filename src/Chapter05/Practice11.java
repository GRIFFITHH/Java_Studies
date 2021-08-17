package Chapter05;

public class Practice11 {
	public static void main(String[] args) {
		int[][] Arr = {
				{100, 100, 100}
				, {20, 20, 20}
				, {30, 30, 30}
				, {40, 40, 40}
				, {50, 50, 50}
				};
				int[][] Arr2 = new int[Arr.length + 1][Arr[0].length + 1];
				for (int i = 0; i < Arr.length; i++) {
					for (int j = 0; j < Arr[i].length; j++) {
						
						Arr2[i][j]=Arr[i][j];
						Arr2[i][Arr[0].length] += Arr2[i][j];
						Arr2[Arr.length][j] += Arr2[i][j];
						Arr2[Arr.length][Arr[0].length] += Arr2[i][j];
						
						
					}
				}
				for (int i = 0; i < Arr2.length; i++) {
					for (int j = 0; j < Arr2[i].length; j++) {
						System.out.printf("%4d", Arr2[i][j]);
					}
					System.out.println();
				}

	}
}
