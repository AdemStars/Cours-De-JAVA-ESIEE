package test;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class CircleDrawer extends JPanel {
 
    public void paint(Graphics g) {
        g.drawOval(100, 100, 200, 200);
    }
     
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new CircleDrawer());
 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}