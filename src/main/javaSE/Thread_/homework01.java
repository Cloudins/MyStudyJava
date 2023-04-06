package Thread_;

public class homework01 {
    A a = new A();

}

class A extends Thread{
    private boolean loop = true;
    @Override
    public void run() {
        //输入数字
        while (loop){
            System.out.println((int)(Math.random()*100 + 1));
        }
        //休眠
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
