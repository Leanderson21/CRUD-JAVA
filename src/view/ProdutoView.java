
package view;

import table.ProdutoTableModel;
import dao.ProdutoDAO;
import model.Produto;

public class ProdutoView extends javax.swing.JFrame {
    
    Produto produto = new Produto();
    ProdutoDAO produtoDAO = new ProdutoDAO();

    public ProdutoView() {
        
        initComponents();
        setLocationRelativeTo(null); // deixar a janela de view centralizada
        tbProduto.setModel(new ProdutoTableModel(new ProdutoDAO().listarTodos()));
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfCodigo = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tfDescricao = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        tfPreco = new javax.swing.JTextArea();
        btnLimpar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduto = new javax.swing.JTable();
        tfdBuscaDescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produto");
        setBackground(new java.awt.Color(153, 153, 153));
        setResizable(false);

        jLabel1.setText("Código:");

        jLabel2.setText("Descrição:");

        jLabel3.setText("Preço:");

        tfCodigo.setEditable(false);
        tfCodigo.setBackground(new java.awt.Color(204, 204, 204));
        tfCodigo.setColumns(20);
        tfCodigo.setRows(5);
        jScrollPane2.setViewportView(tfCodigo);

        tfDescricao.setBackground(new java.awt.Color(255, 255, 255));
        tfDescricao.setColumns(20);
        tfDescricao.setRows(5);
        jScrollPane3.setViewportView(tfDescricao);

        tfPreco.setBackground(new java.awt.Color(255, 255, 255));
        tfPreco.setColumns(20);
        tfPreco.setRows(5);
        jScrollPane4.setViewportView(tfPreco);

        btnLimpar.setText("Limpar");
        btnLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimparMouseClicked(evt);
            }
        });
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnAlterar.setText("Excluir");
        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarMouseClicked(evt);
            }
        });
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        tbProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProduto);

        tfdBuscaDescricao.setBackground(new java.awt.Color(255, 255, 255));
        tfdBuscaDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdBuscaDescricaoKeyPressed(evt);
            }
        });

        jLabel4.setText(" Pesquisar (Descrição)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLimpar)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addGap(56, 56, 56))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(jLabel3))
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                                .addComponent(jScrollPane3)
                                .addComponent(jScrollPane4)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfdBuscaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnAlterar)
                    .addComponent(btnSalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdBuscaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(tfCodigo.getText().equals("")){
            produto.setDescricao(tfDescricao.getText());
            produto.setPreco(Double.parseDouble(tfPreco.getText()));
            produtoDAO.inserir(produto);
        }else{
            produto.setDescricao(tfDescricao.getText());
            produto.setPreco(Double.parseDouble(tfPreco.getText()));
            produto.setCod_produto(Integer.parseInt(tfCodigo.getText()));
            produtoDAO.alterar(produto);
        }
        tbProduto.setModel(new ProdutoTableModel(new ProdutoDAO().listarTodos()));
        tfCodigo.setText("");
        tfDescricao.setText("");
        tfPreco.setText("");
        tfdBuscaDescricao.setText("");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tbProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdutoMouseClicked
        tfCodigo.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), ProdutoTableModel.COL_COD_PRODUTO).toString()); 
        tfDescricao.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), ProdutoTableModel.COL_DESCRICAO).toString());
        tfPreco.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), ProdutoTableModel.COL_PRECO).toString());
    }//GEN-LAST:event_tbProdutoMouseClicked

    private void btnLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseClicked
       tbProduto.setModel(new ProdutoTableModel(new ProdutoDAO().listarTodos()));
        tfCodigo.setText("");
        tfDescricao.setText("");
        tfPreco.setText("");
        tfdBuscaDescricao.setText("");
    }//GEN-LAST:event_btnLimparMouseClicked

    private void btnAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseClicked
      
    }//GEN-LAST:event_btnAlterarMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int codigo = Integer.parseInt(tfCodigo.getText());
        produtoDAO.deletar(codigo);
        tbProduto.setModel(new ProdutoTableModel(new ProdutoDAO().listarTodos()));
        tfCodigo.setText("");
        tfDescricao.setText("");
        tfPreco.setText("");
        tfdBuscaDescricao.setText("");
     

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void tfdBuscaDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdBuscaDescricaoKeyPressed
        String pesquisa = tfdBuscaDescricao.getText();
        tbProduto.setModel(new ProdutoTableModel(new ProdutoDAO().listarTodosDescricao(pesquisa)));
    }//GEN-LAST:event_tfdBuscaDescricaoKeyPressed
        
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tbProduto;
    private javax.swing.JTextArea tfCodigo;
    private javax.swing.JTextArea tfDescricao;
    private javax.swing.JTextArea tfPreco;
    private javax.swing.JTextField tfdBuscaDescricao;
    // End of variables declaration//GEN-END:variables
}
