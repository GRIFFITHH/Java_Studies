package Chapter05;

import java.util.Scanner;

public class Practice12 {
	public static void main(String[] args) {
		String[][] words = {
				{"chair","����"},
				{"computer","��ǻ��"},
				{"integer","����"}
		};
		int correct = 0;
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<words.length;i++) {
			System.out.printf("Q%d. %s�� ����?",i+1,words[i][0]);
			
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("�����Դϴ�. %n%n");
				
				correct++;
				
				
			}else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�. %n%n",words[i][1]);
				 
			}
		}
		System.out.println("��ü 3 ������"+correct+"���� ���߼̽��ϴ�.");
	}
}
