package personagem;

import java.util.ArrayList;
import javax.swing.*;

public class PersonagemGUI extends javax.swing.JFrame {

    /**
     * Creates new form PersonagemGUI
     */
    public PersonagemGUI() {
        initComponents();
    }

    Personagem[] personagensGrupo;
    Evento evento;
    ListaEventos lEventos = new ListaEventos();
    Personagem personagem = new Personagem(JOptionPane.showInputDialog("Nome do Jogador:"));
    EscolheHorario escolheHorario = new EscolheHorario();
    AddPersonagem addPersonagem = new AddPersonagem();
    DeletPersonagem deletPersonagem = new DeletPersonagem();
    AtPersonagem1 atPersonagem1 = new AtPersonagem1();
    AtPersonagem2 atPersonagem2 = new AtPersonagem2();
    ListaPersonagens lPersonagens = new ListaPersonagens();
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        fileChooser = new javax.swing.JFileChooser();
        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        listaPersonagens = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Personagem>())
        ;
        listaEventos = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Evento>())
        ;
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        spinnerHealers = new javax.swing.JSpinner();
        spinnerTanks = new javax.swing.JSpinner();
        comboTamanho = new javax.swing.JComboBox();
        comboPersonagem = new javax.swing.JComboBox();
        criarEvento = new javax.swing.JButton();
        spinnerMDPS = new javax.swing.JSpinner();
        spinnerRDPS = new javax.swing.JSpinner();
        opcoes = new javax.swing.JToggleButton();
        fazer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        mostrarGrupo = new javax.swing.JButton();
        escolherHorario = new javax.swing.JButton();
        mostrarEventos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonagens = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEventos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemAbout = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de Guild");
        setResizable(false);

        jLabel3.setText("Personagem");

        jLabel8.setText("RDPS");

        jLabel4.setText("Grupo");

        jLabel7.setText("Tanks");

        jLabel6.setText("Tamanho");

        jLabel9.setText("Healers");

        jLabel1.setText("MDPS");

        spinnerHealers.setModel(new javax.swing.SpinnerNumberModel(0, 0, 25, 1));

        spinnerTanks.setModel(new javax.swing.SpinnerNumberModel(0, 0, 25, 1));

        comboTamanho.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "10", "25" }));

        comboPersonagem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Inserir", "Deletar", "Atualizar" }));

        criarEvento.setText("Criar evento");
        criarEvento.setEnabled(false);
        criarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarEventoActionPerformed(evt);
            }
        });

        spinnerMDPS.setModel(new javax.swing.SpinnerNumberModel(0, 0, 25, 1));

        spinnerRDPS.setModel(new javax.swing.SpinnerNumberModel(0, 0, 25, 1));

        opcoes.setText("Opções da ação");
        opcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcoesActionPerformed(evt);
            }
        });

        fazer.setText("Fazer");
        fazer.setEnabled(false);
        fazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fazerActionPerformed(evt);
            }
        });

        jLabel2.setText("Ação");

        mostrarGrupo.setText("Mostrar Grupo");
        mostrarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarGrupoActionPerformed(evt);
            }
        });

        escolherHorario.setText("Escolher horário");
        escolherHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolherHorarioActionPerformed(evt);
            }
        });

        mostrarEventos.setText("Mostrar Eventos");
        mostrarEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarEventosActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listaPersonagens, tblPersonagens);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomePersonagem}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${raca}"));
        columnBinding.setColumnName("Raça");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${classe}"));
        columnBinding.setColumnName("Classe");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${level}"));
        columnBinding.setColumnName("Level");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${profissao}"));
        columnBinding.setColumnName("Profissão");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${profLevel}"));
        columnBinding.setColumnName("Prof. Level");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${especialidade}"));
        columnBinding.setColumnName("Especialidade");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tblPersonagens);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
        );

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listaEventos, tblEventos);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${personagensString}"));
        columnBinding.setColumnName("Nomes dos Personagens");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${diasHorarios}"));
        columnBinding.setColumnName("Dias/Horários");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tamanho}"));
        columnBinding.setColumnName("Tamanho");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane3.setViewportView(tblEventos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItemAbout.setText("About");
        jMenuItemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAboutActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemAbout);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(opcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(escolherHorario)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(criarEvento))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spinnerTanks, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spinnerRDPS, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(mostrarGrupo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spinnerHealers, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spinnerMDPS, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(comboTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mostrarEventos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(fazer))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcoes)
                    .addComponent(jLabel2))
                .addGap(121, 121, 121)
                .addComponent(fazer, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerHealers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerTanks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerMDPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(spinnerRDPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrarGrupo)
                    .addComponent(mostrarEventos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(escolherHorario)
                .addGap(18, 18, 18)
                .addComponent(criarEvento))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenuItemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAboutActionPerformed
        JOptionPane.showMessageDialog(this, "Gerenciador de Guild - GM " + personagem.getNomeJogador(), "About",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItemAboutActionPerformed

    private void opcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcoesActionPerformed
        if (getComboPersonagem() == "Inserir") {
            if (addPersonagem == null) {
                addPersonagem = new AddPersonagem();
                addPersonagem.setLocationRelativeTo(null);
                addPersonagem.setVisible(true);
                addPersonagem.setResizable(false);
                fazer.setEnabled(true);
            } else {
                addPersonagem.setLocationRelativeTo(null);
                addPersonagem.setVisible(true);
                addPersonagem.setResizable(false);
                fazer.setEnabled(true);
            }
        } else if (getComboPersonagem() == "Deletar") {
            if (deletPersonagem == null) {
                deletPersonagem = new DeletPersonagem();
                deletPersonagem.setLocationRelativeTo(null);
                deletPersonagem.setVisible(true);
                deletPersonagem.setResizable(false);
                fazer.setEnabled(true);
            } else {
                deletPersonagem.setLocationRelativeTo(null);
                deletPersonagem.setVisible(true);
                deletPersonagem.setResizable(false);
                fazer.setEnabled(true);
            }
        } else if (getComboPersonagem() == "Atualizar") {
            if (atPersonagem2 == null) {
                atPersonagem2 = new AtPersonagem2();
                atPersonagem2.setLocationRelativeTo(null);
                atPersonagem2.setVisible(true);
                atPersonagem2.setResizable(false);
                fazer.setEnabled(true);
            } else {
                atPersonagem2.setLocationRelativeTo(null);
                atPersonagem2.setVisible(true);
                atPersonagem2.setResizable(false);
                fazer.setEnabled(true);
            }
            if (atPersonagem1 == null) {
                atPersonagem1 = new AtPersonagem1();
                atPersonagem1.setLocationRelativeTo(null);
                atPersonagem1.setVisible(true);
                atPersonagem1.setResizable(false);
            } else {
                atPersonagem1.setLocationRelativeTo(null);
                atPersonagem1.setVisible(true);
                atPersonagem1.setResizable(false);
            }
        }
    }//GEN-LAST:event_opcoesActionPerformed

    private void fazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fazerActionPerformed
        if (getComboPersonagem() == "Inserir") {
            if(testaNomePersonagem(addPersonagem.getNomePersonagem()) == true){
                personagem = new Personagem(addPersonagem.getNomePersonagem(), addPersonagem.getRaca(), addPersonagem.getClasse(), addPersonagem.getLevel(),
                    addPersonagem.getProfissao(), addPersonagem.getProfLevel(), addPersonagem.getEspecialidade());

                lPersonagens.inserePersonagem(personagem);
                atualizaTabelaPersonagens();
                fazer.setEnabled(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "Já existe um personagem com o nome escolhido!");
            }
        } else if (getComboPersonagem() == "Deletar") {
            boolean removeu = false;
            for (int i = 0; i < lPersonagens.personagens.size(); i++) {
                personagem = lPersonagens.personagens.get(i);
                if (deletPersonagem.getNomePersonagem().equals(personagem.getNomePersonagem())) {
                    if (deletPersonagem.getRaca().equals(personagem.getRaca())) {
                        if (deletPersonagem.getLevel() == personagem.getLevel()) {
                            if (deletPersonagem.getProfissao().equals(personagem.getProfissao())) {
                                if (deletPersonagem.getClasse().equals(personagem.getClasse())) {
                                    if (deletPersonagem.getEspecialidade().equals(personagem.getEspecialidade())) {
                                        if (deletPersonagem.getProfLevel() == personagem.getProfLevel()) {
                                            lPersonagens.removePersonagem(personagem);
                                            atualizaTabelaPersonagens();
                                            removeu = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (removeu == false) {
                JOptionPane.showMessageDialog(null, "Não existe nenhum personagem com as características escolhidas!");
            }
            fazer.setEnabled(false);
        } else if (getComboPersonagem() == "Atualizar") {
            boolean atualizou = false;
            for (int i = 0; i < lPersonagens.personagens.size(); i++) {
                personagem = lPersonagens.personagens.get(i);
                if (atPersonagem1.getNomePersonagem().equals(personagem.getNomePersonagem())) {
                    if (atPersonagem1.getRaca().equals(personagem.getRaca())) {
                        if (atPersonagem1.getLevel() == personagem.getLevel()) {
                            if (atPersonagem1.getProfissao().equals(personagem.getProfissao())) {
                                if (atPersonagem1.getClasse().equals(personagem.getClasse())) {
                                    if (atPersonagem1.getEspecialidade().equals(personagem.getEspecialidade())) {
                                        if (atPersonagem1.getProfLevel() == personagem.getProfLevel()) {
                                            if((atPersonagem2.getNomePersonagem().equals(personagem.getNomePersonagem())) || (testaNomePersonagem(atPersonagem2.getNomePersonagem()) == true)){
                                                lPersonagens.removePersonagem(personagem);
                                                
                                                personagem = new Personagem(atPersonagem2.getNomePersonagem(), atPersonagem2.getRaca(), atPersonagem2.getClasse(),
                                                    atPersonagem2.getLevel(), atPersonagem2.getProfissao(), atPersonagem2.getProfLevel(), atPersonagem2.getEspecialidade());

                                                lPersonagens.inserePersonagem(personagem);
                                                atualizaTabelaPersonagens();
                                                atualizou = true;
                                            }
                                            else{
                                                JOptionPane.showMessageDialog(null, "Já existe um personagem com o nome escolhido!");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (atualizou == false) {
                JOptionPane.showMessageDialog(null, "Não existe nenhum personagem com as características escolhidas!");
            }
            fazer.setEnabled(false);
        }
    }//GEN-LAST:event_fazerActionPerformed

    private void criarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarEventoActionPerformed
        if (testaPossibGrupo() == true) {
            criaPersonagensGrupo();
            if (testaPossibEvento() == true) {
                evento = new Evento(personagensGrupo);
                insereDiasEvento();
                inserePersonagensEvento();
                lEventos.insereEvento(evento);
                atualizaTabelaEventos();
            }
        }
        criarEvento.setEnabled(false);
    }//GEN-LAST:event_criarEventoActionPerformed

    private void mostrarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarGrupoActionPerformed
        if (testaPossibGrupo() == true) {
            criaPersonagensGrupo();
            JOptionPane.showMessageDialog(null, "O grupo será criado com os seguintes personagens:");
            for (int i = 0; i < personagensGrupo.length; i++) {
                personagem = personagensGrupo[i];
                JOptionPane.showMessageDialog(null, "Nome do personagem: " + personagem.getNomePersonagem() + "\nRaça: " + personagem.getRaca()
                        + "\nClasse: " + personagem.getClasse() + "\nLevel: " + personagem.getLevel() + "\nEspecialidade: " + personagem.getEspecialidade()
                        + "\nProfissão: " + personagem.getProfissao() + "\nLevel da Profissão: " + personagem.getProfLevel());
            }
        }
    }//GEN-LAST:event_mostrarGrupoActionPerformed

    private void escolherHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolherHorarioActionPerformed
        if (escolheHorario == null) {
            escolheHorario = new EscolheHorario();
            escolheHorario.setLocationRelativeTo(null);
            escolheHorario.setVisible(true);
            escolheHorario.setResizable(false);
            criarEvento.setEnabled(true);
        } else {
            escolheHorario.setLocationRelativeTo(null);
            escolheHorario.setVisible(true);
            escolheHorario.setResizable(false);
            criarEvento.setEnabled(true);
        }
    }//GEN-LAST:event_escolherHorarioActionPerformed

    private void mostrarEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarEventosActionPerformed
        mostraEventos();
    }//GEN-LAST:event_mostrarEventosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PersonagemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonagemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonagemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonagemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PersonagemGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboPersonagem;
    private javax.swing.JComboBox comboTamanho;
    private javax.swing.JButton criarEvento;
    private javax.swing.JButton escolherHorario;
    private javax.swing.JButton fazer;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAbout;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private java.util.List<Evento> listaEventos;
    private java.util.List<Personagem> listaPersonagens;
    private javax.swing.JButton mostrarEventos;
    private javax.swing.JButton mostrarGrupo;
    private javax.swing.JToggleButton opcoes;
    private javax.swing.JSpinner spinnerHealers;
    private javax.swing.JSpinner spinnerMDPS;
    private javax.swing.JSpinner spinnerRDPS;
    private javax.swing.JSpinner spinnerTanks;
    private javax.swing.JTable tblEventos;
    private javax.swing.JTable tblPersonagens;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public int getComboTamanho() {
        return Integer.parseInt((String) comboTamanho.getSelectedItem());
    }

    public String getComboPersonagem() {
        return (String) comboPersonagem.getSelectedItem();
    }

    public int getSpinnerTanks() {
        return (Integer) spinnerTanks.getValue();
    }

    public int getSpinnerHealers() {
        return (Integer) spinnerHealers.getValue();
    }

    public int getSpinnerRDPS() {
        return (Integer) spinnerRDPS.getValue();
    }

    public int getSpinnerMDPS() {
        return (Integer) spinnerMDPS.getValue();
    }
    
    public void mostraEventos() {
        Evento e;
        if(lEventos.eventos.size() == 0)
            JOptionPane.showMessageDialog(null, "Não foi criado nenhum evento!");
        for (int i = 0; i < lEventos.eventos.size(); i++) {
            e = lEventos.eventos.get(i);
            JOptionPane.showMessageDialog(null, "Evento " + (i +1));
            for (int j = 0; j < e.getPersonagens().length; j++) {
                JOptionPane.showMessageDialog(null, "Nome do personagem: " + e.getPersonagens()[j].getNomePersonagem() + "\nRaça: " + e.getPersonagens()[j].getRaca()
                        + "\nClasse: " + e.getPersonagens()[j].getClasse() + "\nLevel: " + e.getPersonagens()[j].getLevel() + "\nEspecialidade: "
                        + e.getPersonagens()[j].getEspecialidade() + "\nProfissão: " + e.getPersonagens()[j].getProfissao() + "\nLevel da Profissão: " + e.getPersonagens()[j].getProfLevel());
            }

        }
    }

    public boolean testaPossibGrupo() {
        if (getComboTamanho() != (getSpinnerTanks() + getSpinnerHealers() + getSpinnerRDPS() + getSpinnerMDPS())) {
            JOptionPane.showMessageDialog(null, "O número de personagens não é compatível com o tamanho do grupo!");
            return false;
        } else {
            int nTanks = 0, nHealers = 0, nRDPS = 0, nMDPS = 0, i = 0;
            while (i < lPersonagens.personagens.size()) {
                personagem = lPersonagens.personagens.get(i);
                if ("Tank".equals(personagem.getEspecialidade())) {
                    nTanks++;
                } else if ("Healer".equals(personagem.getEspecialidade())) {
                    nHealers++;
                } else if ("RDPS".equals(personagem.getEspecialidade())) {
                    nRDPS++;
                } else if ("MDPS".equals(personagem.getEspecialidade())) {
                    nMDPS++;
                }

                if (nTanks >= getSpinnerTanks() && nHealers >= getSpinnerHealers() && nRDPS >= getSpinnerRDPS() && nMDPS >= getSpinnerMDPS()) {
                    return true;
                }

                i++;
            }

            if (i == lPersonagens.personagens.size()) {
                JOptionPane.showMessageDialog(null, "Não é possível criar um grupo com a configuração de especialidades desejada.");
                return false;
            } else {
                return true;
            }
        }
    }

    public boolean testaPossibEvento() {
        int horarioVazio=0;
        if (escolheHorario.getDomManha() == true) {
            for (int i = 0; i < lEventos.eventos.size(); i++) {
                if (lEventos.eventos.get(i).dias[0][0] == true) {
                    for (int j = 0; j < lEventos.eventos.get(i).getPersonagens().length; j++) {
                        for (int k = 0; k < personagensGrupo.length; k++) {
                            if (personagensGrupo[k] == lEventos.eventos.get(i).getPersonagens()[j]) {
                                JOptionPane.showMessageDialog(null, "O personagem " + personagensGrupo[k].getNomePersonagem() + " já está em um evento no domingo de manhã!");
                                return false;
                            }
                        }
                    }
                }
            }
        }else{
            horarioVazio++;
        }
        if (escolheHorario.getDomTarde() == true) {
            for (int i = 0; i < lEventos.eventos.size(); i++) {
                if (lEventos.eventos.get(i).dias[0][1] == true) {
                    for (int j = 0; j < lEventos.eventos.get(i).getPersonagens().length; j++) {
                        for (int k = 0; k < personagensGrupo.length; k++) {
                            if (personagensGrupo[k] == lEventos.eventos.get(i).getPersonagens()[j]) {
                                JOptionPane.showMessageDialog(null, "O personagem " + personagensGrupo[k].getNomePersonagem() + " já está em um evento no domingo de tarde!");
                                return false;
                            }
                        }
                    }
                }
            }
        }else{
            horarioVazio++;
        }
        if (escolheHorario.getDomNoite() == true) {
            for (int i = 0; i < lEventos.eventos.size(); i++) {
                if (lEventos.eventos.get(i).dias[0][2] == true) {
                    for (int j = 0; j < lEventos.eventos.get(i).getPersonagens().length; j++) {
                        for (int k = 0; k < personagensGrupo.length; k++) {
                            if (personagensGrupo[k] == lEventos.eventos.get(i).getPersonagens()[j]) {
                                JOptionPane.showMessageDialog(null, "O personagem " + personagensGrupo[k].getNomePersonagem() + " já está em um evento no domingo de noite!");
                                return false;
                            }
                        }
                    }
                }
            }
        }else{
            horarioVazio++;
        }
        if (escolheHorario.getSegManha() == true) {
            for (int i = 0; i < lEventos.eventos.size(); i++) {
                if (lEventos.eventos.get(i).dias[1][0] == true) {
                    for (int j = 0; j < lEventos.eventos.get(i).getPersonagens().length; j++) {
                        for (int k = 0; k < personagensGrupo.length; k++) {
                            if (personagensGrupo[k] == lEventos.eventos.get(i).getPersonagens()[j]) {
                                JOptionPane.showMessageDialog(null, "O personagem " + personagensGrupo[k].getNomePersonagem() + " já está em um evento na segunda de manhã!");
                                return false;
                            }
                        }
                    }
                }
            }
        }else{
            horarioVazio++;
        }
        if (escolheHorario.getSegTarde() == true) {
            for (int i = 0; i < lEventos.eventos.size(); i++) {
                if (lEventos.eventos.get(i).dias[1][1] == true) {
                    for (int j = 0; j < lEventos.eventos.get(i).getPersonagens().length; j++) {
                        for (int k = 0; k < personagensGrupo.length; k++) {
                            if (personagensGrupo[k] == lEventos.eventos.get(i).getPersonagens()[j]) {
                                JOptionPane.showMessageDialog(null, "O personagem " + personagensGrupo[k].getNomePersonagem() + " já está em um evento na segunda de tarde!");
                                return false;
                            }
                        }
                    }
                }
            }
        }else{
            horarioVazio++;
        }
        if (escolheHorario.getSegNoite() == true) {
            for (int i = 0; i < lEventos.eventos.size(); i++) {
                if (lEventos.eventos.get(i).dias[1][2] == true) {
                    for (int j = 0; j < lEventos.eventos.get(i).getPersonagens().length; j++) {
                        for (int k = 0; k < personagensGrupo.length; k++) {
                            if (personagensGrupo[k] == lEventos.eventos.get(i).getPersonagens()[j]) {
                                JOptionPane.showMessageDialog(null, "O personagem " + personagensGrupo[k].getNomePersonagem() + " já está em um evento na segunda de noite!");
                                return false;
                            }
                        }
                    }
                }
            }
        }else{
            horarioVazio++;
        }
        if (escolheHorario.getTerManha() == true) {
            for (int i = 0; i < lEventos.eventos.size(); i++) {
                if (lEventos.eventos.get(i).dias[2][0] == true) {
                    for (int j = 0; j < lEventos.eventos.get(i).getPersonagens().length; j++) {
                        for (int k = 0; k < personagensGrupo.length; k++) {
                            if (personagensGrupo[k] == lEventos.eventos.get(i).getPersonagens()[j]) {
                                JOptionPane.showMessageDialog(null, "O personagem " + personagensGrupo[k].getNomePersonagem() + " já está em um evento na terça de manhã!");
                                return false;
                            }
                        }
                    }
                }
            }
        }else{
            horarioVazio++;
        }
        if (escolheHorario.getTerTarde() == true) {
            for (int i = 0; i < lEventos.eventos.size(); i++) {
                if (lEventos.eventos.get(i).dias[2][1] == true) {
                    for (int j = 0; j < lEventos.eventos.get(i).getPersonagens().length; j++) {
                        for (int k = 0; k < personagensGrupo.length; k++) {
                            if (personagensGrupo[k] == lEventos.eventos.get(i).getPersonagens()[j]) {
                                JOptionPane.showMessageDialog(null, "O personagem " + personagensGrupo[k].getNomePersonagem() + " já está em um evento na terça de tarde!");
                                return false;
                            }
                        }
                    }
                }
            }
        }else{
            horarioVazio++;
        }
        if (escolheHorario.getTerNoite() == true) {
            for (int i = 0; i < lEventos.eventos.size(); i++) {
                if (lEventos.eventos.get(i).dias[2][2] == true) {
                    for (int j = 0; j < lEventos.eventos.get(i).getPersonagens().length; j++) {
                        for (int k = 0; k < personagensGrupo.length; k++) {
                            if (personagensGrupo[k] == lEventos.eventos.get(i).getPersonagens()[j]) {
                                JOptionPane.showMessageDialog(null, "O personagem " + personagensGrupo[k].getNomePersonagem() + " já está em um evento na terça de noite!");
                                return false;
                            }
                        }
                    }
                }
            }
        }else{
            horarioVazio++;
        }
        if (escolheHorario.getQuaManha() == true) {
            for (int i = 0; i < lEventos.eventos.size(); i++) {
                if (lEventos.eventos.get(i).dias[3][0] == true) {
                    for (int j = 0; j < lEventos.eventos.get(i).getPersonagens().length; j++) {
                        for (int k = 0; k < personagensGrupo.length; k++) {
                            if (personagensGrupo[k] == lEventos.eventos.get(i).getPersonagens()[j]) {
                                JOptionPane.showMessageDialog(null, "O personagem " + personagensGrupo[k].getNomePersonagem() + " já está em um evento na quarta de manhã!");
                                return false;
                            }
                        }
                    }
                }
            }
        }else{
            horarioVazio++;
        }
        if (escolheHorario.getQuaTarde() == true) {
            for (int i = 0; i < lEventos.eventos.size(); i++) {
                if (lEventos.eventos.get(i).dias[3][1] == true) {
                    for (int j = 0; j < lEventos.eventos.get(i).getPersonagens().length; j++) {
                        for (int k = 0; k < personagensGrupo.length; k++) {
                            if (personagensGrupo[k] == lEventos.eventos.get(i).getPersonagens()[j]) {
                                JOptionPane.showMessageDialog(null, "O personagem " + personagensGrupo[k].getNomePersonagem() + " já está em um evento na quarta de tarde!");
                                return false;
                            }
                        }
                    }
                }
            }
        }else{
            horarioVazio++;
        }
        if (escolheHorario.getQuaNoite() == true) {
            for (int i = 0; i < lEventos.eventos.size(); i++) {
                if (lEventos.eventos.get(i).dias[3][2] == true) {
                    for (int j = 0; j < lEventos.eventos.get(i).getPersonagens().length; j++) {
                        for (int k = 0; k < personagensGrupo.length; k++) {
                            if (personagensGrupo[k] == lEventos.eventos.get(i).getPersonagens()[j]) {
                                JOptionPane.showMessageDialog(null, "O personagem " + personagensGrupo[k].getNomePersonagem() + " já está em um evento na quarta de noite!");
                                return false;
                            }
                        }
                    }
                }
            }
        }else{
            horarioVazio++;
        }
        if (escolheHorario.getQuiManha() == true) {
            for (int i = 0; i < lEventos.eventos.size(); i++) {
                if (lEventos.eventos.get(i).dias[4][0] == true) {
                    for (int j = 0; j < lEventos.eventos.get(i).getPersonagens().length; j++) {
                        for (int k = 0; k < personagensGrupo.length; k++) {
                            if (personagensGrupo[k] == lEventos.eventos.get(i).getPersonagens()[j]) {
                                JOptionPane.showMessageDialog(null, "O personagem " + personagensGrupo[k].getNomePersonagem() + " já está em um evento na quinta de manhã!");
                                return false;
                            }
                        }
                    }
                }
            }
        }else{
            horarioVazio++;
        }
        if (escolheHorario.getQuiTarde() == true) {
            for (int i = 0; i < lEventos.eventos.size(); i++) {
                if (lEventos.eventos.get(i).dias[4][1] == true) {
                    for (int j = 0; j < lEventos.eventos.get(i).getPersonagens().length; j++) {
                        for (int k = 0; k < personagensGrupo.length; k++) {
                            if (personagensGrupo[k] == lEventos.eventos.get(i).getPersonagens()[j]) {
                                JOptionPane.showMessageDialog(null, "O personagem " + personagensGrupo[k].getNomePersonagem() + " já está em um evento na quinta de tarde!");
                                return false;
                            }
                        }
                    }
                }
            }
        }else{
            horarioVazio++;
        }
        if (escolheHorario.getQuiNoite() == true) {
            for (int i = 0; i < lEventos.eventos.size(); i++) {
                if (lEventos.eventos.get(i).dias[4][2] == true) {
                    for (int j = 0; j < lEventos.eventos.get(i).getPersonagens().length; j++) {
                        for (int k = 0; k < personagensGrupo.length; k++) {
                            if (personagensGrupo[k] == lEventos.eventos.get(i).getPersonagens()[j]) {
                                JOptionPane.showMessageDialog(null, "O personagem " + personagensGrupo[k].getNomePersonagem() + " já está em um evento na quinta de noite!");
                                return false;
                            }
                        }
                    }
                }
            }
        }else{
            horarioVazio++;
        }
        if (escolheHorario.getSexManha() == true) {
            for (int i = 0; i < lEventos.eventos.size(); i++) {
                if (lEventos.eventos.get(i).dias[5][0] == true) {
                    for (int j = 0; j < lEventos.eventos.get(i).getPersonagens().length; j++) {
                        for (int k = 0; k < personagensGrupo.length; k++) {
                            if (personagensGrupo[k] == lEventos.eventos.get(i).getPersonagens()[j]) {
                                JOptionPane.showMessageDialog(null, "O personagem " + personagensGrupo[k].getNomePersonagem() + " já está em um evento na sexta de manhã!");
                                return false;
                            }
                        }
                    }
                }
            }
        }else{
            horarioVazio++;
        }
        if (escolheHorario.getSexTarde() == true) {
            for (int i = 0; i < lEventos.eventos.size(); i++) {
                if (lEventos.eventos.get(i).dias[5][1] == true) {
                    for (int j = 0; j < lEventos.eventos.get(i).getPersonagens().length; j++) {
                        for (int k = 0; k < personagensGrupo.length; k++) {
                            if (personagensGrupo[k] == lEventos.eventos.get(i).getPersonagens()[j]) {
                                JOptionPane.showMessageDialog(null, "O personagem " + personagensGrupo[k].getNomePersonagem() + " já está em um evento na sexta de tarde!");
                                return false;
                            }
                        }
                    }
                }
            }
        }else{
            horarioVazio++;
        }
        if (escolheHorario.getSexNoite() == true) {
            for (int i = 0; i < lEventos.eventos.size(); i++) {
                if (lEventos.eventos.get(i).dias[5][2] == true) {
                    for (int j = 0; j < lEventos.eventos.get(i).getPersonagens().length; j++) {
                        for (int k = 0; k < personagensGrupo.length; k++) {
                            if (personagensGrupo[k] == lEventos.eventos.get(i).getPersonagens()[j]) {
                                JOptionPane.showMessageDialog(null, "O personagem " + personagensGrupo[k].getNomePersonagem() + " já está em um evento na sexta de noite!");
                                return false;
                            }
                        }
                    }
                }
            }
        }else{
            horarioVazio++;
        }
        if (escolheHorario.getSabManha() == true) {
            for (int i = 0; i < lEventos.eventos.size(); i++) {
                if (lEventos.eventos.get(i).dias[6][0] == true) {
                    for (int j = 0; j < lEventos.eventos.get(i).getPersonagens().length; j++) {
                        for (int k = 0; k < personagensGrupo.length; k++) {
                            if (personagensGrupo[k] == lEventos.eventos.get(i).getPersonagens()[j]) {
                                JOptionPane.showMessageDialog(null, "O personagem " + personagensGrupo[k].getNomePersonagem() + " já está em um evento no sábado de manhã!");
                                return false;
                            }
                        }
                    }
                }
            }
        }else{
            horarioVazio++;
        }
        if (escolheHorario.getSabTarde() == true) {
            for (int i = 0; i < lEventos.eventos.size(); i++) {
                if (lEventos.eventos.get(i).dias[6][1] == true) {
                    for (int j = 0; j < lEventos.eventos.get(i).getPersonagens().length; j++) {
                        for (int k = 0; k < personagensGrupo.length; k++) {
                            if (personagensGrupo[k] == lEventos.eventos.get(i).getPersonagens()[j]) {
                                JOptionPane.showMessageDialog(null, "O personagem " + personagensGrupo[k].getNomePersonagem() + " já está em um evento no sábado de tarde!");
                                return false;
                            }
                        }
                    }
                }
            }
        }else{
            horarioVazio++;
        }
        if (escolheHorario.getSabNoite() == true) {
            for (int i = 0; i < lEventos.eventos.size(); i++) {
                if (lEventos.eventos.get(i).dias[6][2] == true) {
                    for (int j = 0; j < lEventos.eventos.get(i).getPersonagens().length; j++) {
                        for (int k = 0; k < personagensGrupo.length; k++) {
                            if (personagensGrupo[k] == lEventos.eventos.get(i).getPersonagens()[j]) {
                                JOptionPane.showMessageDialog(null, "O personagem " + personagensGrupo[k].getNomePersonagem() + " já está em um evento no sábado de noite!");
                                return false;
                            }
                        }
                    }
                }
            }
        }else{
            horarioVazio++;
        }
        if(horarioVazio == 21){
            JOptionPane.showMessageDialog(null, "Escolha um ou mais horários para o evento!");
            return false;
        }
            
        return true;
    }

    public void insereDiasEvento() {
        if (escolheHorario.getDomManha() == true) {
            evento.dias[0][0] = true;
            evento.diasHorarios = evento.diasHorarios + "domingo de manhã; ";
        }
        if (escolheHorario.getDomTarde() == true) {
            evento.dias[0][1] = true;
            evento.diasHorarios = evento.diasHorarios + "domingo de tarde; ";
        }
        if (escolheHorario.getDomNoite() == true) {
            evento.dias[0][2] = true;
            evento.diasHorarios = evento.diasHorarios + "domingo de noite; ";
        }
        if (escolheHorario.getSegManha() == true) {
            evento.dias[1][0] = true;
            evento.diasHorarios = evento.diasHorarios + "segunda de manhã; ";
        }
        if (escolheHorario.getSegTarde() == true) {
            evento.dias[1][1] = true;
            evento.diasHorarios = evento.diasHorarios + "segunda de tarde; ";
        }
        if (escolheHorario.getSegNoite() == true) {
            evento.dias[1][2] = true;
            evento.diasHorarios = evento.diasHorarios + "segunda de noite; ";
        }
        if (escolheHorario.getTerManha() == true) {
            evento.dias[2][0] = true;
            evento.diasHorarios = evento.diasHorarios + "terça de manhã; ";
        }
        if (escolheHorario.getTerTarde() == true) {
            evento.dias[2][1] = true;
            evento.diasHorarios = evento.diasHorarios + "terça de tarde; ";
        }
        if (escolheHorario.getTerNoite() == true) {
            evento.dias[2][2] = true;
            evento.diasHorarios = evento.diasHorarios + "terça de noite; ";
        }
        if (escolheHorario.getQuaManha() == true) {
            evento.dias[3][0] = true;
            evento.diasHorarios = evento.diasHorarios + "quarta de manhã; ";
        }
        if (escolheHorario.getQuaTarde() == true) {
            evento.dias[3][1] = true;
            evento.diasHorarios = evento.diasHorarios + "quarta de tarde; ";
        }
        if (escolheHorario.getQuaNoite() == true) {
            evento.dias[3][2] = true;
            evento.diasHorarios = evento.diasHorarios + "quarta de noite; ";
        }
        if (escolheHorario.getQuiManha() == true) {
            evento.dias[4][0] = true;
            evento.diasHorarios = evento.diasHorarios + "quinta de manhã; ";
        }
        if (escolheHorario.getQuiTarde() == true) {
            evento.dias[4][1] = true;
            evento.diasHorarios = evento.diasHorarios + "quinta de tarde; ";
        }
        if (escolheHorario.getQuiNoite() == true) {
            evento.dias[4][2] = true;
            evento.diasHorarios = evento.diasHorarios + "quinta de noite; ";
        }
        if (escolheHorario.getSexManha() == true) {
            evento.dias[5][0] = true;
            evento.diasHorarios = evento.diasHorarios + "sexta de manhã; ";
        }
        if (escolheHorario.getSexTarde() == true) {
            evento.dias[5][1] = true;
            evento.diasHorarios = evento.diasHorarios + "sexta de tarde; ";
        }
        if (escolheHorario.getSexNoite() == true) {
            evento.dias[5][2] = true;
            evento.diasHorarios = evento.diasHorarios + "sexta de noite; ";
        }
        if (escolheHorario.getSabManha() == true) {
            evento.dias[6][0] = true;
            evento.diasHorarios = evento.diasHorarios + "sábado de manhã; ";
        }
        if (escolheHorario.getSabTarde() == true) {
            evento.dias[6][1] = true;
            evento.diasHorarios = evento.diasHorarios + "sábado de tarde; ";
        }
        if (escolheHorario.getSabNoite() == true) {
            evento.dias[6][2] = true;
            evento.diasHorarios = evento.diasHorarios + "sábado de noite; ";
        }
    }

    void criaPersonagensGrupo() {
        int nTanks = 0, nHealers = 0, nRDPS = 0, nMDPS = 0, i = 0;
        int j = 0;
        personagensGrupo = new Personagem[getComboTamanho()];
        while (nTanks < getSpinnerTanks() || nHealers < getSpinnerHealers() || nRDPS < getSpinnerRDPS() || nMDPS < getSpinnerMDPS()) {
            personagem = lPersonagens.personagens.get(i);
            if (("Tank".equals(personagem.getEspecialidade())) && (nTanks < getSpinnerTanks())) {
                personagensGrupo[j] = personagem;
                j++;
                nTanks++;
            } else if (("Healer".equals(personagem.getEspecialidade())) && (nHealers < getSpinnerHealers())) {
                personagensGrupo[j] = personagem;
                j++;
                nHealers++;
            } else if (("MDPS".equals(personagem.getEspecialidade())) && (nMDPS < getSpinnerMDPS())) {
                personagensGrupo[j] = personagem;
                j++;
                nMDPS++;

            } else if (("RDPS".equals(personagem.getEspecialidade())) && (nRDPS < getSpinnerRDPS())) {
                personagensGrupo[j] = personagem;
                j++;
                nRDPS++;
            }
            i++;
        }
    }
    
    public void inserePersonagensEvento(){
        for(int i=0;i < personagensGrupo.length;i++){
            evento.personagensString = evento.personagensString + personagensGrupo[i].getNomePersonagem() + "; ";
        }
    }
    
    public boolean testaNomePersonagem(String nome){
        for(int i=0; i<lPersonagens.personagens.size();i++){
            if(nome.equals(lPersonagens.personagens.get(i).getNomePersonagem()))
                return false;
        }
        return true;
    }
    
    public void atualizaTabelaPersonagens(){
        listaPersonagens.clear();
        listaPersonagens.addAll(lPersonagens.personagens);
        int linha = listaPersonagens.size() -1;
        if(linha>=0){
            tblPersonagens.setRowSelectionInterval(linha, linha);
            tblPersonagens.scrollRectToVisible(tblPersonagens.getCellRect(linha,linha,true));
        }
    }
    
    public void atualizaTabelaEventos(){
        listaEventos.clear();
        listaEventos.addAll(lEventos.eventos);
        int linha = listaEventos.size() -1;
        if(linha>=0){
            tblEventos.setRowSelectionInterval(linha, linha);
            tblEventos.scrollRectToVisible(tblEventos.getCellRect(linha,linha,true));
        }
    }

}
