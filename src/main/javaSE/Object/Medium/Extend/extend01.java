package Object.Medium.Extend;

public class extend01 {
    public static void main(String[] args) {
        B b = new B("name");
    }
}
class A{
    A(){
        System.out.println("a");
    }
    A(String name){
        System.out.println("a name");
    }
}
class B extends A{
    B(){
        System.out.println("b");
    }
    B(String name){
        System.out.println("b name");
    }
}