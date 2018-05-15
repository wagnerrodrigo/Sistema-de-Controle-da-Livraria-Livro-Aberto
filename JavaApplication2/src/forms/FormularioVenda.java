/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Item;
import model.Livro;
import model.Venda;

/**
 *
 * @author wagner
 */
public class FormularioVenda extends javax.swing.JFrame {

    /**
     * Creates new form FormularioVenda
     */
    
    private Cliente cliente = null; // como deixar o cliente como varialvel global.
    private Livro livro = null;
    private Venda venda = null;
    
    float soma = 0;
    DefaultTableModel modelo = null;
    
    public FormularioVenda() {
        initComponents();        
       venda = new Venda();
       modelo = (DefaultTableModel)jTable1.getModel();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlb_PrintVenda = new javax.swing.JLabel();
        jlb_PrintDataVenda = new javax.swing.JLabel();
        jftf_Cpf = new javax.swing.JFormattedTextField();
        jlb_Cpf = new javax.swing.JLabel();
        jbt_BuscarCli = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jlb_PrintNomeCliente = new javax.swing.JLabel();
        jlb_EnderecoCompleto = new javax.swing.JLabel();
        jlb_PrintEndereco = new javax.swing.JLabel();
        jlb_Telefone = new javax.swing.JLabel();
        jlb_PrintTelefone = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlb_PrintEmail = new javax.swing.JLabel();
        jbt_Confirmar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jtf_CodigoLivro = new javax.swing.JTextField();
        jbt_BuscarCodigoLivro = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jlb_PrintTitulo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jlb_PrintEditora = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jlb_PrintValor = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtf_Quantidade = new javax.swing.JTextField();
        jbt_IncluirQuanti = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbt_RemoverItem = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jlb_PrintValorTotal = new javax.swing.JLabel();
        jbt_FecharVenda = new javax.swing.JButton();
        jbt_Cancelar = new javax.swing.JButton();
        jbt_Sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setText("Venda N°:");

        jLabel2.setText("Data da venda:");

        jlb_PrintVenda.setText("-");

        jlb_PrintDataVenda.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlb_PrintVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlb_PrintDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jlb_PrintVenda)
                    .addComponent(jlb_PrintDataVenda))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        try {
            jftf_Cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftf_Cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftf_CpfActionPerformed(evt);
            }
        });

        jlb_Cpf.setText("CPF:");

        jbt_BuscarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icBuscarCliente.png"))); // NOI18N
        jbt_BuscarCli.setText("Buscar");
        jbt_BuscarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_BuscarCliActionPerformed(evt);
            }
        });

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel6.setText("Nome do Cliente:");

        jlb_PrintNomeCliente.setText("-");

        jlb_EnderecoCompleto.setText("Endereço Completo:");

        jlb_PrintEndereco.setText("-");

        jlb_Telefone.setText("Telefone:");

        jlb_PrintTelefone.setText("-");

        jLabel3.setText("E-mail de Contato:");

        jlb_PrintEmail.setText("-");

        jbt_Confirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icConfirmarCliente.png"))); // NOI18N
        jbt_Confirmar.setText("Confirmar");
        jbt_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_ConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jlb_PrintNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlb_EnderecoCompleto)
                    .addComponent(jlb_PrintEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlb_Telefone)
                    .addComponent(jlb_PrintTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jlb_PrintEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbt_Confirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jlb_EnderecoCompleto)
                            .addComponent(jlb_Telefone)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlb_PrintNomeCliente)
                            .addComponent(jlb_PrintEndereco)
                            .addComponent(jlb_PrintTelefone)
                            .addComponent(jlb_PrintEmail)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jbt_Confirmar)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel5.setText("Dados do Cliente");

        jLabel4.setText("Livros a escolher");

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel7.setText("Codígo Livro:");

        jtf_CodigoLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_CodigoLivroActionPerformed(evt);
            }
        });

        jbt_BuscarCodigoLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icBuscarItem.png"))); // NOI18N
        jbt_BuscarCodigoLivro.setText("Buscar item");
        jbt_BuscarCodigoLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_BuscarCodigoLivroActionPerformed(evt);
            }
        });

        jLabel8.setText("Título:");

        jlb_PrintTitulo.setText("-");

        jLabel9.setText("Editora:");

        jlb_PrintEditora.setText("-");

        jLabel10.setText("Valor");

        jlb_PrintValor.setText("-");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jtf_CodigoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(jbt_BuscarCodigoLivro)
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jlb_PrintTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlb_PrintEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb_PrintValor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlb_PrintTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbt_BuscarCodigoLivro)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtf_CodigoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlb_PrintValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlb_PrintEditora)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel11.setText("Quantidade:");

        jtf_Quantidade.setText("-");

        jbt_IncluirQuanti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icIncluirItem.png"))); // NOI18N
        jbt_IncluirQuanti.setText("Incluir");
        jbt_IncluirQuanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_IncluirQuantiActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Título", "Quantidade", "Valor Unitário", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jbt_RemoverItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icRemoverItem.png"))); // NOI18N
        jbt_RemoverItem.setText("Remover Item");
        jbt_RemoverItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_RemoverItemActionPerformed(evt);
            }
        });

        jLabel12.setText("Valor Total : ");

        jlb_PrintValorTotal.setText("-");

        jbt_FecharVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icFecharVenda.png"))); // NOI18N
        jbt_FecharVenda.setText("FECHAR VENDA");

        jbt_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cancelar.png"))); // NOI18N
        jbt_Cancelar.setText("Cancelar");

        jbt_Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icSair.png"))); // NOI18N
        jbt_Sair.setText("Sair");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlb_Cpf)
                                    .addComponent(jftf_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addComponent(jbt_BuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtf_Quantidade, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addComponent(jbt_IncluirQuanti, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jlb_PrintValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbt_RemoverItem, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jbt_FecharVenda)
                .addGap(268, 268, 268)
                .addComponent(jbt_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261)
                .addComponent(jbt_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlb_Cpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jftf_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbt_BuscarCli))
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbt_IncluirQuanti))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt_RemoverItem, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jlb_PrintValorTotal))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbt_FecharVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbt_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbt_Sair)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jftf_CpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftf_CpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftf_CpfActionPerformed

    private void jbt_BuscarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_BuscarCliActionPerformed
        // TODO add your handling code here:
        String cpf = jftf_Cpf.getText(); // sera necessario???? 
        cliente = formPrincipal.bdcliente.buscarCliente(cpf);
        
        if(cliente !=null)
        {
            // colocar os dados em seu lugares!!
            cliente.setNome(jlb_PrintNomeCliente.getText());
            cliente.getEnderco().setLogradouro(jlb_PrintEndereco.getText() +"" + cliente.getEnderco().getComplemento() );
            cliente.setTelefone(jlb_PrintTelefone.getText());
            cliente.setEmail(jlb_PrintEmail.getText());
            // o botão comfirmar ??? confirma o cliente local ou global ??
        JOptionPane.showMessageDialog(null,"Cpf encontrado ");
        }
        else
            JOptionPane.showMessageDialog(null, "Cpf não encontrado por favor confirar os dados");
    }//GEN-LAST:event_jbt_BuscarCliActionPerformed

    private void jbt_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_ConfirmarActionPerformed
         // TODO add your handling code here:
         // pegar o cliente do medeto acima !!! 
         // se os dados da interface for igual ao dados do cliente o botão de confirmar e liberado
         //if(jbt_BuscarCli = formPrincipal.daoLivro.buscarLivro())
         venda.setCliente(cliente);
         jbt_Confirmar.setEnabled(false);
         JOptionPane.showMessageDialog(null, "dados confirmados");
    }//GEN-LAST:event_jbt_ConfirmarActionPerformed

    private void jbt_BuscarCodigoLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_BuscarCodigoLivroActionPerformed
        // TODO add your handling code here:
        livro = formPrincipal.daoLivro.buscarLivro(Integer.parseInt(jtf_CodigoLivro.getText()));
        if(livro != null)
        {
            jlb_PrintTitulo.setText(livro.getTitulo());
            jlb_PrintEditora.setText(livro.getFornecedor());
            jlb_PrintValor.setText("R$ "+ Float.toString(livro.getValorUnitario()));
        }
       String codigo = jtf_CodigoLivro.getText();
    }//GEN-LAST:event_jbt_BuscarCodigoLivroActionPerformed

    private void jtf_CodigoLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_CodigoLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_CodigoLivroActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jlb_PrintVenda.setText(Integer.toString(Venda.getNumero()));
        
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
        String dt = fm.format(venda);
        jlb_PrintDataVenda.setText(dt);
    }//GEN-LAST:event_formWindowOpened

    private void jbt_IncluirQuantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_IncluirQuantiActionPerformed
        // TODO add your handling code here:
        int quantidade = Interger.parseInt(jtf_Quantidade);
        if(quantidade !=0)
        {   
            Item it = new Item(livro);
            it.setQuantidade(quantidade);
            it.calcularValorItem();
            
            
            modelo.addRow(new Object[]{livro.getCodigo(),livro.getTitulo(),quantidade,livor})
            venda.inserirItem(it);
            soma = soma + it.getValorItem();
            jlb_PrintValorTotal.setText(Float.toString(soma));
        }
    }//GEN-LAST:event_jbt_IncluirQuantiActionPerformed

    private void jbt_RemoverItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_RemoverItemActionPerformed
        // TODO add your handling code here:
        int linha = jTable1.getSelectedRow();
        int codigo = (Integer)jTable1.getModel().getValueAt(linha, linha)
    }//GEN-LAST:event_jbt_RemoverItemActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbt_BuscarCli;
    private javax.swing.JButton jbt_BuscarCodigoLivro;
    private javax.swing.JButton jbt_Cancelar;
    private javax.swing.JButton jbt_Confirmar;
    private javax.swing.JButton jbt_FecharVenda;
    private javax.swing.JButton jbt_IncluirQuanti;
    private javax.swing.JButton jbt_RemoverItem;
    private javax.swing.JButton jbt_Sair;
    private javax.swing.JFormattedTextField jftf_Cpf;
    private javax.swing.JLabel jlb_Cpf;
    private javax.swing.JLabel jlb_EnderecoCompleto;
    private javax.swing.JLabel jlb_PrintDataVenda;
    private javax.swing.JLabel jlb_PrintEditora;
    private javax.swing.JLabel jlb_PrintEmail;
    private javax.swing.JLabel jlb_PrintEndereco;
    private javax.swing.JLabel jlb_PrintNomeCliente;
    private javax.swing.JLabel jlb_PrintTelefone;
    private javax.swing.JLabel jlb_PrintTitulo;
    private javax.swing.JLabel jlb_PrintValor;
    private javax.swing.JLabel jlb_PrintValorTotal;
    private javax.swing.JLabel jlb_PrintVenda;
    private javax.swing.JLabel jlb_Telefone;
    private javax.swing.JTextField jtf_CodigoLivro;
    private javax.swing.JTextField jtf_Quantidade;
    // End of variables declaration//GEN-END:variables
}