package GUI;

import packeteGomez.GomezClass;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Q1Facil extends javax.swing.JFrame {
    
    private GomezClass llama = new GomezClass();
    private boolean caraVolteada = false;
    private ImageIcon imagenUno;
    private ImageIcon imagenDos;
    private JButton[] guardador = new JButton[2];//guarda las imagenes de los botones
    private boolean segundaCara = false;
    int puntaje=0;

    public Q1Facil() {
        initComponents();
        setTitle("Memorama Quimnica Inorganica 1");
        Ordenar();
    }
    
    private void Ordenar() {//ordena cartas de forma aleatoria al iniciar el programa
        int[] Arreglo = llama.Varianza();

        jbt1.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesQ1/carta" + Arreglo[0] + ".png")));
        jbt2.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesQ1/carta" + Arreglo[1] + ".png")));
        jbt3.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesQ1/carta" + Arreglo[2] + ".png")));
        jbt4.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesQ1/carta" + Arreglo[3] + ".png")));
        jbt5.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesQ1/carta" + Arreglo[4] + ".png")));
        jbt6.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesQ1/carta" + Arreglo[5] + ".png")));
        jbt7.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesQ1/carta" + Arreglo[6] + ".png")));
        jbt8.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesQ1/carta" + Arreglo[7] + ".png")));
    }

    private void volteador(JButton boton) {

        if (!caraVolteada) {
            boton.setEnabled(false);
            imagenUno = (ImageIcon) boton.getDisabledIcon();
            guardador[0] = boton;
            caraVolteada = true;
            segundaCara = false;
        } else {
            boton.setEnabled(false);
            imagenDos = (ImageIcon) boton.getDisabledIcon();
            guardador[1] = boton;
            segundaCara = true;
            puntaje=puntaje+10;
            if (!jbt1.isEnabled() && !jbt2.isEnabled() && !jbt3.isEnabled() && !jbt4.isEnabled() && !jbt5.isEnabled() && !jbt6.isEnabled() && !jbt7.isEnabled() && !jbt8.isEnabled()) {
                JOptionPane.showMessageDialog(this, "Tu puntaje es de: " + puntaje, "Ganaste papu!!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private void comparador() {
        if (caraVolteada && segundaCara) {
            if (imagenUno.getDescription().compareTo(imagenDos.getDescription()) != 0) {
                guardador[0].setEnabled(true);
                guardador[1].setEnabled(true);
                if (puntaje > 5) {
                    puntaje=puntaje-5;
                }
            }
            caraVolteada = false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jbt1 = new javax.swing.JButton();
        jbt2 = new javax.swing.JButton();
        jbt3 = new javax.swing.JButton();
        jbt4 = new javax.swing.JButton();
        jbt5 = new javax.swing.JButton();
        jbt6 = new javax.swing.JButton();
        jbt7 = new javax.swing.JButton();
        jbt8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 249, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(121, 6, 63));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1800, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, 250));

        jbt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/carta0.png"))); // NOI18N
        jbt1.setBorder(null);
        jbt1.setBorderPainted(false);
        jbt1.setContentAreaFilled(false);
        jbt1.setFocusable(false);
        jbt1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/cr.png"))); // NOI18N
        jbt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbt1MouseExited(evt);
            }
        });
        jbt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 250, 250));

        jbt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/carta0.png"))); // NOI18N
        jbt2.setBorder(null);
        jbt2.setBorderPainted(false);
        jbt2.setContentAreaFilled(false);
        jbt2.setFocusable(false);
        jbt2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/cr.png"))); // NOI18N
        jbt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbt2MouseExited(evt);
            }
        });
        jbt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt2ActionPerformed(evt);
            }
        });
        jPanel1.add(jbt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 250, 250));

        jbt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/carta0.png"))); // NOI18N
        jbt3.setBorder(null);
        jbt3.setBorderPainted(false);
        jbt3.setContentAreaFilled(false);
        jbt3.setFocusable(false);
        jbt3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/cr.png"))); // NOI18N
        jbt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbt3MouseExited(evt);
            }
        });
        jbt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt3ActionPerformed(evt);
            }
        });
        jPanel1.add(jbt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 250, 250));

        jbt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/carta0.png"))); // NOI18N
        jbt4.setBorder(null);
        jbt4.setBorderPainted(false);
        jbt4.setContentAreaFilled(false);
        jbt4.setFocusable(false);
        jbt4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/cr.png"))); // NOI18N
        jbt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbt4MouseExited(evt);
            }
        });
        jbt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt4ActionPerformed(evt);
            }
        });
        jPanel1.add(jbt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 300, 250, 250));

        jbt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/carta0.png"))); // NOI18N
        jbt5.setBorder(null);
        jbt5.setBorderPainted(false);
        jbt5.setContentAreaFilled(false);
        jbt5.setFocusable(false);
        jbt5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/cr.png"))); // NOI18N
        jbt5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbt5MouseExited(evt);
            }
        });
        jbt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt5ActionPerformed(evt);
            }
        });
        jPanel1.add(jbt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, 250, 250));

        jbt6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/carta0.png"))); // NOI18N
        jbt6.setBorder(null);
        jbt6.setBorderPainted(false);
        jbt6.setContentAreaFilled(false);
        jbt6.setFocusable(false);
        jbt6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/cr.png"))); // NOI18N
        jbt6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbt6MouseExited(evt);
            }
        });
        jbt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt6ActionPerformed(evt);
            }
        });
        jPanel1.add(jbt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 630, 250, 250));

        jbt7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/carta0.png"))); // NOI18N
        jbt7.setBorder(null);
        jbt7.setBorderPainted(false);
        jbt7.setContentAreaFilled(false);
        jbt7.setFocusable(false);
        jbt7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/cr.png"))); // NOI18N
        jbt7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbt7MouseExited(evt);
            }
        });
        jbt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt7ActionPerformed(evt);
            }
        });
        jPanel1.add(jbt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 640, 250, 250));

        jbt8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/carta0.png"))); // NOI18N
        jbt8.setBorder(null);
        jbt8.setBorderPainted(false);
        jbt8.setContentAreaFilled(false);
        jbt8.setFocusable(false);
        jbt8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/cr.png"))); // NOI18N
        jbt8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbt8MouseExited(evt);
            }
        });
        jbt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt8ActionPerformed(evt);
            }
        });
        jPanel1.add(jbt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 640, 250, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt1ActionPerformed
        volteador(jbt1);
    }//GEN-LAST:event_jbt1ActionPerformed

    private void jbt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt2ActionPerformed
     volteador(jbt2);
    }//GEN-LAST:event_jbt2ActionPerformed

    private void jbt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt3ActionPerformed
        // TODO add your handling code here:
        volteador(jbt3);
    }//GEN-LAST:event_jbt3ActionPerformed

    private void jbt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt4ActionPerformed
        // TODO add your handling code here:
        volteador(jbt4);
    }//GEN-LAST:event_jbt4ActionPerformed

    private void jbt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt5ActionPerformed
        // TODO add your handling code here:
        volteador(jbt5);
    }//GEN-LAST:event_jbt5ActionPerformed

    private void jbt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt6ActionPerformed
        // TODO add your handling code here:
        volteador(jbt6);
    }//GEN-LAST:event_jbt6ActionPerformed

    private void jbt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt7ActionPerformed
        // TODO add your handling code here:
        volteador(jbt7);
    }//GEN-LAST:event_jbt7ActionPerformed

    private void jbt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt8ActionPerformed
        // TODO add your handling code here:
        volteador(jbt8);
    }//GEN-LAST:event_jbt8ActionPerformed

    private void jbt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt1MouseExited
        // TODO add your handling code here:
        comparador();
    }//GEN-LAST:event_jbt1MouseExited

    private void jbt2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt2MouseExited
        // TODO add your handling code here:
        comparador();
    }//GEN-LAST:event_jbt2MouseExited

    private void jbt3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt3MouseExited
        // TODO add your handling code here:
        comparador();
    }//GEN-LAST:event_jbt3MouseExited

    private void jbt4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt4MouseExited
        // TODO add your handling code here:
        comparador();
    }//GEN-LAST:event_jbt4MouseExited

    private void jbt5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt5MouseExited
        // TODO add your handling code here:
        comparador();
    }//GEN-LAST:event_jbt5MouseExited

    private void jbt6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt6MouseExited
        // TODO add your handling code here:
        comparador();
    }//GEN-LAST:event_jbt6MouseExited

    private void jbt7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt7MouseExited
        // TODO add your handling code here:
        comparador();
    }//GEN-LAST:event_jbt7MouseExited

    private void jbt8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt8MouseExited
        // TODO add your handling code here:
        comparador();
    }//GEN-LAST:event_jbt8MouseExited

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
            java.util.logging.Logger.getLogger(Q1Facil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Q1Facil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Q1Facil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Q1Facil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Q1Facil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbt1;
    private javax.swing.JButton jbt2;
    private javax.swing.JButton jbt3;
    private javax.swing.JButton jbt4;
    private javax.swing.JButton jbt5;
    private javax.swing.JButton jbt6;
    private javax.swing.JButton jbt7;
    private javax.swing.JButton jbt8;
    // End of variables declaration//GEN-END:variables
}
