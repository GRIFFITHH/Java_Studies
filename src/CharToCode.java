
public class CharToCode {
	public static void main(String[] args) {
		char ch = 'A';
		int code = (int)ch;
		System.out.printf("%c=%d(%#X)%n",ch,code,code);//%c(char)를 %d로 변환
		char hch = '가';
		System.out.printf("%c=%d(%#X)%n",hch,(int)hch,(int)hch);
	}
}
