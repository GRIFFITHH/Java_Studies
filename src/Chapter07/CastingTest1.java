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
//		car.water(); car에 fe를 형변환해서 넣었지만 water는 쓸수없는 이유는 car는 water를 호출할수없는 참조변수이다. (리모콘버튼개수가 적다.)
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
		System.out.println("멈춰!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!");
	}
}