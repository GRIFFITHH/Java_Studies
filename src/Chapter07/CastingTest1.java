package Chapter07;

public class CastingTest1 {
	public static void main(String[] args) {
		Car car ;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		fe.water();
		car = (Car)fe;
		car.color= "black";
		car.door=2;
		System.out.println("color:"+car.color +"\ndoor:"+ car.door);
//		car.water(); car�� fe�� ����ȯ�ؼ� �־����� water�� �������� ������ car�� water�� ȣ���Ҽ����� ���������̴�. (�����ܹ�ư������ ����.)
		fe2 = (FireEngine)car;
		fe2.water();
		
		
	}
}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive,Brrrr~");
	}
	
	void stop() {
		System.out.println("����!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!");
	}
}