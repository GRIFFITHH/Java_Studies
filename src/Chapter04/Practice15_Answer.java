package Chapter04;

public class Practice15_Answer {
	public static void main(String[] args) {
		int number = 1234321;
		int tmp = number;
		
		int result =0;
		
		while(tmp!=0) {
			result = result*10 + tmp%10;
			tmp /= 10; 
			//tmp는 10씩 나눠가며 자릿수를 구하고 
			//result는 10씩 곱해가며 맨뒤에 있던 숫자를 선봉에 두면서 역순으로 숫자를 만들어준다.
		}
		if(number == result)
			System.out.println( number + " 는 회문수 입니다."); 
			else
			System.out.println( number + "는 회문수가 아닙니다 ."); 
	}	
	
}
