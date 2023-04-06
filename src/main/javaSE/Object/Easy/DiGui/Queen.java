package Object.Easy.DiGui;

public class Queen {
    public static void main(String[] args) {
        Queen8 queen = new Queen8();
        queen.check(0);
        System.out.println("一共有 " + queen.sum + " 种解法");
    }
}
class Queen8{
    int max = 8;
    int sum = 0;
    int[] arr = new int[max];

    public void check(int n){
        if (n == max){
            print();
            //终结点
            return;
        }
        for (int i = 0; i < max; i++) {
            arr[n] = i;
            if (judge(n)){
                check(n + 1);
            }
        }
    }


    //判断算法
    public boolean judge(int n){
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[n] || Math.abs(n - i) == Math.abs(arr[i] - arr[n])){
                return false;
            }
        }
        return true;
    }

    //打印数组
    public void print(){
        sum++;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
