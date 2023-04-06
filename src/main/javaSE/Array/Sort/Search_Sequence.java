package Array.Sort;

import java.util.Scanner;

public class Search_Sequence {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int index = -1;

        String[] names = {"小明","小花","小龙","小利"};
        System.out.print("请输入你想查找的名字:");
        String findName = myScanner.next();

        for (int i = 0; i < names.length; i++) {
            if (findName.equals(names[i])){
                System.out.println("恭喜你找到 "+ findName);
                System.out.println("他/她在第 " + (i+1) + " 位");
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("很抱歉没有找到 " + findName);
        }
    }
}
