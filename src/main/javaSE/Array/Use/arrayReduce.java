package Array.Use;

import java.util.Scanner;

public class arrayReduce {
    public static void main(String[] args) {
        // 有一个数组{1， 2， 3， 4， 5}， 可以将该数组进行缩减，提示用户是否继续缩减，每次缩减最后那个元素。当只剩
        // 下最后一个元素，提示，不能再缩减。
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        do {
            int[] arrNew = new int[arr.length - 1];
            System.out.println("需要进行删减元素吗？(y/n)");
            char key = scanner.next().charAt(0);
            if (key == 'y'){
                if (arrNew.length > 1){
                    for (int i = 0; i < arrNew.length; i++) {
                        arrNew[i] = arr[i];
                    }
                    arr = arrNew;
                    System.out.println("=====缩减后的数组为=====");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                }else {
                    System.out.println("只剩下 "+ arrNew.length + " 个元素， 数组不可删除");
                }
            }else {
                break;
            }
        }while (true);
        System.out.println("你已退出……");
    }
}
