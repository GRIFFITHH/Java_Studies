package Chapter06_practice;

public class Practice20 {
	
	static int[] shuffle (int[] original) {
		for(int i=0;i<original.length;i++) {
		int x = (int)(Math.random()*10-1); // �̰� �ٷ� -1<x<9 ->x=0,1,2,3,4,5,6,7,8 index�� ��
		int tmp = original[i];
		original[i]=original[x];
		original[x]=tmp;
		}
		return original;
	}
	
	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original); //Ŭ���� ������� ����ϴ� shuffle�� static���� ������ش�
		System.out.println(java.util.Arrays.toString(result));
	}

}
