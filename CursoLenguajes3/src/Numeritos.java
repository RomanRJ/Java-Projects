
import java.util.StringTokenizer;
import java.lang.String;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crism
 */
public class Numeritos extends javax.swing.JFrame {

    /**
     * Creates new form Numeritos
     */
       String n = new String(""); 
       String n2 = new String("");
       public int x = 0;
       public int z = 0;
       StringBuilder sb = new StringBuilder();
       StringBuilder sb2 = new StringBuilder();

    public Numeritos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texto1 = new javax.swing.JTextField();
        texto2 = new javax.swing.JTextField();
        texto3 = new javax.swing.JTextField();
        texto4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        texto1.setToolTipText("");
        texto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto1ActionPerformed(evt);
            }
        });

        texto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Union");

        jLabel2.setText("Intersección");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(texto2, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(texto1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(texto4, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(texto3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(206, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto1ActionPerformed
        // TODO add your handling code here:
        
       StringTokenizer s = new StringTokenizer(texto1.getText(),",");
       StringTokenizer s2 = new StringTokenizer(texto2.getText(),",");
       StringTokenizer s3 = new StringTokenizer(texto2.getText(),",");

       while(s.hasMoreTokens()||s2.hasMoreTokens()){
           
        if(s.hasMoreTokens()||s2.hasMoreTokens()){
            
           if(s.hasMoreTokens()){
            n = s.nextToken();
            x = Integer.parseInt(n);
            sb2.append(n+",");
           }else{
               n="";
           }
           
           if(s2.hasMoreTokens()){
            n2 = s2.nextToken();
            z = Integer.parseInt(n2);
            sb2.append(n2+",");
           }else{
               n2="";
           }
           
           s3 = new StringTokenizer(texto2.getText(),",");
           
           while(s3.hasMoreTokens()){
               
           Integer p = new Integer(Integer.parseInt(n));
           String a = s3.nextToken();
           Integer c = new Integer(Integer.parseInt(a));
           
                if(n.equals(a)){
               
                    sb.append(p.toString()+",");
                    
                            
                                          
                }
           }                                
        }
       
       }
       



        texto3.setText(sb.toString());
        texto4.setText(sb2.toString());
        
    }//GEN-LAST:event_texto1ActionPerformed

    private void texto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto2ActionPerformed
        // TODO add your handling code here:
       StringTokenizer s = new StringTokenizer(texto1.getText(),",");
       StringTokenizer s2 = new StringTokenizer(texto2.getText(),",");
       StringTokenizer s3 = new StringTokenizer(texto2.getText(),",");

       while(s.hasMoreTokens()||s2.hasMoreTokens()){
           
        if(s.hasMoreTokens()||s2.hasMoreTokens()){
            
           if(s.hasMoreTokens()){
            n = s.nextToken();
            x = Integer.parseInt(n);
            sb2.append(n+",");
           }else{
               n="";
           }
           
           if(s2.hasMoreTokens()){
            n2 = s2.nextToken();
            z = Integer.parseInt(n2);
            sb2.append(n2+",");
           }else{
               n2="";
           }
           
           s3 = new StringTokenizer(texto2.getText(),",");
           
           while(s3.hasMoreTokens()){
               
           Integer p = new Integer(Integer.parseInt(n));
           String a = s3.nextToken();
           Integer c = new Integer(Integer.parseInt(a));
           
                if(n.equals(a)){
               
                    sb.append(p.toString()+",");
                    
                            
                                          
                }
           }                                
        }
       
       }
       



        texto3.setText(sb.toString());
        texto4.setText(sb2.toString()); 
        
        
        
        
    }//GEN-LAST:event_texto2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Numeritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Numeritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Numeritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Numeritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Numeritos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField texto1;
    private javax.swing.JTextField texto2;
    private javax.swing.JTextField texto3;
    private javax.swing.JTextField texto4;
    // End of variables declaration//GEN-END:variables
}
