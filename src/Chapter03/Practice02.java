package Chapter03;

public class Practice02 {
	public static void main(String[] args) {
		
		int numOfApples = 140; // ����� ����
		int sizeOfBucket = 10; // ( ) �ٱ����� ũ�� �ٱ��Ͽ� ���� �� �ִ� ����� ����
		int m = (numOfApples/sizeOfBucket);
		int n = (numOfApples%sizeOfBucket);
		int numOfBucket = ( m + (n<1 ? 0:1) ); // ��� ����� ��µ� �ʿ��� �ٱ����� ��
		
		System.out.println(" :"+numOfBucket);
		//n�� 0�϶� �ٽ� �����غ���

	}
}
