package Chapter04;

public class Practice05 {
	public static void main(String[] args) {
		int i=0;
		while(i<=10) {
			int j = 0;
			while(j<i) {
				System.out.printf("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
