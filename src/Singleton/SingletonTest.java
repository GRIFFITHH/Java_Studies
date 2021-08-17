package Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        //몇개의 인스턴스를 생성하든 같은 인스턴스를 생성
        Service singletonService1 = SingletonService.getInstance();
        Service singletonService2 = SingletonService.getInstance();

        System.out.println("진실 혹은 거짓 : "+(singletonService1 == singletonService2));

    }
}