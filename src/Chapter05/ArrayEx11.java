package Chapter05;

public class ArrayEx11 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for(int i=0; i<numArr.length;i++) {
			numArr[i]=(int)(Math.random()*10);
			System.out.print(numArr[i]);
		}
		System.out.println();
		for(int i=0;i<numArr.length;i++) {
			counter[numArr[i]]++; // i로 인덱스를 지정하고 그 지정한 인덱스에 저장된값(초기값=0)을 ++ 연산자를 이용하여 1씩증가시켜준다.
		}
		for(int i=0;i<numArr.length;i++) {
			System.out.println(i+"의 개수 :"+counter[i]);
		}
	}
}
