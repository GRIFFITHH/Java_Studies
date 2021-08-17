package Practice.Exercise7;

class Product2
{
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    Product2() {
        this(10000);
    }

    Product2(int price) {
        this.price = price;
        bonusPoint =(int)(price/10.0);
    }
}
class Tv extends Product2 {
    Tv(){}

    public String toString() {
        return "Tv";
    }
}


public class Exercise7_5 {
    public static void main(String[] args) {
        Tv t = new Tv();

        System.out.println(t.price+","+t.bonusPoint);
    }

}

