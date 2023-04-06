package Array.doubleArray;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        // 已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序，
        // 比如：[10,12,.45,.90],添加23后，数组为[10,12,23,45,90]
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {10,12,45,90};
        do {
            int[] arrNew = new int[arr.length + 1];
            //赋值
            for (int i = 0; i < arr.length; i++) {
                arrNew[i]=arr[i];
            }
            System.out.print("你要添加的元素是：");
            int addNum = myScanner.nextInt();
            arrNew[arrNew.length - 1 ] = addNum;

            //排序
            int temp = 0;
            //冒泡
            for (int i = 0; i < arrNew.length - 1; i++) {
                for (int j = 0; j < arrNew.length - 1 - i; j++) {
                    if (arrNew[j] > arrNew[j+1]){
                        temp = arrNew[j];
                        arrNew[j] = arrNew[j+1];
                        arrNew[j+1] = temp;
                    }
                }
            }

            arr = arrNew;
            System.out.println("====添加后的数组是=====");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("是否还需要添加？(y/n)");
            char key = myScanner.next().charAt(0);
            if (key == 'n'){
                System.out.println("你已经退出……");
                break;
            }
        }while (true);
    }
}
