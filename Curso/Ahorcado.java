package Curso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ahorcado extends JFrame {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JTextField text4;
	private JTextField texto;
	private JLabel falla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ahorcado frame = new Ahorcado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ahorcado() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Ahorcado.class.getResource("/text/img1.png")));
		label.setBounds(10, 11, 270, 300);
		contentPane.add(label);
		
		text1 = new JTextField();
		text1.setFont(new Font("Rockwell", Font.BOLD, 20));
		text1.setHorizontalAlignment(SwingConstants.CENTER);
		text1.setEditable(false);
		text1.setBounds(20, 322, 50, 28);
		contentPane.add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setFont(new Font("Rockwell", Font.BOLD, 20));
		text2.setHorizontalAlignment(SwingConstants.CENTER);
		text2.setEditable(false);
		text2.setColumns(10);
		text2.setBounds(80, 322, 50, 28);
		contentPane.add(text2);
		
		text3 = new JTextField();
		text3.setFont(new Font("Rockwell", Font.BOLD, 20));
		text3.setHorizontalAlignment(SwingConstants.CENTER);
		text3.setEditable(false);
		text3.setColumns(10);
		text3.setBounds(140, 322, 50, 28);
		contentPane.add(text3);
		
		text4 = new JTextField();
		text4.setFont(new Font("Rockwell", Font.BOLD, 20));
		text4.setHorizontalAlignment(SwingConstants.CENTER);
		text4.setEditable(false);
		text4.setColumns(10);
		text4.setBounds(200, 322, 50, 28);
		contentPane.add(text4);
		
		texto = new JTextField();
		texto.setFont(new Font("Goudy Stout", Font.PLAIN, 16));
		texto.addKeyListener(new KeyAdapter() {
			int cont=0,contg=0,p1=0,p2=0,p3=0;
			@Override
			public void keyPressed(KeyEvent arg0) {

				String pla="JAVA";
				String a[]=pla.split("");
				if(arg0.getKeyCode() == KeyEvent.VK_ENTER) {
				    	if((texto.getText().charAt(0)==a[0].charAt(0) && p1==0)||(texto.getText().charAt(0)==a[0].toLowerCase().charAt(0)&& p1==0)) {
				    		text1.setText(a[0].toString());
				    		falla.setText("CORRECTO");
				    		texto.setText("");
				    		contg++;
				    		p1++;
				    	}else if((texto.getText().charAt(0)==a[1].charAt(0)&& p2==0)||(texto.getText().charAt(0)==a[1].toLowerCase().charAt(0)&& p2==0)) {
				    		text2.setText(a[1].toString());
				    		text4.setText(a[3].toString());
				    		falla.setText("CORRECTO");
				    		texto.setText("");
				    		contg++;
				    		p2++;
				    	} else if((texto.getText().charAt(0)==a[2].charAt(0)&& p3==0)||(texto.getText().charAt(0)==a[2].toLowerCase().charAt(0)&& p3==0)) {
				    		text3.setText(a[2].toString());
				    		falla.setText("CORRECTO");
				    		texto.setText("");
				    		contg++;
				    		p3++;
				    	}else {
				    		cont++;
				    		falla.setText("FALLASTE");
				    		texto.setText("");
				    		switch(cont){
				    		case 1:
				    			label.setIcon(new ImageIcon(Ahorcado.class.getResource("/text/img2.png")));
				    			break;
				    		case 2:
				    			label.setIcon(new ImageIcon(Ahorcado.class.getResource("/text/img3.png")));
				    			break;
				    		case 3:
				    			label.setIcon(new ImageIcon(Ahorcado.class.getResource("/text/img4.png")));
				    			break;
				    		case 4:
				    			label.setIcon(new ImageIcon(Ahorcado.class.getResource("/text/img5.png")));
				    			break;
				    		case 5:
				    			label.setIcon(new ImageIcon(Ahorcado.class.getResource("/text/img6.png")));
				    			falla.setText("PERDISTE");
					    		texto.setText("");
				    			texto.setEditable(false);
				    			break;
				    		}
				    	}
				    	if(contg>=3) {
				    		falla.setText("GANASTE");
				    		texto.setText("");
				    		texto.setEditable(false);
				    	}
				   }
			}
		});
		texto.setBounds(304, 101, 57, 29);
		contentPane.add(texto);
		texto.setColumns(10);
		
		JLabel lblIngresaUnaLetra = new JLabel("Ingresa una letra");
		lblIngresaUnaLetra.setFont(new Font("Forte", Font.PLAIN, 16));
		lblIngresaUnaLetra.setLabelFor(this);
		lblIngresaUnaLetra.setBounds(304, 70, 138, 20);
		contentPane.add(lblIngresaUnaLetra);
		
		falla = new JLabel("");
		falla.setFont(new Font("Forte", Font.PLAIN, 33));
		falla.setBounds(304, 223, 188, 46);
		contentPane.add(falla);
	}
}
