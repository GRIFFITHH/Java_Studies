package Chapter06_practice;
// ��Ȯ�� ok
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
		Student s = new Student("ȫ�浿",1,1,100,60,76); //������ �ִ� ����
//		s.name = "ȫ�浿";
//		s.ban = 1;
//		s.no = 1;
//		s.kor = 100;
//		s.eng = 60;
//		s.math = 76;
		System.out.println("�̸�:"+s.name); 
		System.out.println("����:"+s.getTotal()); 
		System.out.println("���:"+s.getAverage()); 
		}
}
