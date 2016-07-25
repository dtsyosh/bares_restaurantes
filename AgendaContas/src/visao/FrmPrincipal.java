/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ContaController;
import javax.swing.table.DefaultTableModel;
import modelo.Conta;

/**
 *
 * @author yosh
 */
public class FrmPrincipal extends javax.swing.JFrame {

    ContaController contaController;
    DefaultTableModel tabela;

    public FrmPrincipal() {
        initComponents();
        tabela = (DefaultTableModel) tabelaConta.getModel();
        contaController = new ContaController();
        preencherTabela();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBotoes = new javax.swing.JPanel();
        btnCadastrarConta = new javax.swing.JButton();
        btnPagarConta = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        lblDiego = new javax.swing.JLabel();
        lblValorAtualDiego = new javax.swing.JLabel();
        lblGeovana = new javax.swing.JLabel();
        lblValorAtualGeovana = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblValorTotal = new javax.swing.JLabel();
        lblValorAtual = new javax.swing.JLabel();
        lblValorDesejado = new javax.swing.JLabel();
        lblValorDesejadoGeovana = new javax.swing.JLabel();
        lblValorDesejadoDiego = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaConta = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBotoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCadastrarConta.setText("Cadastrar Conta");
        btnCadastrarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarContaActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnCadastrarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 53, 187, -1));

        btnPagarConta.setText("Pagar Conta");
        btnPagarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarContaActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnPagarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 20, 187, -1));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 86, 187, -1));

        lblDiego.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDiego.setText("Diego:");
        pnlBotoes.add(lblDiego, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 21, -1, -1));

        lblValorAtualDiego.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lblValorAtualDiego.setText("valor");
        pnlBotoes.add(lblValorAtualDiego, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 21, -1, -1));

        lblGeovana.setText("Geovana:");
        pnlBotoes.add(lblGeovana, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, -1, -1));

        lblValorAtualGeovana.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lblValorAtualGeovana.setText("valor");
        pnlBotoes.add(lblValorAtualGeovana, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 54, -1, -1));

        lblTotal.setText("Total:");
        pnlBotoes.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 87, -1, -1));

        lblValorTotal.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lblValorTotal.setText("valor");
        pnlBotoes.add(lblValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 87, -1, -1));

        lblValorAtual.setText("Valor atual");
        pnlBotoes.add(lblValorAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        lblValorDesejado.setText("Valor desejado");
        pnlBotoes.add(lblValorDesejado, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 0, -1, -1));

        lblValorDesejadoGeovana.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lblValorDesejadoGeovana.setText("valor");
        pnlBotoes.add(lblValorDesejadoGeovana, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 54, -1, -1));

        lblValorDesejadoDiego.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lblValorDesejadoDiego.setText("valor");
        pnlBotoes.add(lblValorDesejadoDiego, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 21, -1, -1));

        getContentPane().add(pnlBotoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 620, -1));

        tabelaConta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição", "Valor", "Pago"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaConta.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaConta);
        if (tabelaConta.getColumnModel().getColumnCount() > 0) {
            tabelaConta.getColumnModel().getColumn(0).setResizable(false);
            tabelaConta.getColumnModel().getColumn(1).setResizable(false);
            tabelaConta.getColumnModel().getColumn(1).setPreferredWidth(10);
            tabelaConta.getColumnModel().getColumn(2).setResizable(false);
            tabelaConta.getColumnModel().getColumn(2).setPreferredWidth(5);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 135, 628, 188));

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 335, 160, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarContaActionPerformed
        DialogCadastrarConta dialog = new DialogCadastrarConta(this, true);
        dialog.setContaController(contaController);
        dialog.setVisible(true);
        atualizarTabela();
    }//GEN-LAST:event_btnCadastrarContaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnPagarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarContaActionPerformed

    }//GEN-LAST:event_btnPagarContaActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        Double total, diegoTotal, geovanaTotal;
        total = diegoTotal = geovanaTotal = 0.0;

        for (Conta x : contaController.getListaConta()) {
            total += x.getValor();
            switch (x.getPago()) {
                case 1:
                    diegoTotal += x.getValor();
                    break;
                case 2:
                    geovanaTotal += x.getValor();
                    break;
                case 3:
                    diegoTotal += x.getValor() / 2;
                    geovanaTotal += x.getValor() / 2;
                    break;
            }

        }

        lblValorTotal.setText(String.valueOf(total));
        lblValorAtualDiego.setText(String.valueOf(diegoTotal));
        lblValorAtualGeovana.setText(String.valueOf(geovanaTotal));
        Double valorDesejadoDiego, valorDesejadoGeovana;

        valorDesejadoDiego = diegoTotal - (total / 2);
        valorDesejadoGeovana = geovanaTotal - (total / 2);

        lblValorDesejadoDiego.setText(String.valueOf(valorDesejadoDiego));
        lblValorDesejadoGeovana.setText(String.valueOf(valorDesejadoGeovana));

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void preencherTabela() {
        contaController.getListaConta().forEach((x) -> {
            String pago = "";
            switch (x.getPago()) {
                case 0:
                    pago = "Pendente";
                    break;
                case 1:
                    pago = "Diego";
                    break;
                case 2:
                    pago = "Geovana";
                    break;
                case 3:
                    pago = "Diego & Geovana";
            }
            tabela.addRow(new Object[]{x.getDescricao(), x.getValor(),
                pago});
        });
    }
    
    private void atualizarTabela() {
        String pago = "";
        System.out.println(contaController.getListaConta().size()-1);
        Conta x = contaController.getListaConta().get(contaController.getListaConta().size()-1);
            switch (x.getPago()) {
                case 0:
                    pago = "Pendente";
                    break;
                case 1:
                    pago = "Diego";
                    break;
                case 2:
                    pago = "Geovana";
                    break;
                case 3:
                    pago = "Diego & Geovana";
            }
            tabela.addRow(new Object[]{x.getDescricao(), x.getValor(), pago});
    }
    protected ContaController getContaController() {
        return this.contaController;
    }

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarConta;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnPagarConta;
    private javax.swing.JButton btnSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDiego;
    private javax.swing.JLabel lblGeovana;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblValorAtual;
    private javax.swing.JLabel lblValorAtualDiego;
    private javax.swing.JLabel lblValorAtualGeovana;
    private javax.swing.JLabel lblValorDesejado;
    private javax.swing.JLabel lblValorDesejadoDiego;
    private javax.swing.JLabel lblValorDesejadoGeovana;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JTable tabelaConta;
    // End of variables declaration//GEN-END:variables
}
