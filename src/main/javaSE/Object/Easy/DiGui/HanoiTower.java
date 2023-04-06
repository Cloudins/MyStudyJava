package Object.Easy.DiGui;

public class HanoiTower {
    public static void main(String[] args) {
        Tower tower = new Tower();
        tower.move(2,'a','b','c');
    }
}

class Tower{

    /**
     *
     * @param num 有几个盘子
     * @param a   A塔
     * @param b   B塔
     * @param c   C塔
     *
     * 思路，主要就是如果有三层的话，首先将 23移动到B，然后1就可以到A（A -> C）
     *      接着就是将 2 移动到 A (B -> C)，其中如果要移动到C，那么3就得先拿开
     *
     * 终结点：当前位置 -> 目标位置
     */

    public void move(int num,char a,char b,char c){

        if (num == 1){
            //终结点
            System.out.println(a + " 移动到 " + c);
        }else {
            move(num-1,a,c,b);
            System.out.println(a + " 移动到 " + c);
            move(num-1,b,a,c);
        }
    }
}