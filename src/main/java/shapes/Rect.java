package shapes;

import java.awt.*;


public class Rect extends Shape {
    protected int width;	// Fields
    private int height;

    public Rect(Point initPos, Color col, int w,int h){
        super(initPos, col); // The constructor
        width = w;
        height = h;
        // Initialize the fields of the object
    }

    public void draw(Graphics g) {    // A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x, pos.y, width, height);
    }
}
