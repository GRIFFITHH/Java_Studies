package Chapter05;

public class ArrayEx10_2 {
	public static void main(String[] args) {
		int[] numArr = new int[10]; // ����10�� �迭���� -> �迭�� �����ߴٸ� �迭�� ä������
		for(int i=0;i<numArr.length;i++) 
			System.out.print(numArr[i]=(int)(Math.random()*10)); //0~9�� ������ �������� �ϳ��� �̾Ƽ� �迭�� ������� ä���ش�.
			
		//�迭�� �ڸ��ٲ� Ƚ���� �迭�Ǳ��� -1 �̴�.
		System.out.println();
		for(int i=0; i<numArr.length-1;i++) {//total �ڸ��ٲ�
			boolean changed = false;
			for(int j =0;j<numArr.length-1-i;j++) {
				if(numArr[j]>numArr[j+1]) {
					int tmp = numArr[j];
					numArr[j]=numArr[j+1];
					numArr[j+1]=tmp;
					changed = true;
				}
			}
			if(!changed) break;
			
			for(int k=0;k<numArr.length;k++) 
				System.out.print(numArr[k]);
			System.out.println();
		}
	}

}