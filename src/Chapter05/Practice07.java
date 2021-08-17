package Chapter05;

public class Practice07 {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
		}

		int money = Integer.parseInt(args[0]); //Ŀ�ǵ�������� ���� ������ ���ڿ��̹Ƿ� ������ ��ȯ�Ѵ�.

		System.out.println("money=" + money); // �Էµ� ��

		int[] coinUnit = { 500, 100, 50, 10 }; // �غ�� ������ ����
		int[] coin = { 5, 5, 5, 5 }; // �غ�� ���� ����

		for (int i = 0; i < coinUnit.length; i++) { // 500,100,50,10���� �Ž��� ��� �ϹǷ� �迭�� ���̸�ŭ ����
			int coinNum = 0; // 1)�ʿ��� ������ ���� �ʱ�ȭ
			
			coinNum = money/coinUnit[i]; //2)�ʿ��� ������ ���� ���
			if(coinNum>coin[i]) { //3)�츮�� �����ִ� ������ ������ �����Ǿ� �����Ƿ� ���ǽ��� �ɾ�� ��
				coinNum=coin[i];
				coin[i]=0;
				
			}else {
				coin[i]-=coinNum;
				
			}
			money-=coinNum*coinUnit[i]; //4) �������� ����� money�� �־��ش�.
			
			// 1~4) �ݺ�			
			
			System.out.println(coinUnit[i]+"��: "+coinNum); 
		}

		if (money > 0) { //for���� �ݺ��� ������ 10���� ����� �������� money�� �������� ������ ���� �������� �ʰ� �Ž����ֹǷ� money=0�̾ if���� ������� �ʴ´�.
			System.out.println(" �Ž������� �����մϴ�");
			System.exit(0); // . ���α׷��� �����Ѵ�
		}
		System.out.println("=���� ������ ���� =");
		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + " ��:" + coin[i]);
		}

	}
}
