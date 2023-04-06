package Object.Easy.Homework;

public class homework01 {
    public static void main(String[] args) {
        int[] arr = {10,5,61,23,123};
        A01 a01 = new A01();
        System.out.println(a01.max(arr));
    }
}
class A01{
    public int max(int[] arr){
        int maxNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        return maxNum;
    }
}
