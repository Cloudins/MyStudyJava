package Thread_;

public class homework02 {
    public static void main(String[] args) {
        T t = new T();
        Thread thread01 = new Thread(t);
        thread01.setName("t1");
        thread01.start();
        Thread thread02 = new Thread(t);
        thread02.setName("t2");
        thread02.start();
    }
}
class T implements Runnable{
    private int money = 10000;

    @Override
    public void run() {while (true){
        synchronized (this){
            if (money < 1000){
                System.out.println("余额不足……");
                break;
            }
            money -= 1000;

            System.out.println(Thread.currentThread().getName() + " 取走了1000，还有 " + money + " 元");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        }

    }
}
