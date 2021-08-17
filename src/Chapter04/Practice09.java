package Chapter04;

public class Practice09 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		int sumCh=0;
		
		for(int i =0;i<str.length();i++) {
//	정답코드	sum += str.charAt(i) - '0';  '0'의 의미와 왜 빼는건지 기억하자.

			int c = str.charAt(i);
			sum+=c-'0';
			sumCh+=c;
		}
		System.out.println("자리의 숫자값 합="+sum);
		System.out.println("각자리 숫자의 문자코드값의 합="+sumCh);
	}
}
