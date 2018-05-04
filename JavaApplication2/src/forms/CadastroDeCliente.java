/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.util.Enumeration;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import model.Cliente;

/**
 *
 * @author wagner
 */
public class CadastroDeCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadastroDeCliente
     */
    public CadastroDeCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_EstadoCivil = new javax.swing.ButtonGroup();
        jftf_NomeCompleto = new javax.swing.JFormattedTextField();
        jlb_Cpf = new javax.swing.JLabel();
        jbl_NomeCompleto = new javax.swing.JLabel();
        jtf_NomeCompleto = new javax.swing.JTextField();
        jbt_Buscar = new javax.swing.JButton();
        jftf_Cpf = new javax.swing.JFormattedTextField();
        jtp_DadosPessoais = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jftf_Email = new javax.swing.JFormattedTextField();
        jlb_Telefone = new javax.swing.JLabel();
        jlb_Email = new javax.swing.JLabel();
        jftf_Telefone = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jRb_Casado = new javax.swing.JRadioButton();
        jRb_Solteiro = new javax.swing.JRadioButton();
        jRb_UniaoEstavel = new javax.swing.JRadioButton();
        jRb_Viuvo = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jlb_Logradouro = new javax.swing.JLabel();
        jlb_complemento = new javax.swing.JLabel();
        jlb_Cidade = new javax.swing.JLabel();
        jlb_Estado = new javax.swing.JLabel();
        jlb_Cep = new javax.swing.JLabel();
        jtf_Lagradouro = new javax.swing.JTextField();
        jtf_Cidade = new javax.swing.JTextField();
        jtf_Complemento = new javax.swing.JTextField();
        jftf_Cep = new javax.swing.JFormattedTextField();
        jcb_Estado = new javax.swing.JComboBox<>();
        jbt_Cadastrar = new javax.swing.JButton();
        jbt_Atualizar = new javax.swing.JButton();
        jbt_Limpar = new javax.swing.JButton();
        jbt_Sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        jlb_Cpf.setText("Cpf");

        jbl_NomeCompleto.setText("Nome Completo");

        jtf_NomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_NomeCompletoActionPerformed(evt);
            }
        });

        jbt_Buscar.setText("Buscar");
        jbt_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_BuscarActionPerformed(evt);
            }
        });

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

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlb_Telefone.setText("Telefone");

        jlb_Email.setText("Email");

        try {
            jftf_Telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftf_Telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftf_TelefoneActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado Civil"));

        bg_EstadoCivil.add(jRb_Casado);
        jRb_Casado.setText("Casado");

        bg_EstadoCivil.add(jRb_Solteiro);
        jRb_Solteiro.setText("Solteiro");

        bg_EstadoCivil.add(jRb_UniaoEstavel);
        jRb_UniaoEstavel.setText("União Estável");

        bg_EstadoCivil.add(jRb_Viuvo);
        jRb_Viuvo.setText("Viúvo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRb_Solteiro, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRb_Casado)
                .addGap(52, 52, 52)
                .addComponent(jRb_UniaoEstavel)
                .addGap(40, 40, 40)
                .addComponent(jRb_Viuvo)
                .addGap(62, 62, 62))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRb_UniaoEstavel)
                    .addComponent(jRb_Casado)
                    .addComponent(jRb_Solteiro)
                    .addComponent(jRb_Viuvo))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jftf_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlb_Telefone))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb_Email)
                            .addComponent(jftf_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_Telefone)
                    .addComponent(jlb_Email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jftf_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftf_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jtp_DadosPessoais.addTab("Dados Pessoais", jPanel1);

        jlb_Logradouro.setText("Logradouro:");

        jlb_complemento.setText("Complemento:");

        jlb_Cidade.setText("Cidade:");

        jlb_Estado.setText("Estado:");

        jlb_Cep.setText("CEP:");

        jtf_Lagradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_LagradouroActionPerformed(evt);
            }
        });

        jtf_Cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_CidadeActionPerformed(evt);
            }
        });

        jtf_Complemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_ComplementoActionPerformed(evt);
            }
        });

        try {
            jftf_Cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jcb_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "AC", "BA", "DF", "GO", "MG", "MT", "RJ", "SP", "SC", "RS" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb_Cidade)
                            .addComponent(jtf_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb_Estado)
                            .addComponent(jcb_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb_Cep)
                            .addComponent(jftf_Cep, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(144, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jlb_Logradouro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jtf_Lagradouro)
                                .addGap(64, 64, 64)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb_complemento)
                            .addComponent(jtf_Complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_Logradouro)
                    .addComponent(jlb_complemento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_Lagradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_Complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jlb_Cep))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlb_Estado)
                            .addComponent(jlb_Cidade))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jftf_Cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcb_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );

        jtp_DadosPessoais.addTab("Endereço Completo", jPanel3);

        jbt_Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/inserirCliente.png"))); // NOI18N
        jbt_Cadastrar.setText("Cadastra");
        jbt_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_CadastrarActionPerformed(evt);
            }
        });

        jbt_Atualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/atualizar.png"))); // NOI18N
        jbt_Atualizar.setText("Atualizar");
        jbt_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_AtualizarActionPerformed(evt);
            }
        });

        jbt_Limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/limpar.png"))); // NOI18N
        jbt_Limpar.setText("Limpar");
        jbt_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_LimparActionPerformed(evt);
            }
        });

        jbt_Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair.png"))); // NOI18N
        jbt_Sair.setText("Sair");
        jbt_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtp_DadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jlb_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(84, 84, 84)
                            .addComponent(jbl_NomeCompleto))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jftf_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(56, 56, 56)
                            .addComponent(jtf_NomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(jbt_Buscar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jbt_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(61, 61, 61)
                            .addComponent(jbt_Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(80, 80, 80)
                            .addComponent(jbt_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(48, 48, 48)
                            .addComponent(jbt_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_Cpf)
                    .addComponent(jbl_NomeCompleto))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jftf_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtf_NomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbt_Buscar)))
                .addGap(20, 20, 20)
                .addComponent(jtp_DadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbt_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt_Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jftf_CpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftf_CpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftf_CpfActionPerformed

    private void jbt_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_CadastrarActionPerformed
        // peguei os valores dos campos
        Cliente cliente = new Cliente();
        // colocaque cada dados no clintee
        cliente.setNome(jtf_NomeCompleto.getText());
        cliente.setCpf(jftf_Cpf.getText());
        cliente.setEmail(jftf_Email.getText());
        cliente.setTelefone(jftf_Telefone.getText());
        cliente.setEstadoCivil(bg_EstadoCivil.getSelection().getActionCommand());
        // pegar os dados
        cliente.getEnderco().setLogradouro(jtf_Lagradouro.getText());
        cliente.getEnderco().setComplemento(jtf_Complemento.getText());
        cliente.getEnderco().setCidade(jtf_Cidade.getText());
        cliente.getEnderco().setEstado(jcb_Estado.getSelectedItem().toString());
        cliente.getEnderco().setCep(jftf_Cep.getText());
        
        formPrincipal.bdcliente.inserirCliente(cliente);
        JOptionPane.showMessageDialog(null, "Cliente cadastrador com sucesso! ");
        this.limparTela();
       
    }//GEN-LAST:event_jbt_CadastrarActionPerformed

    private void jbt_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_BuscarActionPerformed
         String cpf = jftf_Cpf.getText(); // pegar o valor do campo cpf
         // pegar o cpf do campo do formulario principal
         Cliente cliente = formPrincipal.bdcliente.buscarCliente("cpf");
         if(cliente != null )
         {
             // colocar cada dado do cliente em cada compo
             jtf_NomeCompleto.setText(cliente.getNome()); 
             jftf_Cpf.setText(cliente.getCpf());
             jftf_Email.setText(cliente.getEmail());
             jftf_Telefone.setText(cliente.getTelefone());      
             
             jtf_Lagradouro.setText(cliente.getEnderco().getLogradouro());
             jtf_Complemento.setText(cliente.getEnderco().getComplemento());
             jtf_Cidade.setText(cliente.getEnderco().getCidade());
             jftf_Cep.setText(cliente.getEnderco().getCep());
                
             JRadioButton radio; 
             Enumeration jr = bg_EstadoCivil.getElements(); 
             while ( jr.hasMoreElements() ) 
                {
                    radio = (JRadioButton) jr.nextElement();
                    if (radio.getText().equals(cliente.getEstadoCivil()))
                        radio.setSelected(true);                                        
                }               
                
             for(int i = 0; i< jcb_Estado.getItemCount();i++)
                {
                    if (jcb_Estado.getItemAt(i).equals(cliente.getEnderco().getEstado()))
                        jcb_Estado.setSelectedIndex(i);                    
                }  
         }
         else
         {
             //JOptionPane.showMessageDialog(null, "Dados de Login não conferem!! \nPor favor, tente novamente", "Problema encontrado", JOptionPane.INFORMATION_MESSAGE);
              
             JOptionPane.showMessageDialog(null, "asdf","asdf" ,JOptionPane.INFORMATION_MESSAGE); // mostrar uma msg de erro
         }
    }//GEN-LAST:event_jbt_BuscarActionPerformed

    private void jbt_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_SairActionPerformed
        // TODO add your handling code her
        this.dispose();
    }//GEN-LAST:event_jbt_SairActionPerformed

    private void jbt_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_LimparActionPerformed
        // TODO add your handling code here:
        this.limparTela();
    }//GEN-LAST:event_jbt_LimparActionPerformed

    private void jtf_LagradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_LagradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_LagradouroActionPerformed

    private void jtf_ComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_ComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_ComplementoActionPerformed

    private void jtf_CidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_CidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_CidadeActionPerformed

    private void jftf_TelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftf_TelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftf_TelefoneActionPerformed

    private void jtf_NomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_NomeCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_NomeCompletoActionPerformed

    private void jbt_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_AtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_AtualizarActionPerformed
    
    
    // metodo de limpar tela
    private void limparTela(){
        jtf_Cidade.setText("");
        jtf_Complemento.setText("");
        jtf_Lagradouro.setText("");
        jftf_Cep.setText("");
        bg_EstadoCivil.clearSelection();
        jftf_Cpf.setText("");
        jtf_NomeCompleto.setText("");
        jftf_Telefone.setText("");
        jftf_Email.setText("");
        
        jftf_Cpf.requestFocus();
        jtp_DadosPessoais.setSelectedIndex(0);
        jcb_Estado.setSelectedIndex(-1);

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
            java.util.logging.Logger.getLogger(CadastroDeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_EstadoCivil;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRb_Casado;
    private javax.swing.JRadioButton jRb_Solteiro;
    private javax.swing.JRadioButton jRb_UniaoEstavel;
    private javax.swing.JRadioButton jRb_Viuvo;
    private javax.swing.JLabel jbl_NomeCompleto;
    private javax.swing.JButton jbt_Atualizar;
    private javax.swing.JButton jbt_Buscar;
    private javax.swing.JButton jbt_Cadastrar;
    private javax.swing.JButton jbt_Limpar;
    private javax.swing.JButton jbt_Sair;
    private javax.swing.JComboBox<String> jcb_Estado;
    private javax.swing.JFormattedTextField jftf_Cep;
    private javax.swing.JFormattedTextField jftf_Cpf;
    private javax.swing.JFormattedTextField jftf_Email;
    private javax.swing.JFormattedTextField jftf_NomeCompleto;
    private javax.swing.JFormattedTextField jftf_Telefone;
    private javax.swing.JLabel jlb_Cep;
    private javax.swing.JLabel jlb_Cidade;
    private javax.swing.JLabel jlb_Cpf;
    private javax.swing.JLabel jlb_Email;
    private javax.swing.JLabel jlb_Estado;
    private javax.swing.JLabel jlb_Logradouro;
    private javax.swing.JLabel jlb_Telefone;
    private javax.swing.JLabel jlb_complemento;
    private javax.swing.JTextField jtf_Cidade;
    private javax.swing.JTextField jtf_Complemento;
    private javax.swing.JTextField jtf_Lagradouro;
    private javax.swing.JTextField jtf_NomeCompleto;
    private javax.swing.JTabbedPane jtp_DadosPessoais;
    // End of variables declaration//GEN-END:variables
}
