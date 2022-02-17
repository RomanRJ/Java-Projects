package Curso;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*; 
/**
 *
 * @author UAA
 */
public class Tokens extends JPanel implements ActionListener {
    
    JButton confirma1;
    JTextField texto1,texto2;
    
    public Tokens(){
        texto1 = new JTextField(10);
        texto2 = new JTextField(15);
        confirma1 = new JButton("Ver");
        confirma1.addActionListener(this);
        setLayout(new FlowLayout());
        add(texto1);
        add(texto2);
        add(confirma1);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        StringTokenizer st=new StringTokenizer(texto1.getText()," ");
    	StringBuilder s=new StringBuilder();
        while(st.hasMoreTokens()) {
        	String s1=st.nextToken();
        	Character s2=s1.charAt(0);
        	s.append(s2.toString().toUpperCase()+s1.substring(1)+" ");
        	texto2.setText(s.toString());
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        JFrame frame = new JFrame("Tokens");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Tokens bot = new Tokens();
        frame.getContentPane().add(bot, BorderLayout.CENTER);
        
        frame.setBounds(100, 100, 600, 325);
        frame.setVisible(true);
    }

    
}
