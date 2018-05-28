/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica;

import javax.swing.JOptionPane;
import classes.Matriz;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class Tela extends javax.swing.JFrame {
    Matriz matA = null;
    Matriz matB = null;
    /**
     * Creates new form Tela
     */
    public Tela() {
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

        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSaidaMA = new javax.swing.JTextArea();
        jToggleButtonCriarMA = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldQLinhasMA = new javax.swing.JTextField();
        jTextFieldQColunasMA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldQLinhasMB = new javax.swing.JTextField();
        jTextFieldQColunasMB = new javax.swing.JTextField();
        jToggleButtonCriarMB = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaSaidaMB = new javax.swing.JTextArea();
        jToggleButtonAdicionar = new javax.swing.JToggleButton();
        jToggleButtonSubtrair = new javax.swing.JToggleButton();
        jButtonMultiplicar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaSaidaDeResultado = new javax.swing.JTextArea();
        jButtonCalcTransposta = new javax.swing.JButton();
        jButtonPotenciacao = new javax.swing.JButton();
        jButtonMultiplicarPorK = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto Matriz");
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM", "MATRIZ A", "MATRIZ B"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jButton1.setText("EXECUTAR TABELA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextAreaSaidaMA.setColumns(20);
        jTextAreaSaidaMA.setRows(5);
        jTextAreaSaidaMA.setEnabled(false);
        jScrollPane1.setViewportView(jTextAreaSaidaMA);

        jToggleButtonCriarMA.setText("CRIAR");
        jToggleButtonCriarMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonCriarMAActionPerformed(evt);
            }
        });

        jLabel3.setText("Quantidade de Colunas:");

        jLabel2.setText("Quantidade de Linhas:");

        jLabel6.setText("Quantidade de Colunas:");

        jLabel5.setText("Quantidade de Linhas:");

        jToggleButtonCriarMB.setText("CRIAR");
        jToggleButtonCriarMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonCriarMBActionPerformed(evt);
            }
        });

        jTextAreaSaidaMB.setColumns(20);
        jTextAreaSaidaMB.setRows(5);
        jTextAreaSaidaMB.setEnabled(false);
        jScrollPane2.setViewportView(jTextAreaSaidaMB);

        jToggleButtonAdicionar.setText("ADIÇÃO");
        jToggleButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonAdicionarActionPerformed(evt);
            }
        });

        jToggleButtonSubtrair.setText("SUBTRAÇÃO");
        jToggleButtonSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonSubtrairActionPerformed(evt);
            }
        });

        jButtonMultiplicar.setText("MULTIPLICAÇÃO");
        jButtonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicarActionPerformed(evt);
            }
        });

        jTextAreaSaidaDeResultado.setColumns(20);
        jTextAreaSaidaDeResultado.setRows(5);
        jTextAreaSaidaDeResultado.setEnabled(false);
        jScrollPane3.setViewportView(jTextAreaSaidaDeResultado);

        jButtonCalcTransposta.setText("TRANSPOSTA");
        jButtonCalcTransposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcTranspostaActionPerformed(evt);
            }
        });

        jButtonPotenciacao.setText("POTENCIAÇÃO");
        jButtonPotenciacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPotenciacaoActionPerformed(evt);
            }
        });

        jButtonMultiplicarPorK.setText("CONSTANTE K");
        jButtonMultiplicarPorK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicarPorKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldQLinhasMA, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jToggleButtonCriarMA)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldQColunasMA, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButtonCriarMB)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldQColunasMB))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldQLinhasMB, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButtonAdicionar)
                            .addComponent(jToggleButtonSubtrair)
                            .addComponent(jButtonMultiplicar)
                            .addComponent(jButtonCalcTransposta)
                            .addComponent(jButtonPotenciacao)
                            .addComponent(jButtonMultiplicarPorK))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane3)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jTextFieldQLinhasMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jTextFieldQColunasMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jToggleButtonCriarMB)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jToggleButtonAdicionar)
                                    .addGap(6, 6, 6)
                                    .addComponent(jToggleButtonSubtrair)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonMultiplicar)
                                    .addGap(5, 5, 5)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButtonCalcTransposta)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonPotenciacao)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonMultiplicarPorK))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldQLinhasMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldQColunasMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButtonCriarMA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonAdicionarActionPerformed
        // TODO add your handling code here:
        //Adicionar as matrizes
        try {
            Matriz adicao = matA.adicionar(matB);
            jTextAreaSaidaDeResultado.setText(adicao.getMatriz());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_jToggleButtonAdicionarActionPerformed

    private void jToggleButtonCriarMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonCriarMBActionPerformed
        // TODO add your handling code here:
        try {
            
            int qLinhas = Integer.parseInt(jTextFieldQLinhasMA.getText());
            int qColunas = Integer.parseInt(jTextFieldQColunasMA.getText());
            matB = new Matriz(qLinhas, qColunas);
            for(int l = 0; l < qLinhas; l++){
                for(int c = 0; c < qColunas; c++){
                    String msq = "MATRIZ B ["+l+"]["+c+"]";
                    int elemento = Integer.parseInt(JOptionPane.showInputDialog(msq));
                    matB.setElemento(l, c, elemento);
                }
                jTextAreaSaidaMB.setText(matB.getMatriz());
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_jToggleButtonCriarMBActionPerformed

    private void jToggleButtonSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonSubtrairActionPerformed
        // TODO add your handling code here:
        try {
            Matriz subtracao = matA.subtrair(matB);
            jTextAreaSaidaDeResultado.setText(subtracao.getMatriz());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_jToggleButtonSubtrairActionPerformed

    private void jButtonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicarActionPerformed
        // TODO add your handling code here:
        try {
            Matriz multiplicar = matA.multiplicar(matB);
            jTextAreaSaidaDeResultado.setText(multiplicar.getMatriz());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonMultiplicarActionPerformed

    private void jToggleButtonCriarMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonCriarMAActionPerformed
        // TODO add your handling code here:
        //Criando a matriz A
        try {
            int qLinhas = Integer.parseInt(jTextFieldQLinhasMA.getText());
            int qColunas = Integer.parseInt(jTextFieldQColunasMA.getText());

            matA = new Matriz(qLinhas, qColunas);

            for(int l = 0; l < qLinhas; l++){
                for(int c = 0; c < qColunas; c++){
                    String msq = "MATRIZ A ["+l+"]["+c+"]";
                    int elemento = Integer.parseInt(JOptionPane.showInputDialog(msq));
                    matA.setElemento(l, c, elemento);
                }
                jTextAreaSaidaMA.setText(matA.getMatriz());
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }

    }//GEN-LAST:event_jToggleButtonCriarMAActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            
        DefaultTableModel model =  (DefaultTableModel) jTable1.getModel(); 
            Object[] linha = new Object[]{"Triangular Inferior",(matA.eTriangularInferior(matA))?"SIM":"NÃO",(matB.eTriangularInferior(matB))?"SIM":"NÃO"};
            model.addRow(linha);
            linha = new String[]{"Triangular Superior",(matA.eTriangularSuperior(matA))?"SIM":"NÃO",(matB.eTriangularSuperior(matB))?"SIM":"NÃO"};
            model.addRow(linha);
            linha = new String[]{"Simétrica",(matA.eSimetrica(matA))?"SIM":"NÃO",(matB.eSimetrica(matB))?"SIM":"NÃO"};
            model.addRow(linha);
            linha = new String[]{"Identidade",(matA.eIdentidade(matA))?"SIM":"NÃO",(matB.eIdentidade(matB))?"SIM":"NÃO"};
            model.addRow(linha);
            linha = new String[]{"Iguais",(matA.eIgual(matB))?"SIM":"NÃO",(matB.eIgual(matA))?"SIM":"NÃO"};
            model.addRow(linha);
            linha = new String[]{"Diferentes",(matA.eDiferente(matB))?"SIM":"NÃO",(matB.eDiferente(matA))?"SIM":"NÃO"};
            model.addRow(linha);
            linha = new String[]{"Ortogonal",(matA.eOrtogonal())?"SIM":"NÃO",(matB.eOrtogonal())?"SIM":"NÃO"};
            model.addRow(linha);
            linha = new String[]{"Permutação",(matA.ePermutacao())?"SIM":"NÃO",(matB.ePermutacao())?"SIM":"NÃO"};
            model.addRow(linha);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonCalcTranspostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcTranspostaActionPerformed
        // TODO add your handling code here:
        try {
            Matriz TA = new Matriz(matA.getQuantidadeDeLinhas(), matA.getQuantidadeDeColunas());
            Matriz TB = new Matriz(matB.getQuantidadeDeLinhas(), matB.getQuantidadeDeColunas());
            TA = matA.calcTransposta();
            TB = matB.calcTransposta();
            jTextAreaSaidaDeResultado.setText("Transposta Matriz A: \n"+ TA.getMatriz() + "\n\n" + "Transposta Matriz B: \n" + TB.getMatriz());
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonCalcTranspostaActionPerformed

    private void jButtonPotenciacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPotenciacaoActionPerformed
        // TODO add your handling code here:
        try {
            int expoente = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o expoente: "));
            Matriz PA = new Matriz(matA.getQuantidadeDeLinhas(), matA.getQuantidadeDeColunas());
            Matriz PB = new Matriz(matB.getQuantidadeDeLinhas(), matB.getQuantidadeDeColunas());
            PA = matA.Potenciacao(expoente);
            PB = matB.Potenciacao(expoente);
            jTextAreaSaidaDeResultado.setText("Potenciação Matriz A: \n"+ PA.getMatriz() + "\n\n" + "Potenciação Matriz B: \n" + PB.getMatriz());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonPotenciacaoActionPerformed

    private void jButtonMultiplicarPorKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicarPorKActionPerformed
        // TODO add your handling code here:
        try {
            int expoente = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o expoente: "));
            Matriz KA = new Matriz(matA.getQuantidadeDeLinhas(), matA.getQuantidadeDeColunas());
            Matriz KB = new Matriz(matB.getQuantidadeDeLinhas(), matB.getQuantidadeDeColunas());
            KA = matA.multiplicarPorK(matA, expoente);
            KB = matB.multiplicarPorK(matB, expoente);
            jTextAreaSaidaDeResultado.setText("Matriz A * Constante K \n" + KA.getMatriz() + "\n\n" + "Matriz B * Constante K \n" + KB.getMatriz());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonMultiplicarPorKActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCalcTransposta;
    private javax.swing.JButton jButtonMultiplicar;
    private javax.swing.JButton jButtonMultiplicarPorK;
    private javax.swing.JButton jButtonPotenciacao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaSaidaDeResultado;
    private javax.swing.JTextArea jTextAreaSaidaMA;
    private javax.swing.JTextArea jTextAreaSaidaMB;
    private javax.swing.JTextField jTextFieldQColunasMA;
    private javax.swing.JTextField jTextFieldQColunasMB;
    private javax.swing.JTextField jTextFieldQLinhasMA;
    private javax.swing.JTextField jTextFieldQLinhasMB;
    private javax.swing.JToggleButton jToggleButtonAdicionar;
    private javax.swing.JToggleButton jToggleButtonCriarMA;
    private javax.swing.JToggleButton jToggleButtonCriarMB;
    private javax.swing.JToggleButton jToggleButtonSubtrair;
    // End of variables declaration//GEN-END:variables
}
