package Chapter04;

import java.util.Scanner;

public class Practice12_myAnswer {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int since=scanner.nextInt();
		int until=scanner.nextInt();
		
		for (int i=2;i<=9;i+=3) {
			for (int j=1;j<=3;j++) {
				for (int k=i;k<=i+2;k++) {
					if (k>9)
						break;
					System.out.printf("%d*%d=%d\t",k,j,k*j);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
