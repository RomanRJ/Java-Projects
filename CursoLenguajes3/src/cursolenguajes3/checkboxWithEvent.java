package cursolenguajes3;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class checkboxWithEvent{
	//crear diferentes checkbox
	public static JCheckBox checkbox1=new JCheckBox("Alex");
	public static JCheckBox checkbox2=new JCheckBox("Jessica");
	public static JCheckBox checkbox3=new JCheckBox("Lily");
	public static JCheckBox checkbox4=new JCheckBox("Steven");
	
	public static void main(String[] args) {
		//configura la ventana
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame=new JFrame("CheckBox whith event listener");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Define el panel donde estara el checkbox
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		final JLabel msg=new JLabel("",JLabel.CENTER);
		
		//configura el titulo del panel
		panel1.setBorder(BorderFactory.createTitledBorder("Name"));
		panel2.setBorder(BorderFactory.createTitledBorder("Output"));
		
		//añade los checkbox al panel
		panel1.add(checkbox1);
		panel1.add(checkbox2);
		panel1.add(checkbox3);
		panel1.add(checkbox4);
		
		panel2.add(msg);
		
		//Action Listener
		checkbox1.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange()==1) {
					msg.setText("Alex is Selected");
				}else{
					msg.setText("Alex is Unselected");
				}
			}
			
		});
		
		checkbox2.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange()==1) {
					msg.setText("Jessica is Selected");
				}else{
					msg.setText("Jessica is Unselected");
				}
			}
			
		});
		
		checkbox3.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange()==1) {
					msg.setText("Lily is Selected");
				}else{
					msg.setText("Lily is Unselected");
				}
			}
			
		});
		
		checkbox4.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange()==1) {
					msg.setText("Steven is Selected");
				}else{
					msg.setText("Steven is Unselected");
				}
			}
			
		});
		
		//Agrega el panel al frame
		frame.setLayout(new GridLayout(2,1));
		frame.add(panel1);
		frame.add(panel2);
		
		//definir la ventana como visible
		frame.pack();
		frame.setVisible(true);
		
	}
	
	
}