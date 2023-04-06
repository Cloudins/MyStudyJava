package Array.Use;

import java.util.Scanner;

public class arrayAdd {
    public static void main(String[] args) {
        // 实现动态的给数组添加元素效果，实现对数组扩容
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3};
        do {
            int[] arrNew = new int[arr.length +1 ];
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            System.out.print("请输入你想要添加的元素：");
            int addNum = scanner.nextInt();
            arrNew[arrNew.length-1] = addNum;
            arr = arrNew;
            System.out.println("=====添加后的数组为======");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("");
            System.out.println("还需要添加吗？（y/n）");
            char key = scanner.next().charAt(0);
            if (key== 'n'){
                break;
            }
        }while (true);
        System.out.println("你已经退出了……");
    }
}
