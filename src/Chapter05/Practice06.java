package Chapter05;

public class Practice06 {
	public static void main(String[] args) {
		int[] coinUnit = {500,100,50,10};
		
		int money = 2680;
		System.out.println("money="+money);
		
		for(int i=0;i<coinUnit.length;i++) {
			
			System.out.println(coinUnit[i]+" : "+money/coinUnit[i]);
			money%=coinUnit[i];
			
		}
	}
}


// 5-6과 5-7의 차이는 동전의 갯수가 유한이냐 무한이냐 차이다.
