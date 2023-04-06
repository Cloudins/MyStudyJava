package Thread_;

public class homework01 {
    A a = new A();

}

class A extends Thread{
    private boolean loop = true;
    @Override
    public void run() {
        int count = 0;
        while (loop){
            System.out.println(++count);
        }
    }
}
