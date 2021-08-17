package Chapter04;

public class Practice08_1 {
	public static void main(String[] args) {
		int sum=0;
		for(int x=0;x<=10;x++)
			for(int y=0;y<=10;y++) {
				sum = 2*x+4*y;
				if(sum==10) {
					System.out.println(x+","+y);
				}
			}
	}
}
