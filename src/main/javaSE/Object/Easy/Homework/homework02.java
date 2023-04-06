package Object.Easy.Homework;

public class homework02 {
    public static void main(String[] args) {
        char[] chars = {'a','b','c'};

        A02 a02 = new A02();
        int index = a02.find('d',chars);
        if ( index != -1){
            System.out.println("它的下标是" + index);
        }else {
            System.out.println("此数组没有这个元素");
        }
    }
}

class A02{
    public int find(char a,char[] chars){
        int index = -1;
        for (int i = 0; i < chars.length; i++) {
            if (a == chars[i]){
                index = i;
            }
        }
        return index;
    }
}
