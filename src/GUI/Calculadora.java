package GUI;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lara
 */
public class Calculadora extends javax.swing.JFrame {

    String num1, num2, resultado, operaciones, ip;
    int puerto;

    public Calculadora() {
        initComponents();
        ip = "localhost";
        puerto = 6666;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager1 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory(null).createEntityManager();
        jPanel1 = new javax.swing.JPanel();
        panel1 = new java.awt.Panel();
        Dos = new javax.swing.JButton();
        Igual = new javax.swing.JButton();
        Punto = new javax.swing.JButton();
        Cero = new javax.swing.JButton();
        Uno = new javax.swing.JButton();
        Tres = new javax.swing.JButton();
        Cinco = new javax.swing.JButton();
        Seis = new javax.swing.JButton();
        Cuatro = new javax.swing.JButton();
        Ocho = new javax.swing.JButton();
        Nueve = new javax.swing.JButton();
        Siete = new javax.swing.JButton();
        Cal_text = new javax.swing.JTextField();
        panel2 = new java.awt.Panel();
        Multiplicar = new javax.swing.JButton();
        Restar = new javax.swing.JButton();
        Dividir = new javax.swing.JButton();
        Sumar = new javax.swing.JButton();
        AC = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Cambiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Ip_text = new javax.swing.JTextField();
        Puerto_text = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Dos.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Dos.setText("2");
        Dos.setMaximumSize(new java.awt.Dimension(29, 48));
        Dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DosActionPerformed(evt);
            }
        });

        Igual.setFont(new java.awt.Font("Ubuntu", 0, 30)); // NOI18N
        Igual.setText("=");
        Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgualActionPerformed(evt);
            }
        });

        Punto.setFont(new java.awt.Font("Ubuntu", 1, 40)); // NOI18N
        Punto.setText(".");
        Punto.setMaximumSize(new java.awt.Dimension(29, 48));
        Punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntoActionPerformed(evt);
            }
        });

        Cero.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Cero.setText("0");
        Cero.setMaximumSize(new java.awt.Dimension(29, 48));
        Cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CeroActionPerformed(evt);
            }
        });

        Uno.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Uno.setText("1");
        Uno.setMaximumSize(new java.awt.Dimension(29, 48));
        Uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnoActionPerformed(evt);
            }
        });

        Tres.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Tres.setText("3");
        Tres.setMaximumSize(new java.awt.Dimension(29, 48));
        Tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TresActionPerformed(evt);
            }
        });

        Cinco.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Cinco.setText("5");
        Cinco.setMaximumSize(new java.awt.Dimension(29, 48));
        Cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CincoActionPerformed(evt);
            }
        });

        Seis.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Seis.setText("6");
        Seis.setMaximumSize(new java.awt.Dimension(29, 48));
        Seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeisActionPerformed(evt);
            }
        });

        Cuatro.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Cuatro.setText("4");
        Cuatro.setMaximumSize(new java.awt.Dimension(29, 48));
        Cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuatroActionPerformed(evt);
            }
        });

        Ocho.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Ocho.setText("8");
        Ocho.setMaximumSize(new java.awt.Dimension(29, 48));
        Ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OchoActionPerformed(evt);
            }
        });

        Nueve.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Nueve.setText("9");
        Nueve.setMaximumSize(new java.awt.Dimension(29, 48));
        Nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NueveActionPerformed(evt);
            }
        });

        Siete.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Siete.setText("7");
        Siete.setMaximumSize(new java.awt.Dimension(29, 48));
        Siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SieteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cero, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Uno, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Punto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Dos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(Tres, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(Cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(Seis, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(Siete, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(Nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Siete, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Seis, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Uno, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tres, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Igual, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Punto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cero, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Multiplicar.setFont(new java.awt.Font("Ubuntu", 0, 30)); // NOI18N
        Multiplicar.setText("x");
        Multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicarActionPerformed(evt);
            }
        });

        Restar.setFont(new java.awt.Font("Ubuntu", 0, 30)); // NOI18N
        Restar.setText("-");
        Restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarActionPerformed(evt);
            }
        });

        Dividir.setFont(new java.awt.Font("Ubuntu", 0, 30)); // NOI18N
        Dividir.setText("/");
        Dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DividirActionPerformed(evt);
            }
        });

        Sumar.setFont(new java.awt.Font("Ubuntu", 0, 30)); // NOI18N
        Sumar.setText("+");
        Sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Multiplicar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Restar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(Dividir, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(Sumar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Restar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sumar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        AC.setText("AC");
        AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cal_text, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(108, 108, 108))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AC, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cal_text, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 25, 25)));
        jPanel2.setEnabled(false);
        jPanel2.setFocusable(false);

        Cambiar.setText("Cambiar");
        Cambiar.setActionCommand("Cambiar");
        Cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarActionPerformed(evt);
            }
        });

        jLabel1.setText("IP");

        jLabel2.setText("Puerto");

        Ip_text.setToolTipText("");
        Ip_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ip_textActionPerformed(evt);
            }
        });

        jLabel3.setText("Servidor :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Puerto_text))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(Ip_text, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(Cambiar)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cambiar)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Ip_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Puerto_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ip_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ip_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ip_textActionPerformed

    private void CambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarActionPerformed
        //boton que cambia la ip y el puerto de escucha
        ip = Ip_text.getText();
        puerto = Integer.parseInt(Puerto_text.getText());

    }//GEN-LAST:event_CambiarActionPerformed

    private void DosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DosActionPerformed
        String num = Cal_text.getText() + Dos.getText();
        Cal_text.setText(num);
    }//GEN-LAST:event_DosActionPerformed

    private void IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualActionPerformed
        try {
            num2 = Cal_text.getText();

            System.out.println("Creando socket cliente");
            try (Socket clienteSocket = new Socket()) {

                System.out.println("Estableciendo la conexión");

                InetSocketAddress addr = new InetSocketAddress(ip, puerto);
                clienteSocket.connect(addr);

                InputStream is = clienteSocket.getInputStream();
                OutputStream os = clienteSocket.getOutputStream();

                System.out.println("Enviando mensaje");

                num1 = num1 + ",";
                num2 = num2 + ",";
                operaciones = operaciones + ",";

                String msj = num1 + num2 + operaciones;
                System.out.println(msj);
                os.write(msj.getBytes());

                System.out.println("Mensaje enviado");

                byte[] mensaje = new byte[25];
                is.read(mensaje);

                System.out.println("Resultado: " + new String(mensaje));

                resultado = new String(mensaje);

                Cal_text.setText(resultado.trim());

                System.out.println("Cerrando el socket cliente");

            }
            System.out.println("Terminado");
        } catch (IOException ex) {
            Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_IgualActionPerformed

    private void PuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntoActionPerformed
        String num = Cal_text.getText() + Cero.getText();
        Cal_text.setText(num);
    }//GEN-LAST:event_PuntoActionPerformed

    private void CeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CeroActionPerformed
        String num = Cal_text.getText() + Cero.getText();
        Cal_text.setText(num);
    }//GEN-LAST:event_CeroActionPerformed

    private void UnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnoActionPerformed
        String num = Cal_text.getText() + Uno.getText();
        Cal_text.setText(num);
    }//GEN-LAST:event_UnoActionPerformed

    private void TresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TresActionPerformed
        String num = Cal_text.getText() + Tres.getText();
        Cal_text.setText(num);
    }//GEN-LAST:event_TresActionPerformed

    private void CincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CincoActionPerformed
        String num = Cal_text.getText() + Cinco.getText();
        Cal_text.setText(num);
    }//GEN-LAST:event_CincoActionPerformed

    private void SeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeisActionPerformed
        String num = Cal_text.getText() + Seis.getText();
        Cal_text.setText(num);
    }//GEN-LAST:event_SeisActionPerformed

    private void CuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuatroActionPerformed
        String num = Cal_text.getText() + Cuatro.getText();
        Cal_text.setText(num);
    }//GEN-LAST:event_CuatroActionPerformed

    private void OchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OchoActionPerformed
        String num = Cal_text.getText() + Ocho.getText();
        Cal_text.setText(num);
    }//GEN-LAST:event_OchoActionPerformed

    private void NueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NueveActionPerformed
        String num = Cal_text.getText() + Nueve.getText();
        Cal_text.setText(num);
    }//GEN-LAST:event_NueveActionPerformed

    private void SieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SieteActionPerformed
        String num = Cal_text.getText() + Siete.getText();
        Cal_text.setText(num);
    }//GEN-LAST:event_SieteActionPerformed

    private void MultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicarActionPerformed
        num1 = Cal_text.getText();
        Cal_text.setText("");
        operaciones = "*";
    }//GEN-LAST:event_MultiplicarActionPerformed

    private void RestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarActionPerformed
        num1 = Cal_text.getText();
        Cal_text.setText("");
        operaciones = "-";
    }//GEN-LAST:event_RestarActionPerformed

    private void DividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DividirActionPerformed
        num1 = Cal_text.getText();
        Cal_text.setText("");
        operaciones = "/";
    }//GEN-LAST:event_DividirActionPerformed

    private void SumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumarActionPerformed
        num1 = Cal_text.getText();
        Cal_text.setText("");
        operaciones = "+";
    }//GEN-LAST:event_SumarActionPerformed

    private void ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACActionPerformed
        //boton que limpia la calculadora
        Cal_text.setText("");
    }//GEN-LAST:event_ACActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //crear un hilo que inicie la calculadora 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AC;
    private javax.swing.JTextField Cal_text;
    private javax.swing.JButton Cambiar;
    private javax.swing.JButton Cero;
    private javax.swing.JButton Cinco;
    private javax.swing.JButton Cuatro;
    private javax.swing.JButton Dividir;
    private javax.swing.JButton Dos;
    private javax.swing.JButton Igual;
    private javax.swing.JTextField Ip_text;
    private javax.swing.JButton Multiplicar;
    private javax.swing.JButton Nueve;
    private javax.swing.JButton Ocho;
    private javax.swing.JTextField Puerto_text;
    private javax.swing.JButton Punto;
    private javax.swing.JButton Restar;
    private javax.swing.JButton Seis;
    private javax.swing.JButton Siete;
    private javax.swing.JButton Sumar;
    private javax.swing.JButton Tres;
    private javax.swing.JButton Uno;
    private javax.persistence.EntityManager entityManager1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
