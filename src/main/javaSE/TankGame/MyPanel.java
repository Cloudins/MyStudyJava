package TankGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class MyPanel extends JPanel implements KeyListener {
    Hero hero = null;
    Vector<EnemyTank> enemyTanks = new Vector<>();//Vector 集合坦克
    int enemyTankSize = 3;
    public MyPanel(){
        hero = new Hero(100,100);//初始化我方坦克
        hero.setSpeed(10);//改变我方坦克速度

        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTanks1 = new EnemyTank(100 * (i + 1), 0);
            enemyTanks1.setDir(3);
            enemyTanks.add(enemyTanks1);
        }

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);

        //画出坦克
        drawTank(hero.getX()+60,hero.getY(),g, hero.getDir(),  1);
        //敌方坦克,遍历 Vector
        for (int i = 0; i < enemyTanks.size() ; i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDir(),0);
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

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W){
            hero.setDir(0);
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
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
