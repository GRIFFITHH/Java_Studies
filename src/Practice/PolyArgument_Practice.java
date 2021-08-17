package Practice;

class Product {
	int price;
	
	Product (int price) {
		this.price=price;
	}
}

class Customer {
	int money = 1000;
	Product[] item = new Product[100];
	int i=0;
	void Purchase (Product x) {
		if(money < x.price) {
			System.out.println("금액이 부족해 구매할 수 없습니다. 모자란 금액"+(x.price - money));
			return;
		}else {
		money = money - x.price;
		item[i++]=x;
		System.out.println(x.toString()+"를 구매하였습니다. 남은돈"+money);
		}
	}
	void List () {
		System.out.println("구매한 물품들");
		for(int i=0; i<item.length;i++) {
			if(item[i]==null)
				break;
			else
			System.out.println(item[i]);
		}
	}
}

class Tv extends Product {
	Tv(){
		super(300);
	}
	 public String toString() { 
		return "TV";
	}
}

class Computer extends Product {
	Computer(){
		super(400);
	}
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio(){
		super(100);
	}
	public String toString() {
		return "Audio";
	}
}

class Car extends Product {
	Car(){
		super(500);
	}
	public String toString() {
		return "Car";
	}
}


public class PolyArgument_Practice {
	public static void main(String[] args) {
		Customer cus = new Customer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();
		Car car = new Car();
		cus.Purchase(com);
		cus.Purchase(tv);
		cus.Purchase(audio);
		cus.Purchase(car);
		cus.List();
	}
}
