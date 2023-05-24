
package viwe;



import jdbc.dao.ClienteDao;
import jdbc.model.Cliente;
import jdbc.model.Endereco;
import jdbc.service.ClienteService;

public class cadastro_cliente extends javax.swing.JFrame {
    private Cliente c;
    private ClienteService cli;
    private Endereco e;
    public cadastro_cliente() {
      initComponents();
      c = new Cliente();
      cli = new ClienteService(new ClienteDao());
      e= new Endereco();
      
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cdtNascimento = new javax.swing.JTextField();
        cdtCpf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cdtNomeCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cdtTelefone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cdtNumero = new javax.swing.JTextField();
        cdtRua = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cdtCidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnCancelCadastro = new javax.swing.JButton();
        btSalvarCdt = new javax.swing.JButton();
        cdtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cdtBairro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(153, 204, 0));
        jPanel5.setForeground(new java.awt.Color(153, 204, 0));
        jPanel5.setPreferredSize(new java.awt.Dimension(145, 70));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pet Shop");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Endereço");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 130, -1));

        jLabel4.setText("Nome Completo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 101, -1));

        jLabel5.setText("CPF:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 50, -1));
        jPanel1.add(cdtNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 129, 30));
        jPanel1.add(cdtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 209, 30));

        jLabel6.setText("Data de Nascimento:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel1.add(cdtNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 290, 30));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 274, -1, -1));

        jLabel8.setText("Telefone:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        jPanel1.add(cdtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 209, 30));

        jLabel9.setText("Rua");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        jPanel1.add(cdtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 78, 30));
        jPanel1.add(cdtRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 252, 30));

        jLabel10.setText("Número");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        cdtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdtCidadeActionPerformed(evt);
            }
        });
        jPanel1.add(cdtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 110, 30));

        jLabel12.setText("Cidade");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        btnCancelCadastro.setBackground(new java.awt.Color(153, 204, 0));
        btnCancelCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelCadastro.setText("Cancel");
        btnCancelCadastro.setPreferredSize(new java.awt.Dimension(75, 30));
        btnCancelCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelCadastroMouseClicked(evt);
            }
        });
        jPanel1.add(btnCancelCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));

        btSalvarCdt.setBackground(new java.awt.Color(153, 204, 0));
        btSalvarCdt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btSalvarCdt.setForeground(new java.awt.Color(255, 255, 255));
        btSalvarCdt.setText("Salvar");
        btSalvarCdt.setPreferredSize(new java.awt.Dimension(75, 30));
        btSalvarCdt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSalvarCdtMouseClicked(evt);
            }
        });
        jPanel1.add(btSalvarCdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));
        jPanel1.add(cdtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 154, 220, 30));

        jLabel1.setText("Email:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 40, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Cadastro Cliente");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 130, -1));

        jLabel13.setText("Bairro:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 50, -1));
        jPanel1.add(cdtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cdtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdtCidadeActionPerformed

    private void btSalvarCdtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarCdtMouseClicked
        c.setNome(cdtNomeCliente.getText());
        c.setCpf(cdtCpf.getText());
        c.setTelefone(cdtTelefone.getText());
        c.setEmail(cdtEmail.getText());
        c.setNascimento(cdtNascimento.getText());
        e.setRua(cdtRua.getText());
        e.setBairro(cdtBairro.getText());
        e.setCidade(cdtCidade.getText());
        e.setRua(cdtNumero.getText());
        e.setNumero(cdtNumero.getText());
                   
        cli.cadastrar(c, e);
        
        this.setVisible(false);
        new cadastros().setVisible(true);
        
    }//GEN-LAST:event_btSalvarCdtMouseClicked

    private void btnCancelCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelCadastroMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelCadastroMouseClicked

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
            java.util.logging.Logger.getLogger(cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastro_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvarCdt;
    private javax.swing.JButton btnCancelCadastro;
    private javax.swing.JTextField cdtBairro;
    private javax.swing.JTextField cdtCidade;
    private javax.swing.JTextField cdtCpf;
    private javax.swing.JTextField cdtEmail;
    private javax.swing.JTextField cdtNascimento;
    private javax.swing.JTextField cdtNomeCliente;
    private javax.swing.JTextField cdtNumero;
    private javax.swing.JTextField cdtRua;
    private javax.swing.JTextField cdtTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
