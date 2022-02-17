package Curso;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*; 
/**
 *
 * @author UAA
 */
public class Pares extends JPanel implements ActionListener {
    
    JButton confirma1;
    JTextField texto1,texto2,texto3;
    
    public Pares(){
        texto1 = new JTextField(5);
        texto2 = new JTextField(15);
        texto3 = new JTextField(15);
        confirma1 = new JButton("Ver");
        confirma1.addActionListener(this);
        setLayout(new FlowLayout());
        add(texto1);
        add(texto2);
        add(texto3);
        add(confirma1);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
    	StringBuilder pares=new StringBuilder();
    	StringBuilder inpares=new StringBuilder();    	
        StringTokenizer st=new StringTokenizer(texto1.getText(),",");
        while(st.hasMoreTokens()) {
        	String s1=st.nextToken();
        	Integer i=new Integer(s1);
        	if(i%2==0) {
        		pares.append(" "+i.toString());
        	}else {
        		inpares.append(" "+i.toString());
        	}
        }
        texto2.setText(pares.toString());
        texto3.setText(inpares.toString());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        JFrame frame = new JFrame("Tokens");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Pares bot = new Pares();
        frame.getContentPane().add(bot, BorderLayout.CENTER);
        
        frame.setBounds(100, 100, 400, 325);
        frame.setVisible(true);
    }

    
}
