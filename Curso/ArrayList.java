package Curso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ArrayList extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArrayList frame = new ArrayList();
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
	public ArrayList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane t4 = new JTextPane();
		t4.setBounds(10, 139, 414, 203);
		contentPane.add(t4);
		
		t1 = new JTextField();
		t1.setBounds(10, 11, 86, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				
			}
		});
		t2.setColumns(10);
		t2.setBounds(10, 42, 86, 20);
		contentPane.add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(10, 73, 86, 20);
		contentPane.add(t3);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(335, 105, 89, 23);
		contentPane.add(btnNewButton);
	}
}
