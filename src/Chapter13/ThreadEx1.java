package Chapter13;

public class ThreadEx1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();

        Runnable r = new ThreadEx1_2(); //Runnable 로 구현한 클래스의 인스턴스
        Thread t2 = new Thread(r); // Thread클래스 생성자의 매개변수로 제공

        t1.start();
        t2.start();
    }
}

class ThreadEx1_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(0);
        }
    }
}

class ThreadEx1_2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(1);
        }
    }
}
