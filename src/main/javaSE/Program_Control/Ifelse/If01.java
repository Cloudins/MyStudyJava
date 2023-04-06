package Program_Control.Ifelse;
import java.util.Scanner;

public class If01 {
    //编写一个程序,可以输入人的年龄,如果该同志的年龄大于18 岁,
    //则输出"你年龄大于18,要对
    //自己的行为负责, 送入监狱"。否则,输出"你的年龄不大这次放过你了."

    public static void main(String[] args) {
        //定义一个 Scanner 对象
        Scanner MyScanner = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = MyScanner.nextInt();
        if( age > 18){
            System.out.println("你年龄大于18,抓起来");
        }else{
            System.out.println("你的年龄不大这次放过你了");
        }
    }

}
