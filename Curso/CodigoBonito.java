package Curso;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CodigoBonito extends JFrame {
    //Create different checkbox
    private JPanel panel1;
    private JPanel panel2;
    private JFrame frame;
    private JLabel msg;
    private JCheckBox checkbox1;
    private JCheckBox checkbox2;
    private JCheckBox checkbox3;
    private JCheckBox checkbox4;
   
    
    private void iniciarcomponentes(){
        paneles();
        check1();
        check2();
        check3();
        check4();
        frame();
    }
    
    private void frame(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame = new JFrame("Checkbox with EventListener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2,1));
        frame.add(panel1);
        frame.add(panel2);
        
        frame.pack();
        frame.setVisible(true);
    }
    
    private void paneles(){
        panel1 = new JPanel();
        panel2 = new JPanel();
        msg = new JLabel("",JLabel.CENTER);
        
        panel1.setBorder(BorderFactory.createTitledBorder("Name"));
        panel1.setBorder(BorderFactory.createTitledBorder("Output"));
        
        panel2.add(msg);

    }
    
    private void check1(){
        checkbox1 = new JCheckBox("Alex");
        panel1.add(checkbox1);
        
        ItemListener check1 = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if(ie.getStateChange() == 1){
                    msg.setText("Alex is selected");
                }
                else{
                    msg.setText("Alex is unselected");
                }
            }
        };
        checkbox1.addItemListener(check1);
    }
    
    private void check2(){
        checkbox2 = new JCheckBox("Jessica");
        panel1.add(checkbox2);
        
        ItemListener check2 = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if(ie.getStateChange() == 1){
                    msg.setText("Jessica is selected");
                }
                else{
                    msg.setText("Jessica is unselected");
                }
            }
        };
        checkbox2.addItemListener(check2);
    }
    
    private void check3(){
        checkbox3 = new JCheckBox("Lily");
        panel1.add(checkbox3);
        
        ItemListener check3 = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if(ie.getStateChange() == 1){
                    msg.setText("Lily is selected");
                }
                else{
                    msg.setText("Lily is unselected");
                }
            }
        };
        checkbox3.addItemListener(check3);
    }
    
    private void check4(){
        checkbox4 = new JCheckBox("Steven");
        panel1.add(checkbox4);
        
        ItemListener check4 = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if(ie.getStateChange() == 1){
                    msg.setText("Steven is selected");
                }
                else{
                    msg.setText("Steven is unselected");
                }
            }
        };
        checkbox4.addItemListener(check4);
    }
 
    public static void main(String[] args) {
        CodigoBonito nuevo = new CodigoBonito();
        nuevo.iniciarcomponentes();
    }
}
