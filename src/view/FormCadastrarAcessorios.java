/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.dao.AcessoriosDAO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Acessorios;
import model.Marca;

/**
 *
 * @author lucas
 */
public class FormCadastrarAcessorios extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormCadastrarAcessorios
     */
    public FormCadastrarAcessorios() {
        initComponents();
        configurarFormulario();
    }
    
    public FormCadastrarAcessorios(Acessorios acess){
        this();
        txtId.setText(Integer.toString(acess.getId()));
        txtNome.setText(acess.getNome());
        txtCategoria.setText(acess.getCategoria());
        txtQuantidade.setText(Integer.toString(acess.getQuantidade()));
        txtPreco.setText(Double.toString(acess.getPreco()));
        
        
        //Selecionar a Editora
        DefaultComboBoxModel m = (DefaultComboBoxModel)cbxMarca.getModel();
        int id = 0;
        do{
            Marca e = (Marca)m.getElementAt(id);
            if (e.getId() == acess.getId_marca()){
                cbxMarca.setSelectedIndex(id);
            }
            id++;
        }while(id < m.getSize());
        
    }
    
    public FormCadastrarAcessorios(Marca e){
        this();
        txtId.setText(Integer.toString(e.getId()));
        txtNome.setText(e.getNomefantasia());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        pnMenu = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        cbxMarca = new javax.swing.JComboBox<>();

        lblId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblId.setText("Id");

        txtId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNome.setText("Nome");

        txtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblQuantidade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblQuantidade.setText("Quantidade");

        txtQuantidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblCategoria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCategoria.setText("Categoria");

        txtCategoria.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/if_add_cross_new_plus_create_392530.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/if_Edit-01_1976055.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/if_download_1348640.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/if_Close_1031533.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnNovo)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblPreco.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPreco.setText("Preço de venda");

        txtPreco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblMarca.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMarca.setText("Marca");

        cbxMarca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNome)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblId)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCategoria)
                            .addComponent(txtCategoria)))
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuantidade))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMarca)
                            .addComponent(cbxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(lblCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblPreco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        statusControles(true);
        txtId.setText("");
        txtNome.setText("");
        txtCategoria.setText("");
        txtQuantidade.setText("");
        txtPreco.setText("");
        cbxMarca.setSelectedIndex(0);
        txtCategoria.requestFocus();

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                "Utilize o menu PESQUISAR para selecionar \no registro desejado.",
                "Controle Estoque", JOptionPane.OK_OPTION);
        } else {
            statusControles(true);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        statusControles(false);

        Acessorios a = new Acessorios();
        a.setNome(txtNome.getText());
        a.setCategoria(txtCategoria.getText());
        a.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
        a.setPreco(Double.parseDouble(txtPreco.getText()));

        Marca e = (Marca)cbxMarca.getSelectedItem();
        a.setId_marca(e.getId());

        int res = -1;
        if (txtId.getText().isEmpty()) {
            res = new AcessoriosDAO().inserir(a);
        }else{
            a.setId(Integer.parseInt(txtId.getText()));
            res = new AcessoriosDAO().atualizar(a);
        }

        if (res > 0) {
            txtId.setText(Integer.toString(res));
            JOptionPane.showMessageDialog(null,
                "Operação realizada com sucesso!", "Controle Estoque",
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                "Ocorreu um erro durante a operação.", "Controle Estoque",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        statusControles(false);
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxMarca;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
    
    private void configurarFormulario() {
        this.setTitle("CADASTRAR ACESSORIO ESPORTIVO");
        this.setMaximizable(false);
        this.setIconifiable(false);
        this.setClosable(true);
        statusControles(false);
    }
    
    private void statusControles(boolean status){
        txtId.setEnabled(false);
        txtNome.setEnabled(status);
        txtCategoria.setEnabled(status);
        txtQuantidade.setEnabled(status);
        txtPreco.setEnabled(status);
        cbxMarca.setEnabled(status);
        
        
        btnNovo.setEnabled(!status);
        btnSalvar.setEnabled(status);
        btnEditar.setEnabled(!status);
        btnCancelar.setEnabled(status);
    }
}
