package Curso;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Button;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SubirBase extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SubirBase frame = new SubirBase();
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
	public SubirBase() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 312);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton b1 = new JButton("ALTA");
		
		JTextArea t1 = new JTextArea();
		t1.setBounds(10, 84, 439, 178);
		contentPane.add(t1);
		b1.setBounds(10, 50, 89, 23);
		contentPane.add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a=t1.getText();
				String[]ab=a.split("\n");
				for(int x=0;x<=ab.length;x++) {
					String y=ab[x];
					String[] arr=y.split(" ");
					int id=Integer.parseInt(arr[0]);
					String nom=arr[1];
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","");
						String inser="INSERT INTO proy VALUES("+id+",'"+nom+"');";
						
						Statement stmt=con.createStatement();
						stmt.executeUpdate(inser);
						
						con.close();
					}catch(Exception r) {
						System.out.println(r);
					}
				}
				
			}
		});
		
		JButton b2 = new JButton("BAJA");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=t1.getText();
				String[]ab=a.split("\n");
				for(int x=0;x<=ab.length;x++) {
					int id=Integer.parseInt(ab[x]);
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","");
						String inser="DELETE FROM proy WHERE id="+id+";";
						
						Statement stmt=con.createStatement();
						stmt.executeUpdate(inser);
						
						con.close();
					}catch(Exception r) {
						System.out.println(r);
					}
				}
			}
		});
		b2.setBounds(181, 50, 89, 23);
		contentPane.add(b2);
		
		JButton b3 = new JButton("CAMBIOS");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=t1.getText();
				String[]ab=a.split("\n");
				for(int x=0;x<=ab.length;x++) {
					String y=ab[x];
					String[] arr=y.split(" ");
					int id=Integer.parseInt(arr[0]);
					String nom=arr[1];
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","");
						String inser="UPDATE proy SET nom='"+nom+"' WHERE id="+id+";";
						
						Statement stmt=con.createStatement();
						stmt.executeUpdate(inser);
						
						con.close();
					}catch(Exception r) {
						System.out.println(r);
					}
				}
				
			}
		});
		b3.setBounds(360, 50, 89, 23);
		contentPane.add(b3);
		
		JButton leer = new JButton("LEER");
		leer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","");
					
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery("select * from proy");
					while(rs.next()) {
						System.out.println(rs.getInt(1)+" "+rs.getString(2));
					}
					con.close();
				}catch(Exception r) {
					System.out.println(r);
				}
			}
		});
		leer.setBounds(181, 11, 89, 23);
		contentPane.add(leer);
	}
}
