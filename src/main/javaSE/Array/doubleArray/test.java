package Array.doubleArray;

public class test {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 8;
        arr[1] = 8;
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
