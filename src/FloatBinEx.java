
public class FloatBinEx {
	public static void main(String[] args) {
		float f = 9.1234567f;
		int i = Float.floatToIntBits(f);
		
		System.out.printf("%f%n",f);
		System.out.printf("%X%n",i); //4111F9AD�� ���;� �ϴµ� E�� ��������: �׳� �׷��ٰ� �Ѵ� �����ϰ� �Ѿ��

	}
}
