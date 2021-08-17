package Chapter05;

public class Practice02 {
	public static void main(String[] args) {
		int[][] arr = {
				{40,40,40,40},
				{10,10,10},
				{20,20,20,20},
				{30,40}
		};
		
		System.out.println(arr.length);
		System.out.println(arr[3].length);
		System.out.println(arr[arr[3].length-1][1]);
	}
}
