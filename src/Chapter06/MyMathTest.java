package Chapter06;

class Mathmathics { //MyMath라는 클래스를 만들어 준다.
	long add (long a , long b) {
		long result = a+b;
		return result;
	}
}

public class MyMathTest {
	public static void main(String[] args) {	
		Mathmathics mm; //참조변수 mm 선언 
       		mm = new Mathmathics(); 
            	//참조변수 mm에 new를 이용하여 객체를 (정확히 말하면 주소를)생성  
            	//'='를 이용하여 주소저장
		long result1 = mm.add(1L, 2L);//생성한 객체를 사용하여 연산후 result1에 값을 저장
        //이때 입력해주는 값의 type에 주의해야한다.
		
		System.out.println("add(1L, 2L)="+result1);
	}
}