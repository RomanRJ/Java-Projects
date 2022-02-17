package Curso;
import java.awt.*;
import java.awt.event.*;


public class SimpleChoice extends Frame implements ItemListener {

    Choice fruits;

    SimpleChoice() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        
        this.setLocationRelativeTo(null);
        
        setLayout(new FlowLayout());
        
        fruits = new Choice();
        
        fruits.addItem("Apple");
        fruits.addItem("Guava");
        fruits.addItem("Pine Apple");
        fruits.addItem("Mango");
        
        fruits.addItemListener(this);
        
        add(fruits);
        
        setTitle("Choice Simple Exmaple");
        setSize(300, 200);
        setVisible(true);
    }
    
    // Override the only abstract method of itemListener
    @Override
    public void itemStateChanged(ItemEvent e) {
       String str = fruits.getSelectedItem();       // returns the selected item as a string
       int num = fruits.getSelectedIndex();         // returns the selected item as a integer
       
        System.out.println("You like " + str + " of serial number " + (num+1));
    }
    
    public static void main(String[] args) {
        new SimpleChoice();
    }

}