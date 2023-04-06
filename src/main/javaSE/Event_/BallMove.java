package Event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame{
    MyPanel myPanel = null;

    public static void main(String[] args) {
        new BallMove();
    }
    public BallMove(){
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(1000,750);
        this.addKeyListener(myPanel);
        this.setVisible(true);
        this.setLocation(450,180);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MyPanel extends JPanel implements KeyListener {
    int x = 10;
    int y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println((char) e.getKeyCode() + "被按下了……");
        if (e.getKeyCode() == KeyEvent.VK_DOWN){
            this.y = y+10;
        }

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
