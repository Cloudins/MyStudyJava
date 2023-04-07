package Thread_;

import java.util.Scanner;

public class homework01 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        a.start();
        b.start();
    }

}

class A extends Thread{
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        //输入数字
        while (loop){
            System.out.println((int)(Math.random()*100 + 1));
            //休眠
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class B extends Thread{
    private A a;
    private Scanner myScanner = new Scanner(System.in);

    public B(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        while (true){
            System.out.println("请输入你的指令:");
            char key = myScanner.next().toUpperCase().charAt(0);
            if (key == 'Q'){
                a.setLoop(false);
                System.out.println("B线程退出……");
                break;
            }
        }

    }
}

