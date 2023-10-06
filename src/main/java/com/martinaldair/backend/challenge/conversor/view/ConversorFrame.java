package com.martinaldair.backend.challenge.conversor.view;

import com.martinaldair.backend.challenge.conversor.util.ConversorUtil;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Martin Aldair
 */
public class ConversorFrame extends javax.swing.JFrame {

    public ConversorFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conversor Divisas", "Conversor Temperatura" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione una opcion de conversion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jButton1)))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Double number = 0.0;
    static String nuevaDivisaConvertida;
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        JComboBox inputTipoConvercion = jComboBox1;
        Integer indexConvertidorElegido = inputTipoConvercion.getSelectedIndex();
        // Tipo de conversion elegido por el usuario
        switch (indexConvertidorElegido){
            case 0:
            String moneda = JOptionPane.showInputDialog(this, "Ingrese la cantidad de dinero que deseas convertir:");
            Boolean isValidoInput = ConversorUtil.validarInput(moneda);
            // Valida el tipo de dato numerico de entrada
            if(!isValidoInput){
                  JOptionPane.showMessageDialog(this, "Valor de entrada no valido", "Error", JOptionPane.ERROR_MESSAGE);
            }else {
            String [] inputValoresMenu = { "De pesos MX a Dolar", "De pesos MX a Euros", "De pesos MX a Libras Esterlinas", 
                "De pesos MX a Yen Japonés", "De pesos MX a Won sul-coreano", "De Dolar a pesos MX", "De Euros a pesos MX", 
                "De Libras Esterlinas a pesos MX", "De Yen Japonés a pesos MX", "De Won sul-coreano a pesos MX" };

            String  monedaSeleccionada = (String) JOptionPane.showInputDialog(null,
             "Elige la moneda a la que deseas convertir tu dinero", "Monedas",
             JOptionPane.INFORMATION_MESSAGE, null,
             inputValoresMenu, null);
            
            number = Double.parseDouble(moneda);
            
            switch (monedaSeleccionada) {
                case "De pesos MX a Dolar":
                    nuevaDivisaConvertida = ConversorUtil.conversorDivisas("mx", "usa", number);
                    break;
                case "De pesos MX a Euros":
                    nuevaDivisaConvertida = ConversorUtil.conversorDivisas("mx", "eur", number);
                    break;
                case "De pesos MX a Libras Esterlinas":
                    nuevaDivisaConvertida = ConversorUtil.conversorDivisas("mx", "gbp", number);
                    break;
                case "De pesos MX a Yen Japonés":
                    nuevaDivisaConvertida = ConversorUtil.conversorDivisas("mx", "yen", number);
                    break;
                case "De pesos MX a Won sul-coreano":
                    nuevaDivisaConvertida = ConversorUtil.conversorDivisas("mx", "won", number);
                    break;
                case "De Dolar a pesos MX":
                    nuevaDivisaConvertida = ConversorUtil.conversorDivisas("usa", "mx", number);
                    break;
                case "De Euros a pesos MX":
                    nuevaDivisaConvertida = ConversorUtil.conversorDivisas("eur", "mx", number);
                    break;
                case "De Libras Esterlinas a pesos MX":
                    nuevaDivisaConvertida = ConversorUtil.conversorDivisas("gbp", "mx", number);
                    break;
                case "De Yen Japonés a pesos MX":
                    nuevaDivisaConvertida = ConversorUtil.conversorDivisas("yen", "mx", number);
                    break;
                case "De Won sul-coreano a pesos MX":
                    nuevaDivisaConvertida = ConversorUtil.conversorDivisas("won", "usa", number);
                    break;
                }
            }
            Object[] optionsMsgValorConversion = { "Aceptar" };
            Object[] optionsMsgContinuarPrograma = { "Si", "No", "Cancelar" };
            int respValorConversion = JOptionPane.showOptionDialog(null, "Tienes "+ nuevaDivisaConvertida, "Mensaje",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, optionsMsgValorConversion, optionsMsgValorConversion[0]);
            if(respValorConversion ==0) {
            	int respContinuarPrograma = JOptionPane.showOptionDialog(null, "Deseas continuar", "Selecciona una opcion",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
                        null, optionsMsgContinuarPrograma, optionsMsgContinuarPrograma[0]);
            	if(respContinuarPrograma!= 0) {
            		JOptionPane.showMessageDialog(this, "Programa Finalizado", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            		System.exit(0);
            	}else {
            		number = 0.0;
            		nuevaDivisaConvertida = "";
            	}
            }
            break;
            case 1:
            break;
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
