package Chapter07;

class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10);
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Product[] item = new Product[10];
	int i = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++]=p;
		System.out.println(p+"을/를 구입하였습니다.");
	}
	void summary() {
		int sum = 0;
		String itemList="";
		
		for(int i=0;i<item.length;i++) {
			if(item[i]==null)break;
			sum+=item[i].price;
			itemList += item[i]+",";
		}
	}
}

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());//Tv t = new Tv();b.buy(t); 를 한번에 적은 문장
		b.buy(new Computer());
		b.summary();
		System.out.println("현재 남은 돈은"+b.money+"만원입니다.");
		System.out.println("현재 보너스점수는"+b.bonusPoint+"점입니다.");
	}
}
