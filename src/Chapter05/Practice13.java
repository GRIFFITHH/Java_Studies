package Chapter05;

import java.util.Scanner;

public class Practice13 {
	public static void main(String[] args) {
		String[] words = {"television","computer","mouse","phone"};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<words.length;i++) {
			char[] question = words[i].toCharArray();
			
			for(int j=0;j<question.length;j++	) {
			int x = (int)(Math.random()*question.length);
			char tmp = question[j];
			question[j]=question[x];
			question[x] =tmp;
			}
			
			
			
			System.out.printf("Q%d. %s�� ������ �Է��ϼ���.>",i+1,new String(question));
			
			String answer = sc.nextLine();
			
			if(words[i].equals(answer.trim()))
				System.out.println("�¾ҽ��ϴ�.");
			else
				System.out.println("Ʋ�Ƚ��ϴ�.");
		}
	}
}