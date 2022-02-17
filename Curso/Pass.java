package Curso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pass extends JFrame {

	private JPanel contentPane;
	private JPasswordField pass;
	int cont=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pass frame = new Pass();
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
	public Pass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 271, 245);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		pass = new JPasswordField();
		pass.setEchoChar('*');
		pass.setBounds(31, 74, 161, 20);
		contentPane.add(pass);
		
		JLabel lblIngreseLaContrasea = new JLabel("Ingrese la contrase\u00F1a");
		lblIngreseLaContrasea.setBounds(51, 49, 127, 14);
		contentPane.add(lblIngreseLaContrasea);
		

		JLabel resp = new JLabel("");
		resp.setBounds(37, 165, 176, 14);
		contentPane.add(resp);
		
		JButton conf = new JButton("Confirmar");
		conf.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				String con="pass";
				if(pass.getText().equals(con)) {
					resp.setText("Correcto");
				}else {
					cont++;
					resp.setText("Fallaste, intentos: "+cont);
				}
				if(cont>=5) {
					resp.setText("Se te acabaron los intentos :(");
					conf.setVisible(false);
				}
			}
		});
		
		conf.setBounds(60, 109, 118, 23);
		contentPane.add(conf);
	}
}
