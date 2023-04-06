package Program_Control.Switchex;

import java.util.Scanner;

public class Spring {
    public static void main(String[] args) {

        // 3. 根据用于指定月份，打印该月份所属的季节。3,4,5 春季6,7,8 夏季9,10,11 秋季12, 1, 2 冬季[课堂练习, 提示使
        // 用穿透]
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = myScanner.nextInt();
        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("请正确输入月份");
        }
    }
}
