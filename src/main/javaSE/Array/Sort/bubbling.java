package Array.Sort;

public class bubbling {
    public static void main(String[] args) {
        int[] arr = {242, 69, 80, 57, 13, -1, 30, 200, -110};
        int temp = 0;
        //经历几层循环
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 -i; j++) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("====调整后的数组为====");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
