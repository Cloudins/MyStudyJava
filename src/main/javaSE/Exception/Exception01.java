package Exception;

public class Exception01 {

    public static void main(String[] args) {
        try {
            func();
            System.out.println("A");
        }catch (Exception e){
            System.out.println("C");
        }
        System.out.println("D");
    }

    public static void func(){
        try {
            throw new RuntimeException();
        }
        finally {
            System.out.println("B");
        }
    }
}
