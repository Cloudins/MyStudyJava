package Object.Easy.DiGui;

public class MiGong {
    public static void main(String[] args) {
        int[][] map = new int[8][7];

        //迷宫的最上面一行和最下面一行的墙
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        //障碍
        map[3][1] = 1;
        map[3][2] = 1;

        //迷宫左边和右边的墙
        for (int i = 0; i < 7; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }

        //打印地图
        System.out.println("====当前地图====");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        Mouse mouse = new Mouse();
        mouse.findWay(map, 1, 1);

        System.out.println("====找路情况如下====");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Mouse{

    /**
     *
     * @param map 具体是哪个地图
     * @param i   初始位置信息 列
     * @param j   初始位置信息 行
     * @return boolean
     *
     * 1. 0表示可以走; 1表示障碍物; 2表示可以走; 3表示走过，但是走不通是死路
     * 2. 先确定老鼠找路策略下->右->上->左
     */
    public boolean findWay(int[][] map,int i,int j){
            if (map[6][5] == 2){//已经找到
                return true;
            }else {
                // 0表示可以走; 1表示障碍物; 2表示可以走; 3表示走过，但是走不通是死路
                if (map[i][j] == 0){
                    map[i][j] = 2;
                    if (findWay(map,i-1,j)){//下
                        return true;
                    }else if (findWay(map,i,j+1)){
                        return true;
                    } else if (findWay(map, i + 1, j)) {
                        return true;
                    }else if (findWay(map,i,j-1)){
                        return true;
                    }else {
                        map[i][j] = 3;
                        return false;
                    }
                }else {
                    return false;
                }
            }
    }
}
