package Chapter06_practice;
// 답확인 ok
class Student {
	String name;
	int ban,no,kor,eng,math;
	
	Student(String name,int ban,int no,int kor,int eng,int math){
	this.name=name;
	this.ban=eng;
	this.eng=eng;
	this.kor=kor;
	this.math=math;
	this.no=no;
}
	
	int getTotal() {
		int result = eng+math+kor;
		
		return result;
	}
	float getAverage(){
		float result = (int)(((eng+math+kor)/3f)*10+0.5f)/10f;
		
		return result;
	}
}
public class Practice03n04 {
	public static void main(String args[]) {
		Student s = new Student("홍길동",1,1,100,60,76); //생성자 있는 버전
//		s.name = "홍길동";
//		s.ban = 1;
//		s.no = 1;
//		s.kor = 100;
//		s.eng = 60;
//		s.math = 76;
		System.out.println("이름:"+s.name); 
		System.out.println("총점:"+s.getTotal()); 
		System.out.println("평균:"+s.getAverage()); 
		}
}
