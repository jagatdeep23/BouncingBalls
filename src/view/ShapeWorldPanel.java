package view;

import javafx.scene.shape.Circle;
import model.*;
import model.Shape;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/**
 * Created by jc277043 on 25/05/15.
 */
public class ShapeWorldPanel extends JPanel {

private ArrayList<Shape> shapes;
    public void addShapes(Shape shape){

        shapes.add(shape);
    }


    public ShapeWorldPanel() {
;
        shapes=new ArrayList<Shape>();
        setPreferredSize(new Dimension(640, 480));
        setFocusable(true);



    }
    public void addMouseListner(MouseListener listener){
        super.addMouseListener(listener);
    }

    protected void paintComponent(java.awt.Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
      //  g.drawString("Shape World!",100,100);
        for(Shape shape: shapes) {
            shape.draw(g);
            shape.move();
            shape.bounce(getWidth(), getHeight());
        }
    }
}
