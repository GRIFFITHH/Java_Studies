package Chapter06_practice;
//����
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
		System.out.println(str+" �� �����Դϱ�? "+isNumber(str)); 
		str = "1234o";
		System.out.println(str+" �� �����Դϱ�? "+isNumber(str)); 
		}

}
