package Program_Control.Switchex;

import java.util.Scanner;

public class Sore {

    public static void main(String[] args) {
        // 2.对学生成绩大于60 分的，输出"合格"。低于60 分的，输出"不合格"。(注：输入的成绩不能大于100), 提示成绩/60
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入(输入一个1-100的分数)：");
        int score = myScanner.nextInt();
        if (score >= 0 && score <= 100){
            switch ((int)(score/60)){
                case 0:
                    System.out.println("不及格");
                    break;
                case 1:
                    System.out.println("及格啦");
                    break;
            }
        }else {
            System.out.println("请按照要求输入");
        }
    }
}
