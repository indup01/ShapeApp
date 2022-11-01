package drawingUI;

import shapes.Drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawingUIController extends Drawing {
    JPanel controlsPanel = new JPanel();
    JPanel mainPanel = new JPanel();
    GridLayout glcp = new GridLayout(3,1);
    GridLayout glmp = new GridLayout(2,1);
    Drawing d = new Drawing();
    Point p=new Point(100,200);
    Color c=new Color(0xAF3D7C);
    int r = 10;
    int h = 15;
    int w = 5;

    public DrawingUIController(){
        d.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {


            }

            @Override
            public void mousePressed(MouseEvent e) {
                Point pc = e.getPoint();
                d.addRect(pc,c,w,h);
                d.repaint();

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        controlsPanel.setLayout(glcp);
        mainPanel.setLayout(glmp);
        d.addCircle(p,c,r);
        d.addRect(p,c,w,h);
        mainPanel.add(d);
        mainPanel.add(controlsPanel);


    }

    public JPanel getMainPanel(){
        return mainPanel;
    }
}
