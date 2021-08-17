package Chapter04;

public class Practice15 {
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		
		int result =0;
		
		while(tmp!=0) {
			int a = number%10;
			int b = number/10000%10;
			int c = number/10%10;
			int d = number/1000%10;
			if(a==b) {
				if(c==d){
					result=number;
					break;
				}else {
					break;
				}
			}else {
				break;
			}
		}
		if(number == result)
			System.out.println( number + " 는 회문수 입니다."); 
			else
			System.out.println( number + "는 회문수가 아닙니다 ."); 
	}
}
