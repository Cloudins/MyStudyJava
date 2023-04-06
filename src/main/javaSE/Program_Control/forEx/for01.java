package Program_Control.forEx;

public class for01 {
    public static void main(String[] args) {
        // 打印1~100 之间所有是9 的倍数的整数，统计个数及总和.[化繁为简,先死后活]
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            if (i % 9 == 0) {
                System.out.println(i);
                count++;
                sum += i;
            }
        }
        System.out.println("总共有 " + count + " 个9的倍数");
        System.out.println("总和为" + sum);
    }
}
