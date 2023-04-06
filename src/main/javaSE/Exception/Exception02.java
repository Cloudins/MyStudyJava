package Exception;

public class Exception02 {
    public static void main(String[] args) {
        try {
            ShowEx();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");
        }finally {
            System.out.println("C");
        }
        //BAC
    }

    public static void ShowEx() throws Exception{
        throw new Exception();
    }
}
