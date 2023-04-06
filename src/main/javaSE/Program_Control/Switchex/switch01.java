package Program_Control.Switchex;

import java.util.Scanner;

public class switch01 {
    public static void main(String[] args) {
        // 1.使用switch 把小写类型的char 型转为大写(键盘输入)。只转换a, b, c, d, e. 其它的输出"other"。

        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入a-e:");
        char c1 = myScanner.next().charAt(0);
        switch (c1){
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("请按照提示输入，谢谢！");

        }
    }

}
