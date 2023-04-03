package GUI;

import packeteGomez.GomezClass;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import packeteGomez.PibloClass;

public class Q3Medio extends javax.swing.JFrame {

    private PibloClass llama = new PibloClass();
    private boolean caraVolteada = false;
    private ImageIcon imagenUno;
    private ImageIcon imagenDos;
    private JButton[] guardador = new JButton[2];//guarda las imagenes de los botones
    private boolean segundaCara = false;
    int puntaje = 0;
    int puntajeTotal = 0;
    int puntajeTruco = 0;
    int contador = 0;
    int contadorMaximo = 0;
    boolean marco = true;
    boolean polo = false;
    int[] Arreglo = llama.Varianza();

    public Q3Medio() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Memorama Quimnica Avanzada 2");
        Ordenar();
    }


    private void Ordenar() {//ordena cartas de forma aleatoria al iniciar el programa

        jbt1.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesQ3/carta" + Arreglo[0] + ".png")));
        jbt2.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesQ3/carta" + Arreglo[1] + ".png")));
        jbt3.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesQ3/carta" + Arreglo[2] + ".png")));
        jbt4.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesQ3/carta" + Arreglo[3] + ".png")));
        jbt5.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesQ3/carta" + Arreglo[4] + ".png")));
        jbt6.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesQ3/carta" + Arreglo[5] + ".png")));
        jbt7.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesQ3/carta" + Arreglo[6] + ".png")));
        jbt8.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesQ3/carta" + Arreglo[7] + ".png")));
        jbt9.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesQ3/carta" + Arreglo[8] + ".png")));
        jbt10.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesQ3/carta" + Arreglo[9] + ".png")));
        jbt11.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesQ3/carta" + Arreglo[10] + ".png")));
        jbt12.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesQ3/carta" + Arreglo[11] + ".png")));
        jbt13.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesQ3/carta" + Arreglo[12] + ".png")));
        jbt14.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesQ3/carta" + Arreglo[13] + ".png")));
        jbt15.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesQ3/carta" + Arreglo[14] + ".png")));
        jbt16.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenesQ3/carta" + Arreglo[15] + ".png")));
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

            if (!jbt1.isEnabled() && !jbt2.isEnabled() && !jbt3.isEnabled() && !jbt4.isEnabled() && !jbt5.isEnabled() && !jbt6.isEnabled() && !jbt7.isEnabled() && !jbt8.isEnabled()&& !jbt9.isEnabled()&& !jbt10.isEnabled()&& !jbt11.isEnabled()&& !jbt12.isEnabled()&& !jbt13.isEnabled()&& !jbt14.isEnabled()&& !jbt15.isEnabled()&& !jbt16.isEnabled()) {
                puntaje = puntaje + 20;
                jlb1.setText(String.valueOf(puntaje));
                JOptionPane.showMessageDialog(this, "Tu puntaje es de: " + puntaje, "Ganaste papu!!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        jlb1.setText(String.valueOf(puntaje));

        contadorMaximo++;
    }

    private void comparador() {
        if (caraVolteada && segundaCara) {
            if (imagenUno.getDescription().compareTo(imagenDos.getDescription()) != 0) {
                guardador[0].setEnabled(true);
                guardador[1].setEnabled(true);

                puntaje = puntaje - 5;

                marco = false;
            }
            while (contador < 1) {//Hace una comparacion falsa, para que el puntaje no se trabe
                if (imagenUno.getDescription().compareTo(imagenDos.getDescription()) == 0) {
                    puntajeTruco++;

                }

                contador++;
            }
            if (contador == 1) {
                if (imagenUno.getDescription().compareTo(imagenDos.getDescription()) == 0) {
                    puntaje = puntaje + 20;
                    caraVolteada = false;

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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jbt1 = new javax.swing.JButton();
        jbt2 = new javax.swing.JButton();
        jbt3 = new javax.swing.JButton();
        jbt4 = new javax.swing.JButton();
        jbt5 = new javax.swing.JButton();
        jbt6 = new javax.swing.JButton();
        jbt7 = new javax.swing.JButton();
        jbt8 = new javax.swing.JButton();
        jlb1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jbt9 = new javax.swing.JButton();
        jbt10 = new javax.swing.JButton();
        jbt11 = new javax.swing.JButton();
        jbt12 = new javax.swing.JButton();
        jbt13 = new javax.swing.JButton();
        jbt14 = new javax.swing.JButton();
        jbt15 = new javax.swing.JButton();
        jbt16 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 249, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(121, 6, 63));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/LogoFinal.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dubai Medium", 0, 120)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Química III");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel2)
                .addGap(328, 328, 328)
                .addComponent(jLabel1)
                .addContainerGap(659, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 250));

        jbt1.setBackground(new java.awt.Color(153, 255, 0));
        jbt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/carta0.png"))); // NOI18N
        jbt1.setBorder(null);
        jbt1.setBorderPainted(false);
        jbt1.setContentAreaFilled(false);
        jbt1.setFocusPainted(false);
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
        jPanel1.add(jbt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 200, 200));

        jbt2.setBackground(new java.awt.Color(153, 255, 0));
        jbt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/carta0.png"))); // NOI18N
        jbt2.setBorder(null);
        jbt2.setBorderPainted(false);
        jbt2.setContentAreaFilled(false);
        jbt2.setFocusPainted(false);
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
        jPanel1.add(jbt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 200, 200));

        jbt3.setBackground(new java.awt.Color(153, 255, 0));
        jbt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/carta0.png"))); // NOI18N
        jbt3.setBorder(null);
        jbt3.setBorderPainted(false);
        jbt3.setContentAreaFilled(false);
        jbt3.setFocusPainted(false);
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
        jPanel1.add(jbt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 200, 200));

        jbt4.setBackground(new java.awt.Color(153, 255, 0));
        jbt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/carta0.png"))); // NOI18N
        jbt4.setBorder(null);
        jbt4.setBorderPainted(false);
        jbt4.setContentAreaFilled(false);
        jbt4.setFocusPainted(false);
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
        jPanel1.add(jbt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 310, 200, 200));

        jbt5.setBackground(new java.awt.Color(153, 255, 0));
        jbt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/carta0.png"))); // NOI18N
        jbt5.setBorder(null);
        jbt5.setBorderPainted(false);
        jbt5.setContentAreaFilled(false);
        jbt5.setFocusPainted(false);
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
        jPanel1.add(jbt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 310, 200, 200));

        jbt6.setBackground(new java.awt.Color(153, 255, 0));
        jbt6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/carta0.png"))); // NOI18N
        jbt6.setBorder(null);
        jbt6.setBorderPainted(false);
        jbt6.setContentAreaFilled(false);
        jbt6.setFocusPainted(false);
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
        jPanel1.add(jbt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 310, 200, 200));

        jbt7.setBackground(new java.awt.Color(153, 255, 0));
        jbt7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/carta0.png"))); // NOI18N
        jbt7.setBorder(null);
        jbt7.setBorderPainted(false);
        jbt7.setContentAreaFilled(false);
        jbt7.setFocusPainted(false);
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
        jPanel1.add(jbt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 310, 200, 200));

        jbt8.setBackground(new java.awt.Color(153, 255, 0));
        jbt8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/carta0.png"))); // NOI18N
        jbt8.setBorder(null);
        jbt8.setBorderPainted(false);
        jbt8.setContentAreaFilled(false);
        jbt8.setFocusPainted(false);
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
        jPanel1.add(jbt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 310, 200, 200));

        jlb1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jlb1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jlb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 780, 300, 170));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CSS/regresaDifi.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusPainted(false);
        jButton6.setHideActionText(true);
        jButton6.setRequestFocusEnabled(false);
        jButton6.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/CSS/diciculDiff.png"))); // NOI18N
        jButton6.setSelected(true);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 810, -1, -1));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CSS/regresa.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setFocusPainted(false);
        jButton7.setHideActionText(true);
        jButton7.setRequestFocusEnabled(false);
        jButton7.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/CSS/menuPriSel.png"))); // NOI18N
        jButton7.setSelected(true);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 820, -1, -1));

        jbt9.setBackground(new java.awt.Color(153, 255, 0));
        jbt9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/carta0.png"))); // NOI18N
        jbt9.setBorder(null);
        jbt9.setBorderPainted(false);
        jbt9.setContentAreaFilled(false);
        jbt9.setFocusPainted(false);
        jbt9.setFocusable(false);
        jbt9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/cr.png"))); // NOI18N
        jbt9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbt9MouseExited(evt);
            }
        });
        jbt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt9ActionPerformed(evt);
            }
        });
        jPanel1.add(jbt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 200, 200));

        jbt10.setBackground(new java.awt.Color(153, 255, 0));
        jbt10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/carta0.png"))); // NOI18N
        jbt10.setBorder(null);
        jbt10.setBorderPainted(false);
        jbt10.setContentAreaFilled(false);
        jbt10.setFocusPainted(false);
        jbt10.setFocusable(false);
        jbt10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/cr.png"))); // NOI18N
        jbt10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbt10MouseExited(evt);
            }
        });
        jbt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt10ActionPerformed(evt);
            }
        });
        jPanel1.add(jbt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 200, 200));

        jbt11.setBackground(new java.awt.Color(153, 255, 0));
        jbt11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/carta0.png"))); // NOI18N
        jbt11.setBorder(null);
        jbt11.setBorderPainted(false);
        jbt11.setContentAreaFilled(false);
        jbt11.setFocusPainted(false);
        jbt11.setFocusable(false);
        jbt11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/cr.png"))); // NOI18N
        jbt11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbt11MouseExited(evt);
            }
        });
        jbt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt11ActionPerformed(evt);
            }
        });
        jPanel1.add(jbt11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 200, 200));

        jbt12.setBackground(new java.awt.Color(153, 255, 0));
        jbt12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/carta0.png"))); // NOI18N
        jbt12.setBorder(null);
        jbt12.setBorderPainted(false);
        jbt12.setContentAreaFilled(false);
        jbt12.setFocusPainted(false);
        jbt12.setFocusable(false);
        jbt12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/cr.png"))); // NOI18N
        jbt12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbt12MouseExited(evt);
            }
        });
        jbt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt12ActionPerformed(evt);
            }
        });
        jPanel1.add(jbt12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 520, 200, 200));

        jbt13.setBackground(new java.awt.Color(153, 255, 0));
        jbt13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/carta0.png"))); // NOI18N
        jbt13.setBorder(null);
        jbt13.setBorderPainted(false);
        jbt13.setContentAreaFilled(false);
        jbt13.setFocusPainted(false);
        jbt13.setFocusable(false);
        jbt13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/cr.png"))); // NOI18N
        jbt13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbt13MouseExited(evt);
            }
        });
        jbt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt13ActionPerformed(evt);
            }
        });
        jPanel1.add(jbt13, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 520, 200, 200));

        jbt14.setBackground(new java.awt.Color(153, 255, 0));
        jbt14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/carta0.png"))); // NOI18N
        jbt14.setBorder(null);
        jbt14.setBorderPainted(false);
        jbt14.setContentAreaFilled(false);
        jbt14.setFocusPainted(false);
        jbt14.setFocusable(false);
        jbt14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/cr.png"))); // NOI18N
        jbt14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbt14MouseExited(evt);
            }
        });
        jbt14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt14ActionPerformed(evt);
            }
        });
        jPanel1.add(jbt14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 520, 200, 200));

        jbt15.setBackground(new java.awt.Color(153, 255, 0));
        jbt15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/carta0.png"))); // NOI18N
        jbt15.setBorder(null);
        jbt15.setBorderPainted(false);
        jbt15.setContentAreaFilled(false);
        jbt15.setFocusPainted(false);
        jbt15.setFocusable(false);
        jbt15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/cr.png"))); // NOI18N
        jbt15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbt15MouseExited(evt);
            }
        });
        jbt15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt15ActionPerformed(evt);
            }
        });
        jPanel1.add(jbt15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 520, 200, 200));

        jbt16.setBackground(new java.awt.Color(153, 255, 0));
        jbt16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/carta0.png"))); // NOI18N
        jbt16.setBorder(null);
        jbt16.setBorderPainted(false);
        jbt16.setContentAreaFilled(false);
        jbt16.setFocusPainted(false);
        jbt16.setFocusable(false);
        jbt16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesQ1/cr.png"))); // NOI18N
        jbt16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbt16MouseExited(evt);
            }
        });
        jbt16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt16ActionPerformed(evt);
            }
        });
        jPanel1.add(jbt16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 520, 200, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
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
        volteador(jbt3);
    }//GEN-LAST:event_jbt3ActionPerformed

    private void jbt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt4ActionPerformed
        volteador(jbt4);
    }//GEN-LAST:event_jbt4ActionPerformed

    private void jbt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt5ActionPerformed
        volteador(jbt5);
    }//GEN-LAST:event_jbt5ActionPerformed

    private void jbt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt6ActionPerformed
        volteador(jbt6);
    }//GEN-LAST:event_jbt6ActionPerformed

    private void jbt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt7ActionPerformed
        volteador(jbt7);
    }//GEN-LAST:event_jbt7ActionPerformed

    private void jbt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt8ActionPerformed
        volteador(jbt8);
    }//GEN-LAST:event_jbt8ActionPerformed

    private void jbt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt1MouseExited
        comparador();
    }//GEN-LAST:event_jbt1MouseExited

    private void jbt2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt2MouseExited
        comparador();
    }//GEN-LAST:event_jbt2MouseExited

    private void jbt3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt3MouseExited
        comparador();
    }//GEN-LAST:event_jbt3MouseExited

    private void jbt4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt4MouseExited
        comparador();
    }//GEN-LAST:event_jbt4MouseExited

    private void jbt5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt5MouseExited
        comparador();
    }//GEN-LAST:event_jbt5MouseExited

    private void jbt6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt6MouseExited
        comparador();
    }//GEN-LAST:event_jbt6MouseExited

    private void jbt7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt7MouseExited
        comparador();
    }//GEN-LAST:event_jbt7MouseExited

    private void jbt8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt8MouseExited
        comparador();
    }//GEN-LAST:event_jbt8MouseExited

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        MenuDificultad ventana = new MenuDificultad();
        MenuPrincipal llamadoDeEmergencia = new MenuPrincipal();
        ventana.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        MenuPrincipal ventana = new MenuPrincipal();
        ventana.setVisible(true);
        this.setVisible(false);
        ventana.contador=0;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jbt9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt9MouseExited
       comparador();
    }//GEN-LAST:event_jbt9MouseExited

    private void jbt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt9ActionPerformed
        
        volteador(jbt9);
    }//GEN-LAST:event_jbt9ActionPerformed

    private void jbt10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt10MouseExited
        comparador();
    }//GEN-LAST:event_jbt10MouseExited

    private void jbt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt10ActionPerformed
       volteador(jbt10);
    }//GEN-LAST:event_jbt10ActionPerformed

    private void jbt11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt11MouseExited
      comparador();
    }//GEN-LAST:event_jbt11MouseExited

    private void jbt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt11ActionPerformed
        volteador(jbt11);
    }//GEN-LAST:event_jbt11ActionPerformed

    private void jbt12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt12MouseExited
       comparador();
    }//GEN-LAST:event_jbt12MouseExited

    private void jbt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt12ActionPerformed
       volteador(jbt12);
    }//GEN-LAST:event_jbt12ActionPerformed

    private void jbt13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt13MouseExited
        comparador();
    }//GEN-LAST:event_jbt13MouseExited

    private void jbt13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt13ActionPerformed
        volteador(jbt13);
    }//GEN-LAST:event_jbt13ActionPerformed

    private void jbt14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt14MouseExited
        comparador();
    }//GEN-LAST:event_jbt14MouseExited

    private void jbt14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt14ActionPerformed
        volteador(jbt14);
    }//GEN-LAST:event_jbt14ActionPerformed

    private void jbt15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt15MouseExited
        comparador();
    }//GEN-LAST:event_jbt15MouseExited

    private void jbt15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt15ActionPerformed
        volteador(jbt15);
    }//GEN-LAST:event_jbt15ActionPerformed

    private void jbt16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt16MouseExited
        comparador();
    }//GEN-LAST:event_jbt16MouseExited

    private void jbt16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt16ActionPerformed
        volteador(jbt16);
    }//GEN-LAST:event_jbt16ActionPerformed
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Q3Medio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbt1;
    private javax.swing.JButton jbt10;
    private javax.swing.JButton jbt11;
    private javax.swing.JButton jbt12;
    private javax.swing.JButton jbt13;
    private javax.swing.JButton jbt14;
    private javax.swing.JButton jbt15;
    private javax.swing.JButton jbt16;
    private javax.swing.JButton jbt2;
    private javax.swing.JButton jbt3;
    private javax.swing.JButton jbt4;
    private javax.swing.JButton jbt5;
    private javax.swing.JButton jbt6;
    private javax.swing.JButton jbt7;
    private javax.swing.JButton jbt8;
    private javax.swing.JButton jbt9;
    private javax.swing.JLabel jlb1;
    // End of variables declaration//GEN-END:variables
}
