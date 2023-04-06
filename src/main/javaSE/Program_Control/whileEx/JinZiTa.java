package Program_Control.whileEx;

public class JinZiTa {
    public static void main(String[] args) {
        int level = 5;

        for (int j = 1; j <= level; j++) {
            for (int i = 1; i <= level - j; i++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * j - 1; k++) {
                if (k == 1 || k == 2 * j - 1 || j == 5 ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
