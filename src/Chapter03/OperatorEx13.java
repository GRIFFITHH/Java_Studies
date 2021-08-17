package Chapter03;

public class OperatorEx13 {
	public static void main(String[] args) {
		char  c1 = 'a'; //c1은 유니코드로 저장된 값이기 때문에
		char c2 = (char)(c1+1);//int로 인식됨 따라서 char로 형변환 해주어야 한다.
		char c3 = 'a'+1;
	}
}
