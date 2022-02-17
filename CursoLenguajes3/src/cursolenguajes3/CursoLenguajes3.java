/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursolenguajes3;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.StringTokenizer;
/**
 *
 * @author crism
 */
public class CursoLenguajes3 extends JPanel implements ActionListener {

    JButton confirma1, confirma2;
    JTextField texto1, texto2, texto3, texto4, texto5, texto6;
    
    public CursoLenguajes3(){
        
        texto1 = new JTextField(10);
        texto2 = new JTextField(15);
        texto3 = new JTextField(13);
        texto4 = new JTextField(13);
        texto5 = new JTextField(13);
        texto6 = new JTextField(13);
        confirma1 = new JButton("Cap.");
        confirma1.addActionListener(this);
        confirma2 = new JButton("Suma/Pares/Impares");
        confirma2.addActionListener(this);
        setLayout(new FlowLayout());
        add(texto1);
        add(texto2);       
        add(confirma1);
        add(texto3);
        add(texto4);
        add(texto5);
        add(texto6);
        add(confirma2);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==confirma1){
            
            StringTokenizer s = new StringTokenizer(texto1.getText()," ");
            StringBuffer t2 = new StringBuffer();

            while(s.hasMoreTokens()){
                String t = s.nextToken();              
                t2.append(" "+t.substring(0,1).toUpperCase()+t.substring(1).toLowerCase());
            }
            
                String str = t2.toString();
                texto2.setText(str);
        }
        
        if(ae.getSource()==confirma2){
            
            StringTokenizer n = new StringTokenizer(texto3.getText(),",");
            StringBuffer  ns  = new StringBuffer();
            StringBuffer  ns2  = new StringBuffer();
            Integer suma = new Integer(0);
           
            while(n.hasMoreTokens()){
                String ta = n.nextToken();
                Integer a = new Integer(Integer.parseInt(ta));
                suma = suma+a;
                if(a%2==0){
                    ns.append(ta+",");
                }else{
                    ns2.append(ta+",");
                }
            }
            
          texto4.setText(suma.toString());
          texto5.setText(ns.toString());
          texto6.setText(ns2.toString());
       
          //texto5.setText
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        	JFrame.setDefaultLookAndFeelDecorated(true);
		
		JFrame frame=new JFrame("Dos textfield y un boton");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CursoLenguajes3 bot= new CursoLenguajes3();
		frame.getContentPane().add(bot, BorderLayout.CENTER);
		
		frame.setBounds(100,100,400,325);
		frame.setVisible(true);
		
	

    }
    
   
}
