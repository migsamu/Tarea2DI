/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iesfm.tarea2;

/**
 *
 * @author MiguelSánchezMuñoz
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
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

        jButtonComparacion = new javax.swing.JButton();
        jButtonSuma = new javax.swing.JButton();
        jButtonTodo = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jPanelContenedor = new javax.swing.JPanel();
        jLabelComparacion = new javax.swing.JLabel();
        jLabelSuma = new javax.swing.JLabel();
        jLabelNumero1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNumero1 = new javax.swing.JTextField();
        jTextFieldNumero2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comparador de Numeros");

        jButtonComparacion.setText("Mayor/Menor/Igual");
        jButtonComparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComparacionActionPerformed(evt);
            }
        });

        jButtonSuma.setText("Suma");
        jButtonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumaActionPerformed(evt);
            }
        });

        jButtonTodo.setText("Todo");
        jButtonTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTodoActionPerformed(evt);
            }
        });

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelContenedorLayout = new javax.swing.GroupLayout(jPanelContenedor);
        jPanelContenedor.setLayout(jPanelContenedorLayout);
        jPanelContenedorLayout.setHorizontalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelComparacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelContenedorLayout.setVerticalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelComparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSuma, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelNumero1.setText("Número 1:");

        jLabel1.setText("Número 2:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelContenedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButtonComparacion)
                                .addGap(86, 86, 86)
                                .addComponent(jButtonSuma)
                                .addGap(93, 93, 93)
                                .addComponent(jButtonTodo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                                .addComponent(jButtonLimpiar)))
                        .addGap(84, 84, 84))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNumero1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNumero1)
                            .addComponent(jTextFieldNumero2, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jPanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonComparacion)
                    .addComponent(jButtonSuma)
                    .addComponent(jButtonTodo)
                    .addComponent(jButtonLimpiar))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void suma() {
        String num1 = jTextFieldNumero1.getText().replace(",", ".");
        String num2 = jTextFieldNumero2.getText().replace(",", ".");

        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);

        double resultado = n1 + n2;

        jLabelSuma.setText("La suma de los dos números es: " + resultado);
    }

    private void jButtonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumaActionPerformed
        // TODO add your handling code here:
        try {
            jPanelContenedor.setVisible(true);
            jLabelSuma.setVisible(true);
            jLabelComparacion.setVisible(false);

            suma();

        } catch (Exception e) {
            jLabelSuma.setText("Ha introducido algun caracter o está vacío, introduzca numeros por favor");
        }
    }//GEN-LAST:event_jButtonSumaActionPerformed

    public void comparacion() {
        String num1 = jTextFieldNumero1.getText().replace(",", ".");
        String num2 = jTextFieldNumero2.getText().replace(",", ".");

        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);

        if (n1 > n2) {
            jLabelComparacion.setText("El numero " + n1 + " es mayor que el numero " + n2);
        } else if (n2 > n1) {
            jLabelComparacion.setText("El numero " + n2 + " es mayor que el numero " + n1);
        } else {
            jLabelComparacion.setText("Los numero son iguales");
        }
    }

    private void jButtonComparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComparacionActionPerformed
        // TODO add your handling code here:
        try {
            jPanelContenedor.setVisible(true);
            jLabelComparacion.setVisible(true);
            jLabelSuma.setVisible(false);

            comparacion();

        } catch (Exception e) {
            jLabelComparacion.setText("Ha introducido algun caracter o está vacío, introduzca numeros por favor");
        }
    }//GEN-LAST:event_jButtonComparacionActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        // TODO add your handling code here:

        jTextFieldNumero1.setText("");
        jTextFieldNumero2.setText("");
        jLabelComparacion.setText("");
        jLabelSuma.setText("");
        jPanelContenedor.setVisible(false);
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTodoActionPerformed
        // TODO add your handling code here:

        try {
            jPanelContenedor.setVisible(true);
            jLabelComparacion.setVisible(true);
            jLabelSuma.setVisible(true);
            suma();
            comparacion();
        } catch (Exception e) {
            jLabelComparacion.setText("Ha introducido algun caracter o está vacío, introduzca numeros por favor");
        }

    }//GEN-LAST:event_jButtonTodoActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonComparacion;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonSuma;
    private javax.swing.JButton jButtonTodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelComparacion;
    private javax.swing.JLabel jLabelNumero1;
    private javax.swing.JLabel jLabelSuma;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JTextField jTextFieldNumero1;
    private javax.swing.JTextField jTextFieldNumero2;
    // End of variables declaration//GEN-END:variables
}
