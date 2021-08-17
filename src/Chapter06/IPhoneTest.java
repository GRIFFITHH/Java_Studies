package Chapter06;

class iPhone {
String model;
String color;
int capacity;

iPhone(){
    model ="iPhoneX";
    color = "White";
    capacity = 64; 
    }

iPhone (String model , String color , int capacity) {
	this.model = model;
	this.color = color;
	this.capacity = capacity;
	}
}

public class IPhoneTest {
	public static void main(String[] args) {
		iPhone i1 = new iPhone();
		//iPhone i2 = new iPhone("blue");
		iPhone i3 = new iPhone("iPhone12","SpaceGray",128);
		
		System.out.println("i1ÀÇ model="+i1.model+",color="+i1.color+",capacity="+i1.capacity+"GB");
		//System.out.println("i2ÀÇ color="+i2.model+",gearType="+i2.gearType+",door="+i2.door);
		System.out.println("i3 model="+i3.model+",color="+i3.color+",capacity="+i3.capacity+"GB");
	}
}