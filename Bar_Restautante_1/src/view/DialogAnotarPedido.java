package view;

import controller.ControllerGeral;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import model.funcionarios;
import model.mesas;
import model.pedidos;
import model.produtos;
import model.produtos_pedidos;

/**
 *
 * @author yosh
 */
public class DialogAnotarPedido extends javax.swing.JDialog {

    /**
     * Creates new form DialogAnotarPedido
     */
    DefaultListModel DefaultJListProdutos, DefaultJListPedido;
    List<Integer> listQuantidade;
    List<produtos> listaProdutos, listaProdutosPedido;
    List<mesas> listaMesas;
    List<pedidos> listaPedidos;
    funcionarios funcionario;

    public DialogAnotarPedido(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jListProdutos.setModel(new DefaultListModel());
        jListPedido.setModel(new DefaultListModel());

        listaProdutos = new ArrayList();
        listaProdutosPedido = new ArrayList();
        listaMesas = new ArrayList();
        listaPedidos = new ArrayList();
        listQuantidade = new ArrayList();

        DefaultJListProdutos = (DefaultListModel) jListProdutos.getModel();
        DefaultJListPedido = (DefaultListModel) jListPedido.getModel();

        listaProdutos = new ControllerGeral(produtos.class).select();
        atualizarJListProdutos(listaProdutos);

        listaMesas = new ControllerGeral(mesas.class).select();
        popularCbMesa(listaMesas);

        listaPedidos = new ControllerGeral(pedidos.class).select();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbMesa = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProdutos = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListPedido = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Mesa");

        cbMesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jListProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListProdutos);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Produtos");

        jListPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListPedidoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jListPedido);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pedido");

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbMesa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnOK)
                        .addGap(21, 21, 21)
                        .addComponent(btnCancelar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOK)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jListProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListProdutosMouseClicked
        JList list = (JList) evt.getSource();

        if (evt.getClickCount() == 2) { //Pega o duplo click do mouse
            int indice = list.locationToIndex(evt.getPoint());
            try {
                int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade")); //Quantidade do produto
                listQuantidade.add(quantidade); //Lista que guarda as respectivas quantidades para usar depois

                listaProdutosPedido.add(listaProdutos.get(jListProdutos.getSelectedIndex()));
                atualizarJListPedido(listaProdutosPedido);
            } catch (NullPointerException | NumberFormatException e) {
            }
        }
    }//GEN-LAST:event_jListProdutosMouseClicked

    private void jListPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListPedidoMouseClicked
        JList list = (JList) evt.getSource();

        if (evt.getClickCount() == 2) { //Pega o duplo click do mouse
            int indice = list.locationToIndex(evt.getPoint());

            listaProdutosPedido.remove(jListPedido.getSelectedIndex());
            listQuantidade.remove(jListPedido.getSelectedIndex());

            atualizarJListPedido(listaProdutosPedido);
        }
    }//GEN-LAST:event_jListPedidoMouseClicked

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        int indiceMesa = cbMesa.getSelectedIndex();
        int indicePedido = -1;
        int ativo = 3;

        Timestamp tsData = new Timestamp(System.currentTimeMillis());

        for (pedidos p : listaPedidos) {
            if (p.getMesa_id() == listaMesas.get(indiceMesa).getId_mesa() && p.getEstado_id() == ativo) {     //Se já existir um pedido na mesa
                //Adiciona somente em produtos_pedidos
                indicePedido = p.getId_pedido();
                break;

            }
        }

        ArrayList listaProdutosPedidos = new ArrayList();

        if (indicePedido != -1) { //Caso já tenha um pedido em aberto na mesa
            for (int i = 0; i < DefaultJListPedido.getSize(); i++) {
                listaProdutosPedidos.add(new produtos_pedidos(listaProdutosPedido.get(i).getId_produto(), indicePedido, tsData, listQuantidade.get(i)));
            }

            new ControllerGeral(produtos_pedidos.class).insertList(listaProdutosPedidos);

            this.dispose();
        } else {    //Se não tiver nenhum pedido em aberto na mesa
            int idPedido = 1;
            try{
                idPedido = listaPedidos.get(listaPedidos.size() - 1).getId_pedido() + 1;
            } catch(IndexOutOfBoundsException e) {}
            new ControllerGeral(pedidos.class).insert(new pedidos(funcionario.getId_funcionario(), listaMesas.get(indiceMesa).getId_mesa(), ativo));
            for (int i = 0; i < DefaultJListPedido.getSize(); i++) {
                listaProdutosPedidos.add(new produtos_pedidos(listaProdutosPedido.get(i).getId_produto(), idPedido, tsData, listQuantidade.get(i)));
            }
            
            new ControllerGeral(produtos_pedidos.class).insertList(listaProdutosPedidos);
            this.dispose();
        }
        //Procurar se a mesa já não tem um pedido em aberto
        //Se tiver, adicionar produtos à esse pedido
        //Se não tiver, criar um pedido novo
    }//GEN-LAST:event_btnOKActionPerformed

    private void atualizarJListProdutos(List<produtos> lista) {
        DefaultJListProdutos.clear();
        for (produtos o : lista) {
            DefaultJListProdutos.addElement(o.getNome_produto());
        }
    }

    private void atualizarJListPedido(List<produtos> lista) {
        DefaultJListPedido.clear();
        int i = 0;
        for (produtos o : lista) {
            DefaultJListPedido.addElement(listQuantidade.get(i++) + " - " + o.getNome_produto());
        }
    }

    private void popularCbMesa(List<mesas> mesas) {
        cbMesa.removeAllItems();
        for (mesas o : mesas) {
            cbMesa.addItem(o.getNum());
        }
    }

    public funcionarios getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(funcionarios funcionario) {
        this.funcionario = funcionario;
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
            java.util.logging.Logger.getLogger(DialogAnotarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogAnotarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogAnotarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogAnotarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogAnotarPedido dialog = new DialogAnotarPedido(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOK;
    private javax.swing.JComboBox<String> cbMesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jListPedido;
    private javax.swing.JList<String> jListProdutos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
