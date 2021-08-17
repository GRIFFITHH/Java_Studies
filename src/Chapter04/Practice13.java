package Chapter04;

public class Practice13 {
	public static void main(String[] args) {
		String value = "12d34";
		char ch =' ';
		boolean isNumber = true; // boolean의 디폴트값이 true이므로 굳이 if 에서 true false의 시비를 가릴필요가 없다.
		for(int i=0; i<value.length();i++) {
			ch = value.charAt(i);
			if(!('0'<ch && ch<'9')) {
				isNumber = false;
				break;
			}
		}
		if(isNumber) {
			System.out.println(value+"는 숫자입니다.");
		}else {
			System.out.println(value+"는 숫자가 아닙니다.");
		}
		
	}
}
