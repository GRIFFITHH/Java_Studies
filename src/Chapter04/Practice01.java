package Chapter04;

public class Practice01 {
	public static void main(String[] args) {
		int x = 404;
		char ch = 'a';
		boolean powerOn = true;
		String str = "yes";
		
		if(x>10 && 20>x) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		//
		if(!(ch==' ' || ch =='\t')) { //공백 또는 탭일떄 의 대우 공백도 탭도 아닐때
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		//
		if(ch=='x'||ch=='X') {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		//
		if(ch>='0' && ch<='9') {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		//
		if(('a'<=ch && ch<='z')||('A'<=ch && ch<='Z')) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		//
		if((x%400==0||x%4==0)&& x%100!=0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		//
		if(!powerOn) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		//
		if(str.equals("yes")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
