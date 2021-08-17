package Chapter06_practice;
//정리
public class Practice22 {
	
	static boolean isNumber(String a) {
		for(int i=0;i<a.length();i++) {
			char b = a.charAt(i);
			if((b>='a' && b<='z') || a.equals("") || a==null)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+" 는 숫자입니까? "+isNumber(str)); 
		str = "1234o";
		System.out.println(str+" 는 숫자입니까? "+isNumber(str)); 
		}

}
