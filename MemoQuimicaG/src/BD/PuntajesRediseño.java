package BD;

import GUI.*;
import GUI.MenuPrincipal;
import GUI.Q1Dificil;
import GUI.Q1Facil;
import GUI.Q1Medio;
import GUI.Q2Facil;
import GUI.Q2Medio;
import GUI.Q2Dificil;
import GUI.Q3Dificil;
import GUI.Q3Facil;
import GUI.Q3Medio;
import GUI.Q4Dificil;
import GUI.Q4Facil;
import GUI.Q4Medio;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PuntajesRediseño extends javax.swing.JFrame {
    ConexionBD con= new ConexionBD();
    Connection cn = con.conexion();
    public static boolean facil,medio,dificil,quimuno,quimdos,quimtres,quimcuatro;
    public static String dificultadparaBD,juegoparaBD; 

    public PuntajesRediseño() {
        initComponents();
        JLBPuntaje.setEnabled(false);
        this.setLocationRelativeTo(null);
        setTitle("Ventana de puntajes");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        JLBMemJugado = new javax.swing.JLabel();
        JLBDifJugado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JLBFechaJugado = new javax.swing.JLabel();
        JLBPuntaje = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jlb1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JBTPuntaje = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        JTFNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 249, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Dubai Medium", 0, 50)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CSS/enviaChico.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2Enviar(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 380, -1));

        JLBMemJugado.setFont(new java.awt.Font("Dubai Medium", 0, 50)); // NOI18N
        JLBMemJugado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(JLBMemJugado, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 510, 600, 60));

        JLBDifJugado.setFont(new java.awt.Font("Dubai Medium", 0, 50)); // NOI18N
        JLBDifJugado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(JLBDifJugado, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 620, 600, 60));

        jLabel6.setFont(new java.awt.Font("Dubai Medium", 0, 50)); // NOI18N
        jLabel6.setText("Dificultad Jugada:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 610, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dubai Medium", 0, 50)); // NOI18N
        jLabel5.setText("Memorama Jugado:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dubai Medium", 0, 50)); // NOI18N
        jLabel7.setText("Fecha de juego:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 720, -1, -1));

        JLBFechaJugado.setFont(new java.awt.Font("Dubai Medium", 0, 50)); // NOI18N
        JLBFechaJugado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(JLBFechaJugado, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 730, 600, 60));

        JLBPuntaje.setFont(new java.awt.Font("Dubai Medium", 1, 50)); // NOI18N
        JLBPuntaje.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(JLBPuntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 400, 200, 60));

        jPanel3.setBackground(new java.awt.Color(121, 6, 63));

        jlb1.setFont(new java.awt.Font("Dubai Medium", 0, 120)); // NOI18N
        jlb1.setForeground(new java.awt.Color(255, 255, 255));
        jlb1.setText("Ventana de Puntajes");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CSS/LogoFinal.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jlb1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jlb1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, 250));

        jLabel4.setFont(new java.awt.Font("Dubai Medium", 0, 50)); // NOI18N
        jLabel4.setText("Puntaje:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, -1, -1));

        JBTPuntaje.setFont(new java.awt.Font("Dubai Medium", 0, 50)); // NOI18N
        JBTPuntaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CSS/regresa_1.png"))); // NOI18N
        JBTPuntaje.setBorder(null);
        JBTPuntaje.setBorderPainted(false);
        JBTPuntaje.setContentAreaFilled(false);
        JBTPuntaje.setFocusable(false);
        JBTPuntaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTPuntajeObtenerPuntaje(evt);
            }
        });
        jPanel1.add(JBTPuntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 380, -1, 90));

        jButton8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CSS/regresa.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setDefaultCapable(false);
        jButton8.setFocusable(false);
        jButton8.setHideActionText(true);
        jButton8.setRequestFocusEnabled(false);
        jButton8.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/CSS/menuPriSel.png"))); // NOI18N
        jButton8.setSelected(true);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 400, 150));

        JTFNombre.setFont(new java.awt.Font("Dubai Medium", 0, 50)); // NOI18N
        JTFNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JTFNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNombreActionPerformed(evt);
            }
        });
        JTFNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFNombreKeyTyped(evt);
            }
        });
        jPanel1.add(JTFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 300, 600, 60));

        jLabel3.setFont(new java.awt.Font("Dubai Medium", 0, 50)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void EstablecerPuntajePorDefault(){
        if(quimuno==true){
            juegoparaBD="Quimica Inorganica 1";
            
            if(facil==true){
            Q1Facil llamaraclaseQ1F=new Q1Facil();
            dificultadparaBD="Facil";
            JLBPuntaje.setText(String.valueOf(llamaraclaseQ1F.puntaje));
            JBTPuntaje.setEnabled(false);
            JLBMemJugado.setText(juegoparaBD);
            JLBDifJugado.setText(dificultadparaBD);
            }
            if(medio==true){
            Q1Medio llamaraclaseQ1M=new Q1Medio();
            dificultadparaBD="Medio";
            JLBPuntaje.setText(String.valueOf(llamaraclaseQ1M.puntaje));
            JBTPuntaje.setEnabled(false);
            JLBMemJugado.setText(juegoparaBD);
            JLBDifJugado.setText(dificultadparaBD);
            }
            if(dificil==true){
            dificultadparaBD="Dificil";
            Q1Dificil llamaraclaseQ1D=new Q1Dificil();
            JLBPuntaje.setText(String.valueOf(llamaraclaseQ1D.puntaje));
            JBTPuntaje.setEnabled(false);
            JLBMemJugado.setText(juegoparaBD);
            JLBDifJugado.setText(dificultadparaBD);
            }
        }
        if(quimdos==true){
            juegoparaBD="Quimica Organica 2";
            if(facil==true){
            dificultadparaBD="Facil";
            Q2Facil llamaraclaseQ2F=new Q2Facil();
            JLBPuntaje.setText(String.valueOf(llamaraclaseQ2F.puntaje));
            JBTPuntaje.setEnabled(false);
            JLBMemJugado.setText(juegoparaBD);
            JLBDifJugado.setText(dificultadparaBD);
            }
            if(medio==true){
            dificultadparaBD="Medio";
            Q2Medio llamaraclaseQ2M=new Q2Medio();
            JLBPuntaje.setText(String.valueOf(llamaraclaseQ2M.puntaje));
            JBTPuntaje.setEnabled(false);
            JLBMemJugado.setText(juegoparaBD);
            JLBDifJugado.setText(dificultadparaBD);
            }
            if(dificil==true){
            dificultadparaBD="Dificil";
            Q2Dificil llamaraclaseQ2D=new Q2Dificil();
            JLBPuntaje.setText(String.valueOf(llamaraclaseQ2D.puntaje));
            JBTPuntaje.setEnabled(false);
            JLBMemJugado.setText(juegoparaBD);
            JLBDifJugado.setText(dificultadparaBD);
            }
        }
        if(quimtres==true){
            juegoparaBD="Quimica Avanzada 3";
            if(facil==true){
            dificultadparaBD="Facil";
            Q3Facil llamaraclaseQ3F=new Q3Facil();
            JLBPuntaje.setText(String.valueOf(llamaraclaseQ3F.puntaje));
            JBTPuntaje.setEnabled(false);
            JLBMemJugado.setText(juegoparaBD);
            JLBDifJugado.setText(dificultadparaBD);
            }
            if(medio==true){
            dificultadparaBD="Medio";
            Q3Medio llamaraclaseQ3M=new Q3Medio();
            JLBPuntaje.setText(String.valueOf(llamaraclaseQ3M.puntaje));
            JBTPuntaje.setEnabled(false);
            JLBMemJugado.setText(juegoparaBD);
            JLBDifJugado.setText(dificultadparaBD);
            }
            if(dificil==true){
            dificultadparaBD="Dificil";
            Q3Dificil llamaraclaseQ3D=new Q3Dificil();
            JLBPuntaje.setText(String.valueOf(llamaraclaseQ3D.puntaje));
            JBTPuntaje.setEnabled(false);
            JLBMemJugado.setText(juegoparaBD);
            JLBDifJugado.setText(dificultadparaBD);
            }
        }
        if(quimcuatro==true){
            juegoparaBD="Quimica Termoquimica 4";
            if(facil==true){
            dificultadparaBD="Facil";
            Q4Facil llamaraclaseQ4F=new Q4Facil();
            JLBPuntaje.setText(String.valueOf(llamaraclaseQ4F.puntaje));
            JBTPuntaje.setEnabled(false);
            JLBMemJugado.setText(juegoparaBD);
            JLBDifJugado.setText(dificultadparaBD);
            }
            if(medio==true){
            dificultadparaBD="Medio";
            Q4Medio llamaraclaseQ4M=new Q4Medio();
            JLBPuntaje.setText(String.valueOf(llamaraclaseQ4M.puntaje));
            JBTPuntaje.setEnabled(false);
            JLBMemJugado.setText(juegoparaBD);
            JLBDifJugado.setText(dificultadparaBD);
            }
            if(dificil==true){
            dificultadparaBD="Dificil";
            Q4Dificil llamaraclaseQ4D=new Q4Dificil();
            JLBPuntaje.setText(String.valueOf(llamaraclaseQ4D.puntaje));
            JBTPuntaje.setEnabled(false);
            JLBMemJugado.setText(juegoparaBD);
            JLBDifJugado.setText(dificultadparaBD);
            }   
        }
    }
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
MenuPrincipal ventana = new MenuPrincipal();
        ventana.setVisible(true);
        this.setVisible(false);     
    }//GEN-LAST:event_jButton8ActionPerformed

    private void JTFNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFNombreKeyTyped
        if(JTFNombre.getText().length()>=15){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Tu nombre no debe tener mas de 15 caracteres de longitud");
        }
    }//GEN-LAST:event_JTFNombreKeyTyped

    private void JTFNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNombreActionPerformed

    private void JBTPuntajeObtenerPuntaje(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTPuntajeObtenerPuntaje
        EstablecerPuntajePorDefault();
    }//GEN-LAST:event_JBTPuntajeObtenerPuntaje

    private void jButton2Enviar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2Enviar
        try {
            if(((JLBPuntaje.getText().length())==0)&&((JTFNombre.getText().length())==0)){
                JOptionPane.showMessageDialog(rootPane, "Debes Ingresar un nombre", "Puntaje", HEIGHT);
                JOptionPane.showMessageDialog(rootPane, "Debes obtener tu puntaje", "Puntaje", HEIGHT);
            }
            if((JTFNombre.getText().length())!=0 ){
                PreparedStatement pps= (PreparedStatement) cn.prepareStatement("INSERT INTO jugador(Nombre_Del_Jugador,Puntaje) VALUES(?,?)");
                pps.setString(1, JTFNombre.getText());
                pps.setString(2, String.valueOf(JLBPuntaje.getText()));
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Puntaje Guardado");
            }
            else if((JTFNombre.getText().length())==0){
                JOptionPane.showMessageDialog(rootPane, "Introduce un nombre");
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPuntajes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2Enviar

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
            java.util.logging.Logger.getLogger(PuntajesRediseño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PuntajesRediseño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PuntajesRediseño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PuntajesRediseño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PuntajesRediseño().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTPuntaje;
    private javax.swing.JLabel JLBDifJugado;
    private javax.swing.JLabel JLBFechaJugado;
    private javax.swing.JLabel JLBMemJugado;
    private javax.swing.JLabel JLBPuntaje;
    private javax.swing.JTextField JTFNombre;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlb1;
    // End of variables declaration//GEN-END:variables
}
