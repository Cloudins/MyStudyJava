package Program_Control.whileEx;

public class break01 {
    public static void main(String[] args) {
        // 1-100 以内的数求和，求出当和第一次大于20 的当前数
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            sum += i;
            if (sum > 20){
                System.out.println(sum);
                break;
            }
        }
    }
}
