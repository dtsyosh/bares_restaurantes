package view;

import controller.ControllerGeral;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.caixas;
import model.funcionarios;
import model.mesas;
import model.pagamentos;
import model.pedidos;
import model.produtos;
import model.produtos_pedidos;

/**
 *
 * @author yosh
 */
public class FrmPrincipal extends javax.swing.JFrame {

    DefaultTableModel tabelaPedidos, tabelaProdutos;
    funcionarios funcionario;
    caixas caixa;
    List<pedidos> listaBancoPedidos;
    List<mesas> listaBancoMesas;
    List<produtos_pedidos> listaBancoProdutosPedidos;
    List<produtos> listaBancoProdutos;
    List<pagamentos> listaPagamentos;
    int ativo;
    double valorFinalCaixa;

    public FrmPrincipal() {
        initComponents();
        ativo = 3;
        valorFinalCaixa = 0.0;
        lblSaldoCaixa.setText(String.valueOf(valorFinalCaixa));
        listaBancoPedidos = new ArrayList();
        listaBancoPedidos = new ControllerGeral(pedidos.class).select();

        listaBancoMesas = new ArrayList();
        listaBancoMesas = new ControllerGeral(mesas.class).select();

        listaBancoProdutosPedidos = new ArrayList();
        listaBancoProdutosPedidos = new ControllerGeral(produtos_pedidos.class).select();

        listaBancoProdutos = new ArrayList();
        listaBancoProdutos = new ControllerGeral(produtos.class).select();

        listaPagamentos = new ArrayList();

        tabelaPedidos = (DefaultTableModel) jTablePedidos.getModel();
        tabelaProdutos = (DefaultTableModel) jTableProdutos.getModel();

        caixa = new caixas();
        caixa.setData_hora_abertura(new Timestamp(System.currentTimeMillis()));

        atualizarTabelaPedidos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNomeFuncionario = new javax.swing.JLabel();
        lblSaldoCaixa = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAnotarPedido = new javax.swing.JButton();
        btnRealizarPagamento = new javax.swing.JButton();
        btnFecharCaixa = new javax.swing.JButton();
        painelPedidos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePedidos = new javax.swing.JTable();
        panelProdutos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        tfTotal = new javax.swing.JTextField();

        jButton5.setText("jButton1");

        jButton6.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Caixa"));

        jLabel1.setText("Nome Funcionário:");

        jLabel2.setText("Saldo caixa:");

        lblNomeFuncionario.setText("nomeFuncionário");

        lblSaldoCaixa.setText("saldoCaixa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeFuncionario)
                    .addComponent(lblSaldoCaixa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblNomeFuncionario))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblSaldoCaixa))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));

        btnAnotarPedido.setText("Anotar Pedido");
        btnAnotarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnotarPedidoActionPerformed(evt);
            }
        });

        btnRealizarPagamento.setText("Realizar Pagamento");
        btnRealizarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPagamentoActionPerformed(evt);
            }
        });

        btnFecharCaixa.setText("Fechar Caixa");
        btnFecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCaixaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRealizarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAnotarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFecharCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnotarPedido)
                    .addComponent(btnFecharCaixa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRealizarPagamento)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        painelPedidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedidos"));

        jTablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mesa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePedidos);
        if (jTablePedidos.getColumnModel().getColumnCount() > 0) {
            jTablePedidos.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout painelPedidosLayout = new javax.swing.GroupLayout(painelPedidos);
        painelPedidos.setLayout(painelPedidosLayout);
        painelPedidosLayout.setHorizontalGroup(
            painelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        painelPedidosLayout.setVerticalGroup(
            painelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panelProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos"));

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableProdutos);
        if (jTableProdutos.getColumnModel().getColumnCount() > 0) {
            jTableProdutos.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout panelProdutosLayout = new javax.swing.GroupLayout(panelProdutos);
        panelProdutos.setLayout(panelProdutosLayout);
        panelProdutosLayout.setHorizontalGroup(
            panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProdutosLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelProdutosLayout.setVerticalGroup(
            panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel3.setText("Total: ");

        tfTotal.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnotarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnotarPedidoActionPerformed
        DialogAnotarPedido anotarPedido = new DialogAnotarPedido(this, true);
        anotarPedido.setFuncionario(funcionario);
        anotarPedido.setVisible(true);
        listaBancoPedidos = new ControllerGeral(pedidos.class).select();
        listaBancoProdutosPedidos = new ControllerGeral(produtos_pedidos.class).select();
        atualizarTabelaPedidos();
    }//GEN-LAST:event_btnAnotarPedidoActionPerformed

    private void jTablePedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePedidosMouseClicked
        JTable jtable = (JTable) evt.getSource();

        if (evt.getClickCount() == 1) {
            atualizarTabelaProdutos();
        }
    }//GEN-LAST:event_jTablePedidosMouseClicked

    private void btnRealizarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPagamentoActionPerformed
        if (jTablePedidos.getSelectedRow() == -1) { //Nenhum pedido selecionado
            JOptionPane.showMessageDialog(rootPane, "Selecione um pedido para efetuar o pagamento.");
        } else {
            int formaPgtn = JOptionPane.showOptionDialog(null, //Component parentComponent
                    "Qual será a forma de pagamento?", //Object message,
                    "Pagamento", //String title
                    JOptionPane.YES_NO_OPTION, //int optionType
                    JOptionPane.INFORMATION_MESSAGE, //int messageType
                    null, //Icon icon,
                    new Object[]{"Cartão Crédito", "Cartão Débito", "Dinheiro", "Cheque"},
                    "Cartão Crédito");//Object initialValue

            List<pedidos> lpa = new ArrayList();

            lpa = this.getPedidosAtivos(listaBancoPedidos);
            listaPagamentos.add(new pagamentos(0,
                    lpa.get(jTablePedidos.getSelectedRow()).getId_pedido(),
                    formaPgtn + 1, new Timestamp(System.currentTimeMillis()),
                    Double.valueOf(tfTotal.getText()))); //Adiciona pagamento na lista, para depois
            //persistir no banco

            //Muda o status do pedido
            new ControllerGeral(pedidos.class).atualizarEstado(lpa.get(jTablePedidos.getSelectedRow()).getId_pedido(), 4);
            listaBancoPedidos = new ControllerGeral(pedidos.class).select();
            lblSaldoCaixa.setText(String.valueOf(valorFinalCaixa));
            atualizarTabelaPedidos();
        }
    }//GEN-LAST:event_btnRealizarPagamentoActionPerformed

    private void btnFecharCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCaixaActionPerformed
        if (jTablePedidos.getRowCount() > 0) {
            JOptionPane.showMessageDialog(rootPane, "Ainda há pedidos em aberto!");
        } else {
            caixa.setFuncionario_id(funcionario.getId_funcionario());
            caixa.setData_hora_fechamento(new Timestamp(System.currentTimeMillis()));
            caixa.setValor_final(valorFinalCaixa);
            caixa.setValor_inicial(0.0);
            caixa.setEstado_id(4);
            
            new ControllerGeral(caixas.class).insert(caixa);
            List<caixas> a = new ArrayList();
            a = new ControllerGeral(caixas.class).select();
            
            for(pagamentos p : listaPagamentos) {
                p.setCaixa_id(a.get(a.size() - 1).getId_caixa());
            }
            new ControllerGeral(pagamentos.class).insertList(listaPagamentos);
            
            this.dispose();
        }
    }//GEN-LAST:event_btnFecharCaixaActionPerformed

    public void pegarFuncionario(funcionarios f) {
        funcionario = f;
        lblNomeFuncionario.setText(f.getNome_funcionario());
    }

    private void atualizarTabelaPedidos() {
        tabelaPedidos.setRowCount(0);

        for (pedidos p : listaBancoPedidos) {
            if (p.getEstado_id() == ativo) {
                tabelaPedidos.addRow(new Object[]{listaBancoMesas.get(p.getMesa_id() - 1).getNum()});
            }
        }
        atualizarTabelaProdutos();
    }

    private void atualizarTabelaProdutos() {
        List<pedidos> lpa = new ArrayList();
        double totalPreco = 0.0;
        String nomeProduto;
        Double precoProduto;
        tabelaProdutos.setRowCount(0);

        lpa = this.getPedidosAtivos(listaBancoPedidos);

        if (jTablePedidos.getSelectedRow() != -1) {
            for (produtos_pedidos pp : listaBancoProdutosPedidos) {
                if (pp.getPedido_id() == lpa.get(jTablePedidos.getSelectedRow()).getId_pedido()) {
                    nomeProduto = listaBancoProdutos.get(pp.getProduto_id() - 1).getNome_produto();
                    precoProduto = listaBancoProdutos.get(pp.getProduto_id() - 1).getPreco();
                    tabelaProdutos.addRow(new Object[]{nomeProduto, precoProduto, pp.getQtde()});
                    totalPreco += precoProduto * pp.getQtde();
                    valorFinalCaixa += totalPreco;
                    
                }
            }
        }

        tfTotal.setText(String.valueOf(totalPreco));
    }

    private List<pedidos> getPedidosAtivos(List<pedidos> lista) {
        List<pedidos> listaPedidosAtivos = new ArrayList();

        for (pedidos p : lista) {
            if (p.getEstado_id() == 3) {
                listaPedidosAtivos.add(p);
            }
        }
        return listaPedidosAtivos;
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
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnotarPedido;
    private javax.swing.JButton btnFecharCaixa;
    private javax.swing.JButton btnRealizarPagamento;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePedidos;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JLabel lblNomeFuncionario;
    private javax.swing.JLabel lblSaldoCaixa;
    private javax.swing.JPanel painelPedidos;
    private javax.swing.JPanel panelProdutos;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables
}
