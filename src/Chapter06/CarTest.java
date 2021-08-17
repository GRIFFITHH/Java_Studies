package Chapter06;
class Car1 {
	String color;
	String gearType;
	int door;
	
	Car1(){}
	Car1(String c, String g, int d){
		color=c;
		gearType = g;
		door=d;
	}
}
public class CarTest {
	public static void main(String[] args) {
		Car1 c1 =new Car1();
		c1.color= "Black";
		c1.gearType="auto";
		c1.door=2;
		
		Car1 c2 = new Car1("white","auto",4);
		
		System.out.println(c1.color+","+c1.gearType+","+c1.door);
		System.out.println(c2.color+","+c2.gearType+","+c2.door);
	}
}
