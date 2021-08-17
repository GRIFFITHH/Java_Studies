package Chapter13;

public class ThreadEx3 {
    public static void main(String[] args) {
        ThreadEx2_1 t = new ThreadEx2_1();
        t.run();
    }
}

class ThreadEx3_1 extends Thread {
    @Override
    public void run() {
        throwException();
    }

    public void throwException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}