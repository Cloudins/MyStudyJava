package Array.Use;

import java.util.Scanner;

public class arrayController {
    public static void main(String[] args) {
        Scanner myScanner  = new Scanner(System.in);
        int[] arr = {1,2,3};
        do {
            System.out.println("删除或者添加？（1或2,3退出）");
            int key = myScanner.nextInt();
            if (key == 1){
                int[] arrNew = new int[arr.length - 1];
                if (arrNew.length>1){
                    for (int i = 0; i < arrNew.length; i++) {
                        arrNew[i] = arr[i];
                    }
                    arr = arrNew;
                    System.out.println("=====缩减后的数组为=====");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                }else {
                    System.out.println("数组只有 " + arrNew.length + " 个元素，不可删除");
                }

            }else if (key == 2){
                int[] arrNew = new int[arr.length + 1];
                for (int i = 0; i < arr.length; i++) {
                    arrNew[i] = arr[i];
                }
                System.out.println("请输入你要添加的元素：");
                int addNum = myScanner.nextInt();
                arrNew[arrNew.length - 1] = addNum;
                //引用
                arr = arrNew;
                System.out.println("=====添加后的数组为=====");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
            }else {
                System.out.println("你已经退出……");
                break;
            }
        }while (true);
    }
}
