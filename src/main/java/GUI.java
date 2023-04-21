
package com.mycompany.projebura;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Main_Text_Area = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Document_Text_Area = new javax.swing.JTextArea();
        showButton = new javax.swing.JButton();
        cleanButton = new javax.swing.JButton();
        opaquePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SPELL CHECK");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(51, 51, 51));
        setName("workFrame"); // NOI18N
        setResizable(false);

        kGradientPanel.setkEndColor(new java.awt.Color(221, 255, 255));
        kGradientPanel.setkStartColor(new java.awt.Color(176, 196, 222));

        Main_Text_Area.setBackground(new java.awt.Color(255, 255, 255));
        Main_Text_Area.setColumns(20);
        Main_Text_Area.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Main_Text_Area.setForeground(new java.awt.Color(0, 0, 0));
        Main_Text_Area.setLineWrap(true);
        Main_Text_Area.setRows(5);
        jScrollPane1.setViewportView(Main_Text_Area);

        Document_Text_Area.setEditable(false);
        Document_Text_Area.setBackground(new java.awt.Color(255, 255, 255));
        Document_Text_Area.setColumns(20);
        Document_Text_Area.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        Document_Text_Area.setForeground(new java.awt.Color(0, 102, 51));
        Document_Text_Area.setLineWrap(true);
        Document_Text_Area.setRows(5);
        jScrollPane2.setViewportView(Document_Text_Area);

        showButton.setBackground(new java.awt.Color(0, 153, 51));
        showButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        showButton.setForeground(new java.awt.Color(255, 255, 255));
        showButton.setText("SHOW");
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonActionPerformed(evt);
            }
        });

        cleanButton.setBackground(new java.awt.Color(153, 0, 0));
        cleanButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        cleanButton.setForeground(new java.awt.Color(255, 255, 255));
        cleanButton.setText("CLEAN");
        cleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanButtonActionPerformed(evt);
            }
        });

        opaquePanel.setOpaque(false);

        javax.swing.GroupLayout opaquePanelLayout = new javax.swing.GroupLayout(opaquePanel);
        opaquePanel.setLayout(opaquePanelLayout);
        opaquePanelLayout.setHorizontalGroup(
            opaquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );
        opaquePanelLayout.setVerticalGroup(
            opaquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout kGradientPanelLayout = new javax.swing.GroupLayout(kGradientPanel);
        kGradientPanel.setLayout(kGradientPanelLayout);
        kGradientPanelLayout.setHorizontalGroup(
            kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanelLayout.createSequentialGroup()
                .addGroup(kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanelLayout.createSequentialGroup()
                        .addGroup(kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(kGradientPanelLayout.createSequentialGroup()
                                .addGroup(kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(kGradientPanelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(opaquePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanelLayout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(showButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(kGradientPanelLayout.createSequentialGroup()
                                .addComponent(cleanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        kGradientPanelLayout.setVerticalGroup(
            kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(kGradientPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(showButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opaquePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cleanButton)
                        .addGap(52, 52, 52))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanButtonActionPerformed
        Main_Text_Area.setText("");
    }//GEN-LAST:event_cleanButtonActionPerformed

    private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showButtonActionPerformed
        Document_Text_Area.setText(Main_Text_Area.getText());
    }//GEN-LAST:event_showButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUI log = new GUI();
                log.setLocationRelativeTo(null);
                log.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Document_Text_Area;
    private javax.swing.JTextArea Main_Text_Area;
    private javax.swing.JButton cleanButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel;
    private javax.swing.JPanel opaquePanel;
    private javax.swing.JButton showButton;
    // End of variables declaration//GEN-END:variables
}
