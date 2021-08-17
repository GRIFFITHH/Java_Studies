package Chapter03;

public class Practice02 {
	public static void main(String[] args) {
		
		int numOfApples = 140; // 사과의 개수
		int sizeOfBucket = 10; // ( ) 바구니의 크기 바구니에 담을 수 있는 사과의 개수
		int m = (numOfApples/sizeOfBucket);
		int n = (numOfApples%sizeOfBucket);
		int numOfBucket = ( m + (n<1 ? 0:1) ); // 모든 사과를 담는데 필요한 바구니의 수
		
		System.out.println(" :"+numOfBucket);
		//n이 0일때 다시 생각해보기

	}
}
