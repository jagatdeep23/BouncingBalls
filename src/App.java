import view.MainFrame;
import view.ShapeWorldPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by jc277043 on 25/05/15.
 */
public class App {
    private static MainFrame frame;
    private static ShapeWorldPanel panel;
    static {
        panel=new ShapeWorldPanel();
        frame=new MainFrame("ShapeWorld",panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
panel.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseReleased(MouseEvent e) {
        model.Circle shape = new model.Circle(10);
        shape.setColor(Color.GREEN.darker().darker());
        shape.setPosition(200, 200);
        shape.setOffsets(1, 1);
        panel.addShapes(shape);
    }
});
                Timer timer=new Timer(5,new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        panel.repaint();
                    }
                });
                timer.start();
                frame.setVisible(true);
            }
        });
    }
}
