package Chapter07;

interface Human {
    void eat ();

    void attack();
}

class Man implements Human {

    @Override
    public void eat() {
        System.out.println("밥을 먹었습니다.");
    }

    @Override
    public void attack() {

    }
}

public class Interface {
    public static void main(String[] args) {
        Man man = new Man();
        man.eat();
    }
}
