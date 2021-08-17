package Chapter04;

public class Practice06 {
	public static void main(String[] args) {
		int i=1;
		int sum = 0;
		while(i<=6) {
			int j =1;
			while(j<=6) {
				sum=i+j;
				if( i+j==6) {
					System.out.println("["+i+","+j+"]");
					System.out.println(sum=i+j);
				}
				j++;
			}
			i++;
		}
	}
}
