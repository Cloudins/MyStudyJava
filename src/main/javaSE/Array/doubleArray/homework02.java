package Array.doubleArray;

public class homework02 {
    public static void main(String[] args) {
        // 1.随机生成10个整数(1-100的范围)保存到数组，并倒序打印以及求平均值、求最大值和最大值的下标
        // 2. 并查找里面是否有8
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int)(Math.random()*99 + 1);
        }
        System.out.println("===数组为===");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        //倒序打印
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("===倒序后的数组为===");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        //求最大值和最大值的下标
        System.out.println("最大值和最大值的下标为 " + arr[0]
                + "下标为 0");

        System.out.println("");
        // 并查找里面是否有8
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 8){
                System.out.println(arr[i] + " 在 "+ (i+1) +" 位");
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("没有找到8");
        }
    }
}
