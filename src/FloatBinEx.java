
public class FloatBinEx {
	public static void main(String[] args) {
		float f = 9.1234567f;
		int i = Float.floatToIntBits(f);
		
		System.out.printf("%f%n",f);
		System.out.printf("%X%n",i); //4111F9AD로 나와야 하는데 E로 나온이유: 그냥 그렇다고 한다 이해하고 넘어가자

	}
}
