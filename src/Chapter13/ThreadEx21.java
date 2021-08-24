package Chapter13;

public class ThreadEx21 {
    public static void main(String[] args) {
        Runnable r = new RunnableEx21();
//        Thread th1 = new Thread(r);
//        Thread th2 = new Thread(r);
//        th1.start();
//        th2.start();
        new Thread(r).start();
        new Thread(r).start();
    }
}


class Account {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int money) {
        synchronized (this){
            if (balance >=money) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {

                }

                balance -= money;

            }
        }
    } // withdraw
}

class RunnableEx21 implements Runnable {
    Account acc = new Account();

    @Override
    public void run() {
        while (acc.getBalance() > 0) {
            int money = (int) (Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println("balance" + acc.getBalance());
        }
    } // run
}


