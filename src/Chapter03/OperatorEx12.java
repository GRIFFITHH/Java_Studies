package Chapter03;

public class OperatorEx12 {
	public static void main(String[] args) {
		char c1 = 'a'; // c1에는 a의 유니코드가 저장됨
		char c2 = c1; // c1에 저장된 값이 c2에 저장됨
		char c3 = ' '; // 공백(blank)가 저장됨 , 초기화
		
		int i = c1 +1;
		
		c3 = (char)(c1+1);
		c2++;
		c2++;//코드값 97 에 2번 증가했으므로 99에 해당하는 문자를 출력한다 c2는!
		System.out.println(c1);
		System.out.println((int)c1);
		System.out.println("i="+i);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);//c1+1은 98이고 char로 형변환했으므로
	}
}
