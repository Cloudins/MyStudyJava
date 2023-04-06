package TankGame;
import javax.swing.*;

public class TankGame01 extends JFrame {
    //定义MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {
        new TankGame01();
    }
    public TankGame01(){
        mp = new MyPanel();
        this.add(mp);
        this.addKeyListener(mp);
        this.setSize(1000,750);//窗口大小
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(450,180);//窗口默认位置
        this.setVisible(true);
    }
}
