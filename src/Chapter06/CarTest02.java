package Chapter06;
class Car2 {
	String color;
	String gearType;
	int door;
	
	Car2(){
		this("White","auto",4);
	}
	Car2(String color){
		this(color,"auto",4);
	}
	Car2(String color,String gearType,int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
public class CarTest02 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
		Car2 c3 = new Car2("SkyBlue","Self",2);
		
		System.out.println("c1ÀÇ color="+c1.color+",gearType="+c1.gearType+",door="+c1.door);
		System.out.println("c2ÀÇ color="+c2.color+",gearType="+c2.gearType+",door="+c2.door);
		System.out.println("c3 color="+c3.color+",gearType="+c3.gearType+",door="+c3.door);
	}
}
