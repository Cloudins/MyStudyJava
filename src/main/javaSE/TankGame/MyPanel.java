package TankGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class MyPanel extends JPanel implements KeyListener,Runnable{
    Hero hero = null;
    Vector<EnemyTank> enemyTanks = new Vector<>();//Vector 集合坦克
    int enemyTankSize = 3;
    public MyPanel(){
        hero = new Hero(100,100);//初始化我方坦克
        hero.setSpeed(10);//改变我方坦克速度

        for (int i = 0; i < enemyTankSize; i++) {
            //创建一个敌方坦克
            EnemyTank enemyTanks1 = new EnemyTank(100 * (i + 1), 0);
            //设置坦克默认方向
            enemyTanks1.setDir(2);
            //加入一颗子弹
            Shot shot = new Shot(enemyTanks1.getX() + 20, enemyTanks1.getY() + 60, enemyTanks1.getDir());
            enemyTanks1.shots.add(shot);
            //启动 shot 对象
            new Thread(shot).start();
            //在 Vector 集合中添加敌方坦克
            enemyTanks.add(enemyTanks1);
        }

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);

        //画出我方坦克
        drawTank(hero.getX(),hero.getY(),g, hero.getDir(),  1);

        //子弹
        if (hero.shot != null && hero.shot.isLive == true){
            g.draw3DRect(hero.shot.x,hero.shot.y,1,1,false);
        }

        //敌方坦克,遍历 Vector
        for (int i = 0; i < enemyTanks.size() ; i++) {
            EnemyTank enemyTank = enemyTanks.get(i);

                drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDir(),0);
                //画出子弹
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    //取出子弹
                    Shot shot = enemyTank.shots.get(j);
                    if (shot.isLive){
                        g.draw3DRect(shot.x, shot.y, 1,1,false);
                    }else {
                        //从 Vector 移除
                        enemyTank.shots.remove(shot);
                    }
                }


        }

    }

    /**
     *
     * @param x
     * @param y
     * @param g
     * @param dir 方向
     * @param type 坦克的类型
     */
    //绘制坦克
    public void drawTank(int x,int y,Graphics g,int dir,int type){
        switch (type){
            case 0://主角坦克
                g.setColor(Color.cyan);
                break;
            case 1://敌方坦克
                g.setColor(Color.yellow);
                break;
        }
        //根据坦克方向绘制坦克
        switch (dir){
            case 0://上
                g.fill3DRect(x, y,10,60,false);//左边轮子
                g.fill3DRect(x+10, y+10,20,40,false);//身子
                g.fill3DRect(x+30, y,10,60,false);//右边轮子
                g.fillOval(x+10,y+20,20,20);//大圆盘
                g.drawLine(x+20,y+30,x+20,y);//炮筒
                break;
            case 1://右
                g.fill3DRect(x, y,60,10,false);//左边轮子
                g.fill3DRect(x+10, y+10,40,20,false);//身子
                g.fill3DRect(x, y+30,60,10,false);//右边轮子
                g.fillOval(x+20,y+10,20,20);//大圆盘
                g.drawLine(x+30,y+20,x+60,y+20);//炮筒
                break;
            case 2://下
                g.fill3DRect(x, y,10,60,false);//左边轮子
                g.fill3DRect(x+10, y+10,20,40,false);//身子
                g.fill3DRect(x+30, y,10,60,false);//右边轮子
                g.fillOval(x+10,y+20,20,20);//大圆盘
                g.drawLine(x+20,y+30,x+20,y+60);//炮筒
                break;
            case 3://左
                g.fill3DRect(x, y,60,10,false);//左边轮子
                g.fill3DRect(x+10, y+10,40,20,false);//身子
                g.fill3DRect(x, y+30,60,10,false);//右边轮子
                g.fillOval(x+20,y+10,20,20);//大圆盘
                g.drawLine(x+30,y+20,x,y+20);//炮筒
                break;
            default:
                System.out.println("有待开发");
        }

    }


    //hitEnemy
    // public void hitEnemy(Shot s,EnemyTank enemyTank){
    //     switch (enemyTank.getDir()){
    //         case 0:
    //         case 1:
    //             if (s.x > enemyTank.getX() && s.x < enemyTank.getX()+ 40
    //                     && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60){
    //                 s.isLive = false;
    //                 enemyTank.isLive = false;
    //             }
    //             break;
    //         case 2:
    //         case 3:
    //             if (s.x > enemyTank.getX() && s.x < enemyTank.getX()+ 60
    //                     && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 40){
    //                 s.isLive = false;
    //                 enemyTank.isLive = false;
    //             }
    //             break;
    //     }
    // }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W){
            hero.setDir(0);
            // System.out.println("向上");
            hero.moveUp();
        }else if (e.getKeyCode() == KeyEvent.VK_S){
            hero.setDir(2);
            hero.moveDown();
        }else if (e.getKeyCode() == KeyEvent.VK_A){
            hero.setDir(3);
            hero.moveLeft();
        }else if (e.getKeyCode() == KeyEvent.VK_D){
            hero.setDir(1);
            hero.moveRight();
        }

        if (e.getKeyCode() == KeyEvent.VK_J){

            hero.Attack();
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // //判断是否击中坦克
            // if (hero.shot != null &&hero.shot.isLive){//如果我方坦克子弹还存活
            //     //遍历敌方坦克，判断是否被击中
            //     for (int i = 0; i < enemyTanks.size(); i++) {
            //         hitEnemy(hero.shot,enemyTanks.get(i));
            //     }
            // }

            this.repaint();
        }
    }
}
