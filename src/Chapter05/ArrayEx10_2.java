package Chapter05;

public class ArrayEx10_2 {
	public static void main(String[] args) {
		int[] numArr = new int[10]; // 길이10의 배열선언 -> 배열을 선언했다면 배열을 채워주자
		for(int i=0;i<numArr.length;i++) 
			System.out.print(numArr[i]=(int)(Math.random()*10)); //0~9의 숫자중 랜덤으로 하나씩 뽑아서 배열에 순서대로 채워준다.
			
		//배열의 자리바꿈 횟수는 배열의길이 -1 이다.
		System.out.println();
		for(int i=0; i<numArr.length-1;i++) {//total 자리바꿈
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