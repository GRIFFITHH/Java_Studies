package Chapter05;

public class Practice10 {
	public static void main(String[] args) {
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
			// 0 1 2 3 4 5 6 7 8 9
			char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
			String src = "abc123";
			String result = ""; //result�� ���������� �����غ����Ѵ�.
			// src charAt() result ���ڿ� �� ���ڸ� ���� �ϳ��� �о ��ȯ �� �� ����
			for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			
			if(ch>='a' && ch <='z') {
				result += abcCode[ch-'a'];
			} else {
				result += numCode[ch-'0'];
			}
			
			
			
			}
			System.out.println("src:"+src);
			System.out.println("result:"+result);

	}
}
