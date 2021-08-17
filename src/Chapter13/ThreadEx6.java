package Chapter13;

import javax.swing.*;

public class ThreadEx6 {
    public static void main(String[] args) {
        Runnable r = new ThreadEx6_1();
        Thread t = new Thread(r);

        t.start();

        String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
        System.out.println("입력하신 값은"+ input +"입니다.");

    }
}

class ThreadEx6_1 implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}