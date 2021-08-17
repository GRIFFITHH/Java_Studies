package Chapter05;

public class Practice04 {
	public static void main(String[] args) {
		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		int total = 0;
		float average = 0;
		int all = 0; // 전체 배열의 개수
		
		for(int i=0; i<arr.length;i++) {
			all+=arr[i].length;
			average=total/all;
			for(int j=0;j<arr[i].length;j++) {
				total+=arr[i][j];
				average=total/(float)all;
			}
		}
		System.out.println(total);
		System.out.println(all);
		System.out.println(average);
	}
}
