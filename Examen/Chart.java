package Examen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.data.general.SeriesException; 
import org.jfree.data.time.Second; 
import org.jfree.data.time.TimeSeries; 
import org.jfree.data.time.TimeSeriesCollection; 
import org.jfree.data.xy.XYDataset; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities;

public class Chart extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	
	public int ced[]=new int[10];
	public String estado[]=new String[10];
	public int graf=0;
	private int AGS=1,DUR=10,MTY=19,OAX=20,SLP=24,ZAC=32,esi,esf;
	private String sex="",tipsex="",edi="1",edf="100",est="";
	StringBuilder tab=new StringBuilder("SEXO	EDAD	ESTADO\n");
	
	public String gettipsex() {
		return tipsex;
	}
	public String getedi() {
		return edi;
	}
	public String getedf() {
		return edf;
	}
	public String getest() {
		return est;
	}
	
	public void setDatos(String tipsex, String edi, String edf, String est) {
		this.tipsex=tipsex;
		this.edi=edi;
		this.edf=edf;
		this.est=est;
	}
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Chart() {
		//int x=0,csex[]=new int[6],ced[]=new int[6],ces[]=new int[6];
		//String estado[]=new String[6];
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 728, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Selecci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setToolTipText("");
		panel.setBounds(10, 11, 258, 448);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JCheckBox Pie = new JCheckBox("Pie");
		buttonGroup.add(Pie);
		Pie.setBounds(6, 46, 48, 23);
		panel.add(Pie);
		
		JCheckBox Bar = new JCheckBox("Bar");
		buttonGroup.add(Bar);
		Bar.setBounds(56, 46, 48, 23);
		panel.add(Bar);
		
		JCheckBox Line = new JCheckBox("Line");
		buttonGroup.add(Line);
		Line.setBounds(106, 46, 59, 23);
		panel.add(Line);
		
		JCheckBox Xy = new JCheckBox("XY");
		buttonGroup.add(Xy);
		Xy.setBounds(168, 46, 48, 23);
		panel.add(Xy);
		
		JLabel lblInterface = new JLabel("INTERFACE");
		lblInterface.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblInterface.setBounds(56, 25, 103, 14);
		panel.add(lblInterface);
		
		JLabel lblRangos = new JLabel("RANGOS");
		lblRangos.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblRangos.setBounds(66, 76, 74, 14);
		panel.add(lblRangos);
		
		JCheckBox Sexo = new JCheckBox("Sexo");
		Sexo.setBounds(6, 97, 59, 23);
		panel.add(Sexo);
		
		JCheckBox Edad = new JCheckBox("Edad");
		Edad.setBounds(6, 132, 59, 23);
		panel.add(Edad);
		
		JCheckBox Estado = new JCheckBox("Estado");
		Estado.setBounds(6, 171, 74, 23);
		panel.add(Estado);
		
		JCheckBox M = new JCheckBox("M");
		M.setBounds(76, 97, 38, 23);
		panel.add(M);
		
		JCheckBox H = new JCheckBox("H");
		H.setBounds(142, 97, 49, 23);
		panel.add(H);
		
		t1 = new JTextField();
		t1.setBounds(86, 133, 48, 20);
		panel.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(152, 133, 48, 20);
		panel.add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(86, 172, 48, 20);
		panel.add(t3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(162, 172, 48, 20);
		panel.add(t4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 249, 242, 188);
		panel.add(scrollPane);
		
		JTextArea ta = new JTextArea();
		scrollPane.setViewportView(ta);
		
		JButton btn = new JButton("OK");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","");
					Statement stmt=con.createStatement();
					if(Pie.isSelected()==true) {
						graf=1;
					}else if(Bar.isSelected()==true) {
						graf=2;
					}else if(Line.isSelected()==true) {
						graf=3;
					}else if(Xy.isSelected()==true){
						graf=4;
					}else {
						graf=0;
					}
					
					if(Sexo.isSelected()==true) {
						if(M.isSelected()==true&&H.isSelected()==false) {
						sex="Sexo";
						tipsex="'M'";
						}else if(H.isSelected()==true&&M.isSelected()==false) {
							sex="Sexo";
							tipsex="'H'";	
						}else if(M.isSelected()==true&&H.isSelected()==true){
							sex="Sexo";
							tipsex="'H','M'";
						}else {
							Sexo.getDisabledSelectedIcon();
							tipsex="'y'";
						}
					}
					if(Edad.isSelected()==true) {
						edi=t1.getText();
						edf=t2.getText();
						
					}

					StringBuilder estad=new StringBuilder("");
					if(Estado.isSelected()==true) {
						esi=Integer.parseInt(t3.getText());
						esf=Integer.parseInt(t4.getText());
						if(AGS>=esi&&AGS<=esf) {
							estad.append(",'AGS'");
						}
						if(DUR>=esi&&DUR<=esf) {
							estad.append(",'DUR'");
						}
						if(MTY>=esi&&MTY<=esf) {
							estad.append(",'MTY'");
						}
						if(OAX>=esi&&OAX<=esf) {
							estad.append(",'OAX'");
						}
						if(SLP>=esi&&SLP<=esf) {
							estad.append(",'SLP'");
						}
						if(ZAC>=esi&&ZAC<=esf) {
							estad.append(",'ZAC'");
						}
						
						est=estad.toString();
					}
					ResultSet rs=stmt.executeQuery("select sexo,edad,estado from alumnos where "+sex+" in("+tipsex+") and estado in('x'"+est+") and edad between "+edi+" and "+edf);
					while(rs.next()) {
						tab.append(" "+rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getString(3)+"\n");
					}
					
					int x=0;
					switch(graf) {
					case 1:
						  PieChart_AWT demo = new PieChart_AWT( "Edades" );  
					      demo.setSize( 560 , 367 );    
					      RefineryUtilities.centerFrameOnScreen( demo );    
					      demo.setVisible( true );
						break;
					case 2:
						
						break;
					case 3:
						
						break;
					case 4:
						
						break;
					default:
						
						break;
				}
					
					ta.setText(tab.toString());
					con.close();
				}catch(Exception e) {
					System.out.println(e);
				}
			}
		});
		
		btn.setFont(new Font("Arial Black", Font.BOLD, 18));
		btn.setBounds(168, 203, 80, 35);
		panel.add(btn);
		
		JLabel lblA = new JLabel("a");
		lblA.setBounds(138, 136, 21, 14);
		panel.add(lblA);
		
		JLabel label = new JLabel("a");
		label.setBounds(138, 175, 21, 14);
		panel.add(label);
		
		JLabel lblYo = new JLabel("y/o");
		lblYo.setBounds(120, 101, 21, 14);
		panel.add(lblYo);
		
		JLabel lblResultados = new JLabel("RESULTADOS");
		lblResultados.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblResultados.setBounds(10, 224, 130, 14);
		panel.add(lblResultados);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Gr\u00E1fica", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel_1.setToolTipText("");
		panel_1.setBounds(278, 11, 424, 448);
		contentPane.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	}
}
