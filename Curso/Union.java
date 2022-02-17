package Curso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.*;
public class Union extends JFrame {

	private JPanel contentPane;
	private JTextField texto1;
	private JTextField texto2;
	private JTextField union;
	private JTextField inter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Union frame = new Union();
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
	public Union() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		texto1 = new JTextField();
		texto1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					String[] c=texto1.getText().split(",");
					
				   }
			}
		});
		texto1.setBounds(10, 47, 124, 20);
		contentPane.add(texto1);
		texto1.setColumns(10);
		
		texto2 = new JTextField();
		texto2.setColumns(10);
		texto2.setBounds(264, 47, 124, 20);
		contentPane.add(texto2);
		
		union = new JTextField();
		union.setColumns(10);
		union.setBounds(10, 154, 124, 20);
		contentPane.add(union);
		
		inter = new JTextField();
		inter.setColumns(10);
		inter.setBounds(264, 154, 124, 20);
		contentPane.add(inter);
		
		JLabel lblUnion = new JLabel("UNION");
		lblUnion.setBounds(49, 129, 46, 14);
		contentPane.add(lblUnion);
		
		JLabel lblInterseccion = new JLabel("INTERSECCION");
		lblInterseccion.setBounds(281, 129, 89, 14);
		contentPane.add(lblInterseccion);
	}
}
