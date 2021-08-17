package Practice;

interface MathClass {
	void mathHomework();
}

class Student1 implements MathClass {

	@Override
	public void mathHomework() {
		System.out.println("¼öÇÐ ¼÷Á¦Áß");
		
	}

}
public class Interface_practice {
	static MathClass S1 = new Student1();
	public static void main(String[] args) {
	S1.mathHomework();
	}
}
