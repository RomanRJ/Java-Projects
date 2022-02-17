package Examen;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
 
public class PieChart_AWT extends ApplicationFrame {
   
   public PieChart_AWT( String title ) {
      super( title ); 
      setContentPane(createDemoPanel( ));
   }
   
   private static PieDataset createDataset( ) {
	   DefaultPieDataset dataset = new DefaultPieDataset( );
	   Chart xd=new Chart();
	   String est=xd.getest();
	   String tipsex=xd.gettipsex();
	   String edi=xd.getedi();
	   String edf=xd.getedf();
	   try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","");
			Statement stmt=con.createStatement();
			double x;
			int y=0,z;
			String a;
			ResultSet count=stmt.executeQuery("select estado, count(edad) as Edad from alumnos where sexo in('M') and estado in('AGS','DUR','MTY','SLP','OAX','ZAC') and edad between 18 and 19 group by estado");
			while(count.next()) {
				z=count.getInt(2);
				a=String.valueOf(z);
				x=Double.parseDouble(a);
				dataset.setValue( count.getString(1) , new Double( x ) );
			} 
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		} 
	      return dataset;         
	   }
   
   
   private static JFreeChart createChart( PieDataset dataset ) {
      JFreeChart chart = ChartFactory.createPieChart(      
         "Edades",   // chart title 
         dataset,          // data    
         true,             // include legend   
         true, 
         true);

      return chart;
   }
   
   public static JPanel createDemoPanel( ) {
      JFreeChart chart = createChart(createDataset( ) );  
      return new ChartPanel( chart ); 
   }

   public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chart frame = new Chart();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}