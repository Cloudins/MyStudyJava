package Program_Control.whileEx;

public class whileEx {
    public static void main(String[] args) {
        // 打印1—100 之间所有能被3 整除的
        int i = 1;
        int endNum = 100;
        while (i < 100 ){
            if (i % 3 == 0){
                System.out.println("i= " + i);
            }
            i++;
        }


    }
}
