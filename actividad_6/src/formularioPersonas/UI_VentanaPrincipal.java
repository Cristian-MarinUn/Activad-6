package formularioPersonas;

import java.awt.Color;


public class UI_VentanaPrincipal extends javax.swing.JFrame {
    int xmouse, ymouse;
    
     
       
    public UI_VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        background = new javax.swing.JPanel();
        pnl_barra = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        lbl_exit = new javax.swing.JLabel();
        lbl_titlte = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        pnl_agregar = new javax.swing.JPanel();
        lbl_agregar = new javax.swing.JLabel();
        pnl_eliminar = new javax.swing.JPanel();
        lbl_eliminar = new javax.swing.JLabel();
        pnl_modificar = new javax.swing.JPanel();
        lbl_modificar = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        lbl_apellidos = new javax.swing.JLabel();
        lbl_cedula = new javax.swing.JLabel();
        pnl_borrar = new javax.swing.JPanel();
        lbl_borrar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        border = new javax.swing.JLabel();
        lbl_img_persona = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(222, 220, 220));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_barra.setBackground(new java.awt.Color(142, 57, 70));
        pnl_barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl_barraMouseDragged(evt);
            }
        });
        pnl_barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_barraMousePressed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(142, 57, 70));
        exit.setForeground(new java.awt.Color(142, 57, 70));

        lbl_exit.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lbl_exit.setForeground(new java.awt.Color(255, 255, 255));
        lbl_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_exit.setText("X");
        lbl_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        lbl_titlte.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        lbl_titlte.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titlte.setText("Formulario ");

        javax.swing.GroupLayout pnl_barraLayout = new javax.swing.GroupLayout(pnl_barra);
        pnl_barra.setLayout(pnl_barraLayout);
        pnl_barraLayout.setHorizontalGroup(
            pnl_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_barraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titlte, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 637, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_barraLayout.setVerticalGroup(
            pnl_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_titlte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        background.add(pnl_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_nombreMousePressed(evt);
            }
        });
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        background.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 200, 20));

        txt_apellido.setBackground(new java.awt.Color(255, 255, 255));
        txt_apellido.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_apellido.setForeground(new java.awt.Color(0, 0, 0));
        txt_apellido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_apellidoMouseClicked(evt);
            }
        });
        background.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 200, 20));

        txt_cedula.setBackground(new java.awt.Color(255, 255, 255));
        txt_cedula.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_cedula.setForeground(new java.awt.Color(0, 0, 0));
        txt_cedula.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedulaActionPerformed(evt);
            }
        });
        background.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 200, 20));

        pnl_agregar.setBackground(new java.awt.Color(142, 57, 70));

        lbl_agregar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        lbl_agregar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_agregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_agregar.setText("Agregar");
        lbl_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_agregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_agregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_agregarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_agregarLayout = new javax.swing.GroupLayout(pnl_agregar);
        pnl_agregar.setLayout(pnl_agregarLayout);
        pnl_agregarLayout.setHorizontalGroup(
            pnl_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        pnl_agregarLayout.setVerticalGroup(
            pnl_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        background.add(pnl_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 90, 30));

        pnl_eliminar.setBackground(new java.awt.Color(142, 57, 70));

        lbl_eliminar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        lbl_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_eliminar.setText("Eliminar");
        lbl_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_eliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_eliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_eliminarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_eliminarLayout = new javax.swing.GroupLayout(pnl_eliminar);
        pnl_eliminar.setLayout(pnl_eliminarLayout);
        pnl_eliminarLayout.setHorizontalGroup(
            pnl_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_eliminarLayout.createSequentialGroup()
                .addComponent(lbl_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl_eliminarLayout.setVerticalGroup(
            pnl_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_eliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(pnl_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 90, 30));

        pnl_modificar.setBackground(new java.awt.Color(142, 57, 70));

        lbl_modificar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        lbl_modificar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_modificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_modificar.setText("modificar");
        lbl_modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_modificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_modificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_modificarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_modificarLayout = new javax.swing.GroupLayout(pnl_modificar);
        pnl_modificar.setLayout(pnl_modificarLayout);
        pnl_modificarLayout.setHorizontalGroup(
            pnl_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_modificarLayout.createSequentialGroup()
                .addComponent(lbl_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl_modificarLayout.setVerticalGroup(
            pnl_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_modificarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(pnl_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 90, 30));

        lbl_nombres.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_nombres.setForeground(new java.awt.Color(0, 0, 0));
        lbl_nombres.setText("Nombres:");
        background.add(lbl_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 60, 20));

        lbl_apellidos.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_apellidos.setForeground(new java.awt.Color(0, 0, 0));
        lbl_apellidos.setText("Apellidos:");
        background.add(lbl_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 70, 20));

        lbl_cedula.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_cedula.setForeground(new java.awt.Color(0, 0, 0));
        lbl_cedula.setText("Cedula:");
        background.add(lbl_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 70, 20));

        pnl_borrar.setBackground(new java.awt.Color(142, 57, 70));

        lbl_borrar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        lbl_borrar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_borrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_borrar.setText("Borrar");
        lbl_borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_borrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_borrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_borrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_borrarLayout = new javax.swing.GroupLayout(pnl_borrar);
        pnl_borrar.setLayout(pnl_borrarLayout);
        pnl_borrarLayout.setHorizontalGroup(
            pnl_borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        pnl_borrarLayout.setVerticalGroup(
            pnl_borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        background.add(pnl_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, -1));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 550, 10));

        tabla.setBackground(new java.awt.Color(255, 255, 255));
        tabla.setForeground(new java.awt.Color(255, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Cedula"
            }
        ));
        jScrollPane4.setViewportView(tabla);

        background.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 420, 170));

        border.setText("jLabel1");
        border.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(142, 57, 70), 3));
        background.add(border, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 390));

        lbl_img_persona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_img_persona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guayacan_rosado.png"))); // NOI18N
        lbl_img_persona.setToolTipText("");
        background.add(lbl_img_persona, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 220, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaActionPerformed

    private void lbl_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_agregarMouseClicked
        
        String Nom =txt_nombre.getText();
        String Apll = txt_apellido.getText();
        String cedula = txt_cedula.getText();
        
        txt_nombre.setText("");
        txt_apellido.setText("");

        txt_cedula.setText("");
        
    }//GEN-LAST:event_lbl_agregarMouseClicked

    private void pnl_barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_barraMousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_pnl_barraMousePressed

    private void pnl_barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_barraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xmouse, y - ymouse);
    }//GEN-LAST:event_pnl_barraMouseDragged

    private void lbl_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_eliminarMouseClicked
        
        
    }//GEN-LAST:event_lbl_eliminarMouseClicked

    private void txt_apellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_apellidoMouseClicked
    }//GEN-LAST:event_txt_apellidoMouseClicked

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_nombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nombreMousePressed
    }//GEN-LAST:event_txt_nombreMousePressed

    private void lbl_borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_borrarMouseClicked
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_cedula.setText("");
    }//GEN-LAST:event_lbl_borrarMouseClicked

    private void lbl_agregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_agregarMouseEntered
       pnl_agregar.setBackground(new Color(111,45,54));     // cambio de color cuando el cursor entra del recuadro
        
    }//GEN-LAST:event_lbl_agregarMouseEntered

    private void lbl_agregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_agregarMouseExited
        pnl_agregar.setBackground(new Color(142,57,70));     // cambio de color cuando el cursor sale del recuadro
    }//GEN-LAST:event_lbl_agregarMouseExited

    private void lbl_borrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_borrarMouseEntered
        pnl_borrar.setBackground(new Color(111,45,54)); 
    }//GEN-LAST:event_lbl_borrarMouseEntered

    private void lbl_borrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_borrarMouseExited
        pnl_borrar.setBackground(new Color(142,57,70));     // cambio de color cuando el cursor sale del recuadro
    }//GEN-LAST:event_lbl_borrarMouseExited

    private void lbl_eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_eliminarMouseEntered
        pnl_eliminar.setBackground(new Color(111,45,54)); 
    }//GEN-LAST:event_lbl_eliminarMouseEntered

    private void lbl_eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_eliminarMouseExited
        pnl_eliminar.setBackground(new Color(142,57,70));     // cambio de color cuando el cursor sale del recuadro
    }//GEN-LAST:event_lbl_eliminarMouseExited

    private void lbl_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseExited
        exit.setBackground(new Color(142,57,70));     // cambio de color cuando el cursor sale del recuadro
    }//GEN-LAST:event_lbl_exitMouseExited

    private void lbl_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseEntered
        exit.setBackground(new Color(111,45,54));
        //lbl_exit.setForeground(Color.white);
    }//GEN-LAST:event_lbl_exitMouseEntered

    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_exitMouseClicked

    private void lbl_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_modificarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_modificarMouseClicked

    private void lbl_modificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_modificarMouseEntered
        pnl_modificar.setBackground(new Color(111,45,54));
    }//GEN-LAST:event_lbl_modificarMouseEntered

    private void lbl_modificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_modificarMouseExited
        pnl_modificar.setBackground(new Color(142,57,70));     // cambio de color cuando el cursor entra del recuadro
    }//GEN-LAST:event_lbl_modificarMouseExited

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
            java.util.logging.Logger.getLogger(UI_VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel border;
    private javax.swing.JPanel exit;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_agregar;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_borrar;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_eliminar;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_img_persona;
    private javax.swing.JLabel lbl_modificar;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_titlte;
    private javax.swing.JPanel pnl_agregar;
    private javax.swing.JPanel pnl_barra;
    private javax.swing.JPanel pnl_borrar;
    private javax.swing.JPanel pnl_eliminar;
    private javax.swing.JPanel pnl_modificar;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
