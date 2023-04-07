package TankGame;


public class Shot implements Runnable{
    int x;
    int y;
    int direct = 0;
    int speed = 2;
    boolean isLive = true;

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }


    @Override
    public void run() {
        while (true){
            //休眠50s
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            switch (direct){
                case 0://上
                    // System.out.println("子弹向上");
                    y -= speed;
                    break;
                case 1://右
                    // System.out.println("子弹向右");
                    x += speed;
                    break;
                case 2://下
                    // System.out.println("子弹向下");
                    y += speed;
                    break;
                case 3://左
                    // System.out.println("子弹向左");
                    x -= speed;
                    break;
            }
            // System.out.println("X = " + x +" Y = " + y );
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750)){
                isLive = false;
                break;
            }
        }
    }
}
