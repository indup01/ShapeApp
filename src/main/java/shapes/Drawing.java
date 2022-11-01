package shapes;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import shapes.ShapeDB;


public class Drawing extends Canvas {
    // A private field called f of AWT class Frame..

    private Frame f;

    ShapeDB shapedb = new ShapeDB();

        // The constructor
    public Drawing(){
       // for (int i = 0;i<5;i++){
           // shapelist.add((Shape)circleee);
          //  shapelist.add((Shape)rectee);
           // shapelist.add((Shape)squaree);
       // }
        setupFrame();
        setupCanvas();
    }

    private void setupFrame() {
        f = new Frame("My window"); 	// Instantiates the Frame
        f.add(this);			// Adds the Canvas (ie this object) to the Frame
        f.setLayout(null);		// Stops the frame from trying to layout contents
        f.setSize(400, 400);		// Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {	// Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    private void setupCanvas() {
        setBackground(Color.WHITE); 	// Sets the Canvas background
        setSize(400, 400);		// Sets the Canvas size to be the same as the frame
    }
    public void addSquare(Point p,Color c,int w,int h){
        shapedb.addSquare(p,c,w,h);
    }

    public void addCircle(Point p,Color c,int r){
        shapedb.addCircle(p,c,r);
    }

    public void addRect (Point p,Color c,int w,int h){
        shapedb.addRect(p,c,w,h);
    }
    public void paint (Graphics g){
        shapedb.drawShapes(g);

    }
}
