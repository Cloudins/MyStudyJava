package Object.Medium.Extend.LQT;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LQT_opp {
    //控制菜单
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    Date date = null;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    //余额
    double money = 0;
    double balance = 0;

    //明细数组
    String[] lqt = new String[0];


    //主菜单
    public void Menu(){
        String[] arr = new String[4];
        arr[0] = "\t\t\t" + "1 零钱通明细";
        arr[1] = "\t\t\t" + "2 收益入账";
        arr[2] = "\t\t\t" + "3 消费";
        arr[3] = "\t\t\t" + "4 退出";
        do {
            System.out.println("\n===============零钱通菜单===============");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            System.out.print("请输入你的选择：");
            int key = scanner.nextInt();
            switch (key){
                case 1:
                    balance();
                    break;
                case 2:
                    income();
                    break;
                case 3:
                    change();
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("请按照规定输入,谢谢");
            }
        }while (loop);
    }

    //零钱通明细
    public void balance(){
        System.out.println("===============零钱通明细===============\n");
        for (int i = 0; i < lqt.length; i++) {
            System.out.println(lqt[i]);
        }

    }
    //收入
    public void income(){
        System.out.print("请输入收入金额：");
        double money = scanner.nextDouble();
        balance += money;
        //数据校验
        if (money <= 0){
            System.out.println("输入金额需要大于0");
            return;
        }
        date = new Date();

        String[] arrNew = new String[lqt.length + 1];
        for (int i = 0; i < lqt.length; i++) {
            arrNew[i] = lqt[i];
        }
        arrNew[arrNew.length - 1] = "收益入账  +" + money + " " +simpleDateFormat.format(date) + " 余额：" + balance;

        lqt = arrNew;
    }

    //消费
    public void change(){
        System.out.print("请输入消费金额：");
        money = scanner.nextInt();
        //校验消费金额
        if (money <= 0||money > balance){
            System.out.println("请输入金额在 0-"+ balance +" 范围内");
            return;
        }
        System.out.print("消费说明：");
        String description = scanner.next();
        balance -= money;



        date = new Date();
        String[] arrNew = new String[lqt.length + 1];
        for (int i = 0; i < lqt.length; i++) {
            arrNew[i] = lqt[i];
        }
        arrNew[arrNew.length - 1] = description+ " -" + money + " " +simpleDateFormat.format(date) + " 余额：" + balance;

        lqt = arrNew;
    }

    public void exit(){
        String choice = "";
        System.out.print("你确定要退出吗？(y or n)");
        char key = scanner.next().charAt(0);
        while (true){
            if (key == 'y'||key == 'n'){
                break;
            }
        }
        if (key == 'y'){
            loop = false;
        }
    }
}
