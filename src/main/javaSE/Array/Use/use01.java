package Array.Use;

public class use01 {
    // 创建一个char 类型的26 个元素的数组，分别放置'A'-'Z'。使用for 循环访问所有元素并打印出来。提示：char 类型
    // 数据运算'A'+2 -> 'C'
    public static void main(String[] args) {
        char[] chars = new char[26];
        for (int i = 0; i < 26; i++) {
            chars[i] = (char) ('A' + i);
        }

        System.out.println("=====数组打印=====");
        for (int i = 0; i < 26; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}
