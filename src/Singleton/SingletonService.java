package Singleton;

public class SingletonService implements Service {
    //1. static 영역에 객체를 딱 1개만 생성, 프로그램이 종료될때까지 존재
    private static final Service instance = new SingletonService();
    //2. public으로 열어서 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 조회하도록 허용
    public static Service getInstance() {
        return instance;
    } //3. 생성자를 private으로 선언, 외부에서 new 키워드를 사용한 객체 생성을 못하게 막는다.

    private SingletonService() {
    }
    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}