package shapes;
import shapes.Drawing;

import java.awt.*;
import java.util.ArrayList;

public class ShapeDB {
    ArrayList<Shape> shapelist = new ArrayList<>();

    public void addSquare(Point p,Color c,int w,int h){
        square squaree = new square(p,c,w,w);
        shapelist.add(squaree);
    }
    public void addCircle(Point p,Color c,int r){
        Circle circlee = new Circle(p,c,r);
        shapelist.add(circlee);
    }
    public void addRect (Point p,Color c,int w,int h){
        Rect rectanglee = new Rect(p,c,w,h);
        shapelist.add(rectanglee);
    }
    public void drawShapes(Graphics g){
        for (int i = 0;i<(shapelist.size());i++){
            Shape objectshape = shapelist.get(i);
            objectshape.draw(g);
        }


    }

}
