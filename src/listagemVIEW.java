
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.util.List; // Importando a classe List

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Adm, @DevOtavioAlves
 */
public class listagemVIEW extends javax.swing.JFrame {

         private Connection con;
         private DefaultTableModel tableModel;
         private ProdutosDAO produtosDAO;
    
         public listagemVIEW() {
                  produtosDAO = new ProdutosDAO();
                  initComponents();
                  listarProdutos();
                  initializeTableModel();
        }
    
         private void initializeTableModel() {
                  tableModel = new DefaultTableModel();
                  tableModel.addColumn("ID");
                  tableModel.addColumn("Nome");
                  tableModel.addColumn("Valor");
                  tableModel.addColumn("Vendido");

                  listaProdutos.setModel(tableModel);
                  carregarProdutos();
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaProdutos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        id_produto_venda = new javax.swing.JTextPane();
        btnVender = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnVendas = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Valor", "Vendido"
            }
        ));
        jScrollPane1.setViewportView(listaProdutos);

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel1.setText("Lista de Produtos");

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        jLabel2.setText("Vender Produto (ID)");

        jScrollPane2.setViewportView(id_produto_venda);

        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        btnVendas.setText("Consultar Vendas");
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVender))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnVoltar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(193, 193, 193))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVender))
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVendas)
                    .addComponent(btnVoltar))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

         private void carregarProdutos() {
                  List<ProdutosDTO> produtos = produtosDAO.listarProdutos();
                  DefaultTableModel model = (DefaultTableModel) listaProdutos.getModel();
                  model.setRowCount(0); // Limpar tabela antes de carregar
                  for (ProdutosDTO produto : produtos) {
                           model.addRow(new Object[]{produto.getId(), produto.getNome(), produto.getValor(), produto.getVendido()});
                  }
         }
    
    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
         int selectedRow = listaProdutos.getSelectedRow();
         if (selectedRow >= 0) {
                  int produtoId = Integer.parseInt(listaProdutos.getValueAt(selectedRow, 0).toString());
                  ProdutosDAO produtosDAO = new ProdutosDAO();
                  produtosDAO.venderProduto(produtoId);
                  carregarProdutos();
         } else {
                  JOptionPane.showMessageDialog(null, "Selecione um produto para vender.");
         }
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
         vendasVIEW vendas = new vendasVIEW(); 
         vendas.setVisible(true);
    }//GEN-LAST:event_btnVendasActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
         this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    
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
                java.util.logging.Logger.getLogger(listagemVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(listagemVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(listagemVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(listagemVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
                  java.awt.EventQueue.invokeLater(new Runnable() {
                           public void run() {
                           new listagemVIEW().setVisible(true);
                           }
                  });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVendas;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextPane id_produto_venda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable listaProdutos;
    // End of variables declaration//GEN-END:variables

         private void listarProdutos(){ // Agradeço a cada dia desse script estar pronto.
                  try {
                           // Conexão com o banco de dados
                           conectaDAO conecta = new conectaDAO();
                           Connection con = conecta.connectDB();

                           // Cria um objeto Statement para executar a consulta
                           Statement stmt = con.createStatement();

                           // Executa a consulta para listar os produtos
                           ResultSet rs = stmt.executeQuery("SELECT * FROM produtos");

                           // Verifica se o tableModel está inicializado
                           if (tableModel == null) {
                                    System.err.println("TableModel não inicializado corretamente.");
                                    return;
                           }

                           // Limpa o modelo antes de carregar novos dados
                           tableModel.setRowCount(0);

                           // Itera sobre os resultados da consulta e adiciona às linhas da tabela
                           while (rs.next()) {
                                    tableModel.addRow(new Object[]{
                                             rs.getInt("id"),
                                             rs.getString("nome"),
                                             rs.getDouble("valor"),
                                             rs.getBoolean("vendido")
                                    });
                           }

                            // Fecha a conexão com o banco de dados
                            con.close();
                           } catch (SQLException e) {
                                    // Trata a exceção caso ocorra um erro de conexão ou consulta
                                    System.out.println("Erro ao listar produtos: " + e.getMessage());
                                    e.printStackTrace(); // Imprime o stack trace para diagnóstico
                           }
         }
}
