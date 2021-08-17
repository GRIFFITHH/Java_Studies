package Chapter05;

public class Practice07 {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
		}

		int money = Integer.parseInt(args[0]); //커맨드라인으로 받은 변수는 문자열이므로 정수로 변환한다.

		System.out.println("money=" + money); // 입력된 돈

		int[] coinUnit = { 500, 100, 50, 10 }; // 준비된 동전의 종류
		int[] coin = { 5, 5, 5, 5 }; // 준비된 돈의 갯수

		for (int i = 0; i < coinUnit.length; i++) { // 500,100,50,10마다 거슬러 줘야 하므로 배열의 길이만큼 실행
			int coinNum = 0; // 1)필요한 동전의 갯수 초기화
			
			coinNum = money/coinUnit[i]; //2)필요한 동전의 갯수 계산
			if(coinNum>coin[i]) { //3)우리가 갖고있는 동전의 갯수는 한정되어 있으므로 조건식을 걸어야 함
				coinNum=coin[i];
				coin[i]=0;
				
			}else {
				coin[i]-=coinNum;
				
			}
			money-=coinNum*coinUnit[i]; //4) 남은돈을 계산후 money에 넣어준다.
			
			// 1~4) 반복			
			
			System.out.println(coinUnit[i]+"원: "+coinNum); 
		}

		if (money > 0) { //for문의 반복이 끝나고 10원의 계산이 끝났을때 money가 남아있지 않으면 돈이 부족하지 않게 거슬러주므로 money=0이어서 if문이 실행되지 않는다.
			System.out.println(" 거스름돈이 부족합니다");
			System.exit(0); // . 프로그램을 종료한다
		}
		System.out.println("=남은 동전의 개수 =");
		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + " 원:" + coin[i]);
		}

	}
}
