package Program_Control.whileEx;

public class doWhile {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        do{
            sum += i;
            i++;
        }while (i < 101);
        System.out.println("总和 " + sum);
    }
}
