package Object.Easy.DiGui;

public class fibonacci {
    public static void main(String[] args) {
        T t = new T();
        int n = 3;
        int res = t.fibonacci(n);
        if (res!= -1){
            System.out.println("当 n 等于 " + n +   " 对应的斐波那契数为" + res);
        }

        int day = 10;
        int key = t.peach(day);
        if (key != -1){
            System.out.println("第 " + day +" 天有 "+ key +" 个桃子");
        }
    }
}
class T{

    //对应的斐波那契数
    public int fibonacci(int n){
        if (n >= 1 ){
            if (n == 1||n == 2){
                return 1;
            }else {
                return fibonacci(n-1) + fibonacci(n -2);
            }
        }else {
            System.out.println("请按照要求输入!");
            return -1;
        }
    }

    //猴子偷桃
    /*
    猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！
    以后每天猴子都吃其中的一半，然后再多吃一个。当到第10 天时，
    想再吃时（即还没吃），发现只有1 个桃子了。问题：最初共多少个桃子？

    f(n+1) = f(n) - f(n)/2 - 1
    2f(n+1) = 2f(2) - f(n) - 2
    f(n) = 2{f(n+1) + 1}

    f(10) = 1
     */
    public int peach(int day){
        if (day == 10){
            return 1;
        }else if (day >= 1 && day < 10){
            return (peach(day+1) + 1)*2;
        }else {
            System.out.println("请输入day(1-10)");
            return -1;
        }
    }
}

