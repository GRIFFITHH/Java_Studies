package Chapter06_practice;

public class Practice23 {
	
	static int max(int[] arr) {
		
		if(arr==null|| arr.length==0) {
			return -999999;
		}
		
		int a = arr[0];
		for(int i=1; i<arr.length;i++) {
			if(arr[i]>a)
				a=arr[i];
		}
		
		return a;
	}
	
	public static void main(String[] args)
	{
	int[] data = {3,2,9,4,7};
	System.out.println(java.util.Arrays.toString(data));
	System.out.println(" 최대값:"+max(data)); 
	System.out.println(" 최대값:"+max(null)); 
	System.out.println(" 최대값:"+max(new int[]{})); // 0 최대값 크기가 인 배열
	}

}
