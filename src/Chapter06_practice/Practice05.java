package Chapter06_practice;

class Student1 {
	String name;
	int ban,no,kor,eng,math,total;
	float average;
	
	Student1(String name,int ban,int no,int kor,int eng,int math){
	this.name=name;
	this.ban=ban;
	this.no=no;
	this.kor=kor;
	this.eng=eng;
	this.math=math;
}
	int getTotal() {
		total=eng+math+kor;
		return total;
	}
	float getAverage() {
		average=(int)(((eng+math+kor)/3f)*10+0.5f)/10f;
		return average;
	}
	
	String info(){//String info�� �ν��Ͻ� �޼���ν� �ٸ� �ν��Ͻ� �޼��� getTotal(),getAverage()�� ȣ�Ⱑ��
		return name
				+","+ban
				+","+no
				+","+kor
				+","+eng
				+","+math
				+","+getTotal()
				+","+getAverage();
	}
}
public class Practice05 {
	public static void main(String args[]) {
		Student1 s = new Student1("ȫ�浿",1,1,100,60,76); //������ �ִ� ����

		System.out.println(s.info());
		}
}
