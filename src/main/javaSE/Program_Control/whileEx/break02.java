package Program_Control.whileEx;

import java.util.Scanner;

public class break02 {
    public static void main(String[] args) {
        // 实现登录验证，有3 次机会，如果用户名为"丁真" ,密码"666"提示登录成功，否则提示还有几次机会，请使用for+break 完成


        int chance = 3;

        for (int i = 1; i <= 3; i++) {
            String username = "丁真";
            int password = 666;
            Scanner myScanner = new Scanner(System.in);
            System.out.print("请输入用户名:");
            String testname = myScanner.next();
            System.out.print("请输入密码:");
            int testpsw = myScanner.nextInt();

            if (testname.equals(username) && testpsw == password){
                System.out.println("登录成功");
                break;
            }
            chance--;
            System.out.println("你还有 " + chance + " 次机会");

        }
    }
}
