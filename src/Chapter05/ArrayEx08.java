package Chapter05;

public class ArrayEx08 {
	public static void main(String[] args) {
		int[] ball = new int[45];
		
		for(int i=0;i<ball.length;i++) {
			ball[i] =1+i; 
		}
		
		int tmp = 0;
		int j = 0;
		
		for(int i=0;i<6;i++) {
			j = (int)(Math.random()*45); //index�� ��ġ�� �̴°Ŷ� 0~44������ ����
			tmp = ball[i];
			ball[i]=ball[j];
			ball[j]=tmp; // ball[j]���� tmp�� ball[i]�� ���� ���� �ʱ� i=1,2,3,4,5,6�� ������ �����
			System.out.printf(ball[j]+",");
		}
		System.out.println();
		for(int i=0; i<6;i++) {
			System.out.printf(ball[i]+",");
		}
	}
}
