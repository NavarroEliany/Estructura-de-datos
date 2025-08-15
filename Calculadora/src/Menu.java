
package calculadora;


import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

   Calculadora objcal = new Calculadora();
   private void validarYHabilitarBotones() {
    boolean habilitar = esNumero(n1.getText()) && esNumero(n2.getText());
    sumar.setEnabled(habilitar);
    restar.setEnabled(habilitar);
    multiplicar.setEnabled(habilitar);
    Dividir.setEnabled(habilitar);
}

    
    public Menu() {
        initComponents();
        n1.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
    public void insertUpdate(javax.swing.event.DocumentEvent e) {
        validarYHabilitarBotones();
    }
    public void removeUpdate(javax.swing.event.DocumentEvent e) {
        validarYHabilitarBotones();
    }
    public void changedUpdate(javax.swing.event.DocumentEvent e) {
        validarYHabilitarBotones();
    }
});

n2.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
    public void insertUpdate(javax.swing.event.DocumentEvent e) {
        validarYHabilitarBotones();
    }
    public void removeUpdate(javax.swing.event.DocumentEvent e) {
        validarYHabilitarBotones();
    }
    public void changedUpdate(javax.swing.event.DocumentEvent e) {
        validarYHabilitarBotones();
    }
});
sumar.setEnabled(false);
restar.setEnabled(false);
multiplicar.setEnabled(false);
Dividir.setEnabled(false);

    }

    
    private boolean esNumero(String texto) {
        try {
            Float.parseFloat(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        n1 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        sumar = new javax.swing.JButton();
        multiplicar = new javax.swing.JButton();
        Dividir = new javax.swing.JButton();
        restar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MI CALCULADORA");

        jLabel2.setText("Número 1");

        jLabel3.setText("Número 2");

        sumar.setText("Sumar");
        sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumarActionPerformed(evt);
            }
        });

        multiplicar.setText("Multiplicar");
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarActionPerformed(evt);
            }
        });

        Dividir.setText("Dividir");
        Dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DividirActionPerformed(evt);
            }
        });

        restar.setText("Restar");
        restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(n2, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(n1))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sumar)
                            .addComponent(multiplicar)
                            .addComponent(Dividir)
                            .addComponent(restar))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sumar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(restar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(multiplicar)
                .addGap(18, 18, 18)
                .addComponent(Dividir)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarActionPerformed

        if (esNumero(n1.getText()) && esNumero(n2.getText())) {
            float numero1 = Float.parseFloat(n1.getText());
            float numero2 = Float.parseFloat(n2.getText());
            objcal.sumar(numero1, numero2);
            n1.setText("");
            n2.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números válidos.");
        }
        
        
    }//GEN-LAST:event_sumarActionPerformed

    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed
        
          if (esNumero(n1.getText()) && esNumero(n2.getText())) {
            float numero1 = Float.parseFloat(n1.getText());
            float numero2 = Float.parseFloat(n2.getText());
            objcal.multiplicar(numero1, numero2);
            n1.setText("");
            n2.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números válidos.");
        }
         
    }//GEN-LAST:event_multiplicarActionPerformed

    private void DividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DividirActionPerformed
        
        if (esNumero(n1.getText()) && esNumero(n2.getText())) {
            float numero1 = Float.parseFloat(n1.getText());
            float numero2 = Float.parseFloat(n2.getText());

            if (numero2 == 0) {
                JOptionPane.showMessageDialog(null, "No se puede dividir entre cero.");
                n1.setText("");
                n2.setText("");

            } else {
                objcal.dividir(numero1, numero2);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números válidos.");
        }
        
    }//GEN-LAST:event_DividirActionPerformed

    private void restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarActionPerformed
        
        if (esNumero(n1.getText()) && esNumero(n2.getText())) {
            float numero1 = Float.parseFloat(n1.getText());
            float numero2 = Float.parseFloat(n2.getText());
            objcal.restar(numero1, numero2);
            n1.setText("");
            n2.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números válidos.");
        }
        
    }//GEN-LAST:event_restarActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dividir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton multiplicar;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    private javax.swing.JButton restar;
    private javax.swing.JButton sumar;
    // End of variables declaration//GEN-END:variables
}
