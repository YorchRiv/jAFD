/* 
 *  Copyright (C) 2011  Gerardo Martín Roldán
 *  GNU General Pulbic License
 */
package gui;

import gui.ayuda.AcercaDeDialog;
import automatafinitodeterminista.*;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {
    static AutomataFinito afd;

    /** Creates new form VentanaPrincipal */
    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        estadosFinalesLabel = new javax.swing.JLabel();
        estadosLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        alfabetoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textSimulacion = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        textPalabra = new javax.swing.JTextField();
        botonEvaluar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        opcionNuevo = new javax.swing.JMenuItem();
        opcionSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        opcionAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("jAFD - Simulador de Autómata Finito Determinista");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Información del AFD"));

        estadosFinalesLabel.setText("[ - ]");

        estadosLabel.setText("[ - ]");

        jLabel4.setText("F =");

        jLabel2.setText("Q =");

        alfabetoLabel.setText("[no se ingresó ningún alfabeto]");

        jLabel1.setText("Σ =");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(alfabetoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(estadosFinalesLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(estadosLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(alfabetoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadosLabel)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(estadosFinalesLabel))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Evaluación de Cadenas"));

        textSimulacion.setColumns(20);
        textSimulacion.setEditable(false);
        textSimulacion.setRows(5);
        jScrollPane1.setViewportView(textSimulacion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadena a Evaluar"));

        botonEvaluar.setText("Evaluar");
        botonEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEvaluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(textPalabra)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(botonEvaluar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(textPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonEvaluar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jMenu1.setText("Archivo");

        opcionNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        opcionNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aptdaemon-add.png"))); // NOI18N
        opcionNuevo.setText("Nuevo AFD");
        opcionNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(opcionNuevo);

        opcionSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view-minimize.png"))); // NOI18N
        opcionSalir.setText("Salir");
        opcionSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionSalirActionPerformed(evt);
            }
        });
        jMenu1.add(opcionSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("AFD");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/alacarte.png"))); // NOI18N
        jMenuItem2.setText("Ver Tabla de Transiciones");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");

        opcionAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/help_about.png"))); // NOI18N
        opcionAcercaDe.setText("Acerca de");
        opcionAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionAcercaDeActionPerformed(evt);
            }
        });
        jMenu3.add(opcionAcercaDe);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcionSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionSalirActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(this, "¿Desea salir de la aplicación?", "", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_opcionSalirActionPerformed

    private void opcionNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionNuevoActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(this, "Se va a generar un nuevo AFD. ¿Desea continuar?", "", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            try{            
            afd=new AutomataFinito();
            do{
                Alfabeto a=new NuevoAlfabeto(this, true).getAlfabeto();
                afd.setAlfabeto(a);
            }while(NuevoAlfabeto.resultado==false);
            alfabetoLabel.setText(afd.getAlfabeto().getSimbolos().toString());
            do{
                NuevosEstados n=new NuevosEstados(this, true);
                afd.ingresarEstados(n.getCantidadEstados());                     
            }while(NuevosEstados.resultado==false);
            estadosLabel.setText(afd.getEstados().toString());
            do{
                String[] eF=new EstadosFinalesDialog(this, true).getEstadosFinales();
                afd.ingresarEstadosFinales(eF);
            }while(EstadosFinalesDialog.resultado==false);
            estadosFinalesLabel.setText(afd.getEstadosFinales().toString());                       
            JOptionPane.showMessageDialog(this, "Se iniciará la carga de la tabla de transiciones", "", JOptionPane.INFORMATION_MESSAGE);            
            afd.crearNuevaTablaDeTransiciones();
            for(int i=0;i<afd.getEstados().size();i++){
                for(int j=0;j<afd.getAlfabeto().getSimbolos().size();j++){                    
                    JOptionPane.showMessageDialog(this, "q"+i+" con la letra "+afd.getAlfabeto().getSimbolos().get(j), "Nueva Transición", JOptionPane.INFORMATION_MESSAGE);
                    Integer nT=new NuevaTransicionDialog(this, true).getTransicion();                    
                    if((afd.getEstados().size()-1)<nT){
                        JOptionPane.showMessageDialog(this, "Estado inexistente", "ERROR", JOptionPane.ERROR_MESSAGE);
                        j--;
                    }                
                    else                        
                         afd.ingresarTransiciones(i,afd.getAlfabeto().getSimbolos().get(j),nT); 
                }
            }
            }catch(Exception e)        {
                JOptionPane.showMessageDialog(this, "No se pudo crear correctamente el AFD", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }        
    }//GEN-LAST:event_opcionNuevoActionPerformed

    private void botonEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEvaluarActionPerformed
        // TODO add your handling code here:
        VentanaPrincipal.textSimulacion.setText(null);
        try{            
            afd.simular(textPalabra.getText().toString());        
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "No se pudo evaluar ninguna cadena", "Error", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_botonEvaluarActionPerformed

    private void opcionAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionAcercaDeActionPerformed
        // TODO add your handling code here:
        AcercaDeDialog dialog=new AcercaDeDialog(this, true);
    }//GEN-LAST:event_opcionAcercaDeActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:        
        try{
            TransicionesDialog dialog=new TransicionesDialog(this, true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "No se detectó ningún AFD", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alfabetoLabel;
    private javax.swing.JButton botonEvaluar;
    private javax.swing.JLabel estadosFinalesLabel;
    private javax.swing.JLabel estadosLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem opcionAcercaDe;
    private javax.swing.JMenuItem opcionNuevo;
    private javax.swing.JMenuItem opcionSalir;
    private javax.swing.JTextField textPalabra;
    public static javax.swing.JTextArea textSimulacion;
    // End of variables declaration//GEN-END:variables

}
