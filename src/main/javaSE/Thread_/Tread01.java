package Thread_;

public class Tread01 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Tread1());
        for (int i = 0; i < 10; i++) {
            System.out.println("hi " +"第 " + (i+1) + "次");
            if (i == 5){
                thread.start();
                thread.join();
            }
        }
    }
}
class Tread1 implements Runnable{

    int count;
    @Override
    public void run() {
        while (true){
            System.out.println("hello " + (++count));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 10){
                break;
            }
        }

    }
}

