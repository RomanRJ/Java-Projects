package Curso;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.util.Random;

public class Elipses extends JFrame {

    public Elipses() {
        setSize(new Dimension(500, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JPanel p = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                
                int a=0, b=0;
                
                for (int i=0; i<=1000; i++){
                 
                 a=(int) (Math.random()*500)+1;
                 b=(int) (Math.random()*500)+1;
                    
                 Shape circle = new Ellipse2D.Double(a, b, 2, 2);
      
                g2.draw(circle);
                
                }
               
         
            }
        };
        setTitle("My Dots");
        this.getContentPane().add(p);

    }

    public static void main(String arg[]) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Elipses();
            }
        });
    }
}