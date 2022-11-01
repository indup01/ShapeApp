import drawingUI.DrawingUIController;
import shapes.Drawing;

import javax.swing.*;
import java.awt.*;

public class Main {
    static GraphicsConfiguration gc;


    public static void main(String[] args) {
        JFrame frame = new JFrame(gc) ;
        frame.setSize(500,600);
        DrawingUIController dc = new DrawingUIController();
        frame.add(dc.getMainPanel());
        frame.setVisible(true);

    }
}
