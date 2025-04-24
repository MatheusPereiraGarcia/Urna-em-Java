
package urnaeletronica;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Urna extends javax.swing.JFrame {

    private int cont = 1;
    private int resultado = 0;
    private String candidatoReitor;
    private String candidatoDiretor;
    private int votobranco = 0;
    private int votonulo=0;
    private int voto = 0;
    
    public Urna() {
        initComponents();
    }

    public int concatenar() {
        
        
        int numero1 = Integer.parseInt(jTextField1.getText());
        int numero2 = Integer.parseInt(jTextField2.getText());
        resultado = Integer.parseInt(String.valueOf(numero1) + String.valueOf(numero2));
        
        
        return resultado;
    }
    public void mostrarft() {

        
       if (cont == 3) {
           concatenar();
           if (resultado == 22) {
               jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/tigrao.png")));
               jLabel1.setText("Nome: Tigrao");
               jLabel2.setText("Diretor");
           } else if (resultado == 50) {
               jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/coragem.png")));
               jLabel1.setText("Nome: Coragem");
               jLabel2.setText("Diretor");
           }
           if (resultado == 79) {
               jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/ducll.jpg")));
               jLabel1.setText("Nome: Duck");
               jLabel2.setText("Reitor");
           } else if (resultado == 42) {
               jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/pato.jpg")));
               jLabel1.setText("Nome: pato");
               jLabel2.setText("Reitor");
           }
       }
   }

    public void candidatos(){
        concatenar();
        if(resultado == 22){
            candidatoDiretor = "Tigrao";
            
        }else if(resultado == 50){
            candidatoDiretor = "Coragem";
            
        }else if(resultado == 79){
            candidatoReitor = "Duck";
            
        }else if(resultado == 42){
            candidatoReitor = "Pato";
            
        }
    }
        public void mensagemfinal(){

            JOptionPane.showMessageDialog(rootPane, "Seus votos foram para " +candidatoReitor +" como Reitor e "+ candidatoDiretor + " como Diretor");
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        N2 = new javax.swing.JButton();
        N3 = new javax.swing.JButton();
        N1 = new javax.swing.JButton();
        N4 = new javax.swing.JButton();
        N5 = new javax.swing.JButton();
        N6 = new javax.swing.JButton();
        N8 = new javax.swing.JButton();
        N7 = new javax.swing.JButton();
        N9 = new javax.swing.JButton();
        N0 = new javax.swing.JButton();
        branco = new javax.swing.JButton();
        confirmar = new javax.swing.JButton();
        corrigir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setText("Diretor");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText(" ");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText(" ");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Candidatos Reitoria:");

        jLabel6.setText("Candidatos Diretoria:");

        jLabel7.setText("Duck(79), Pato(42)");

        jLabel8.setText("Tigrao(22), Coragem(50)");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel8))
                    .addComponent(jLabel7))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addGap(17, 17, 17))
        );

        jLabel9.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(340, 340, 340)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                                .addComponent(jLabel9))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(112, 112, 112))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        N2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        N2.setText("2");
        N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N2ActionPerformed(evt);
            }
        });

        N3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        N3.setText("3");
        N3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N3ActionPerformed(evt);
            }
        });

        N1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        N1.setText("1");
        N1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N1ActionPerformed(evt);
            }
        });

        N4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        N4.setText("4");
        N4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N4ActionPerformed(evt);
            }
        });

        N5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        N5.setText("5");
        N5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N5ActionPerformed(evt);
            }
        });

        N6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        N6.setText("6");
        N6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N6ActionPerformed(evt);
            }
        });

        N8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        N8.setText("8");
        N8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N8ActionPerformed(evt);
            }
        });

        N7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        N7.setText("7");
        N7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N7ActionPerformed(evt);
            }
        });

        N9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        N9.setText("9");
        N9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N9ActionPerformed(evt);
            }
        });

        N0.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        N0.setText("0");
        N0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N0ActionPerformed(evt);
            }
        });

        branco.setText("Branco");
        branco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brancoActionPerformed(evt);
            }
        });

        confirmar.setBackground(new java.awt.Color(0, 102, 0));
        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        corrigir.setBackground(new java.awt.Color(255, 204, 0));
        corrigir.setText("Corrigir");
        corrigir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corrigirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(N1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(N2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(N3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(N7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(N8))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(N4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(N5))
                            .addComponent(N0))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(N6)
                            .addComponent(N9)))
                    .addComponent(branco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(corrigir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(confirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(N2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(N4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(N8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(N0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(branco, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(corrigir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Serif", 0, 48)); // NOI18N
        jLabel4.setText("THE URNA SIMULATOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N2ActionPerformed
        //BOtão 2
        if(cont ==1){
            cont++;
            jTextField1.setText("2");
        }else if(cont==2){
            jTextField2.setText("2");
            cont++;
        }        
        mostrarft();
    }//GEN-LAST:event_N2ActionPerformed

    private void N3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N3ActionPerformed
        //Botão 3
        if(cont ==1){
            cont++;
            jTextField1.setText("3");
        }else if(cont==2){
            jTextField2.setText("3");
            cont++;
        }
        mostrarft();
    }//GEN-LAST:event_N3ActionPerformed

    private void N1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N1ActionPerformed
        //botão 1
        if(cont ==1){
            cont++;
            jTextField1.setText("1");
        }else if(cont==2){
            jTextField2.setText("1");
            cont++;
        }
        mostrarft();
    }//GEN-LAST:event_N1ActionPerformed

    private void N4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N4ActionPerformed
        //Botão 4
        if(cont ==1){
            cont++;
            jTextField1.setText("4");
        }else if(cont==2){
            jTextField2.setText("4");
            cont++;
        }
        mostrarft();
    }//GEN-LAST:event_N4ActionPerformed

    private void N5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N5ActionPerformed
        //Botão 5
        if(cont ==1){
            cont++;
            jTextField1.setText("5");
        }else if(cont==2){
            jTextField2.setText("5");
            cont++;
        }
        mostrarft();
    }//GEN-LAST:event_N5ActionPerformed

    private void N6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N6ActionPerformed
        //Botão 6
        if(cont ==1){
            cont++;
            jTextField1.setText("6");
        }else if(cont==2){
            jTextField2.setText("6");
            cont++;
        }
        mostrarft();
    }//GEN-LAST:event_N6ActionPerformed

    private void N8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N8ActionPerformed
    //Botão 8
        if(cont ==1){
            cont++;
            jTextField1.setText("8");
        }else if(cont==2){
            jTextField2.setText("8");
            cont++;
        }
        mostrarft();
    }//GEN-LAST:event_N8ActionPerformed

    private void N7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N7ActionPerformed
    //Botão 7
        if(cont ==1){
            cont++;
            jTextField1.setText("7");
        }else if(cont==2){
            jTextField2.setText("7");
            cont++;
        }
        mostrarft();
    }//GEN-LAST:event_N7ActionPerformed

    private void N9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N9ActionPerformed
    //Botão 9
        if(cont ==1){
            cont++;
            jTextField1.setText("9");
        }else if(cont==2){
            jTextField2.setText("9");
            cont++;
        }
        mostrarft();
    }//GEN-LAST:event_N9ActionPerformed

    private void N0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N0ActionPerformed
    //Botão 0
        if(cont ==1){
            cont++;
            jTextField1.setText("0");
        }else if(cont==2){
            jTextField2.setText("0");
            cont++;
        }
        mostrarft();
    }//GEN-LAST:event_N0ActionPerformed

    private void brancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brancoActionPerformed
        if(voto >= 2){
            JOptionPane.showMessageDialog(null, "Você já votou nos seus candidatos!");
        }
        JOptionPane.showMessageDialog(null, "Voto confirmado com Sucesso!");
        if(voto==0){
            if(resultado != 50 && resultado != 22 && resultado != 42 && resultado != 79){
                candidatoReitor = "Branco";
            }
        }
        if(voto==1){
            if(resultado != 50 && resultado != 22 && resultado != 42 && resultado != 79){
                candidatoDiretor = "Branco";
            }
        }
        voto++;
        cont=1;
        
        jTextField1.setText("");
        jTextField2.setText("");
        if(voto ==2){
            mensagemfinal();
        }
    }//GEN-LAST:event_brancoActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        //Confirmar
        if(voto >= 2){
            JOptionPane.showMessageDialog(null, "Você já votou nos seus candidatos!");
            
        }else{
            candidatos();
        concatenar();
        if(voto==0){
            if(resultado != 42 && resultado != 79){
                jLabel1.setText("NULO");
                jLabel2.setText("NULO");
                candidatoReitor = "Nulo";
            }
        }
        if(voto==1){
            if(resultado != 50 && resultado != 22 ){
                jLabel1.setText("NULO");
                jLabel2.setText("NULO");
                candidatoDiretor = "Nulo";
            }
        }
        
        JOptionPane.showMessageDialog(null, "Voto confirmado com Sucesso!");
        cont = 1;
        voto++;
        jTextField1.setText("");
        jTextField2.setText("");
        if(voto ==2){
            mensagemfinal();
        }
        }
        
    }//GEN-LAST:event_confirmarActionPerformed

    private void corrigirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corrigirActionPerformed
        cont=1;
        jTextField1.setText("");
        jTextField2.setText("");
    }//GEN-LAST:event_corrigirActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Urna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Urna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Urna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Urna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Urna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton N0;
    private javax.swing.JButton N1;
    private javax.swing.JButton N2;
    private javax.swing.JButton N3;
    private javax.swing.JButton N4;
    private javax.swing.JButton N5;
    private javax.swing.JButton N6;
    private javax.swing.JButton N7;
    private javax.swing.JButton N8;
    private javax.swing.JButton N9;
    private javax.swing.JButton branco;
    private javax.swing.JButton confirmar;
    private javax.swing.JButton corrigir;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
