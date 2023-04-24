import java.util.Arrays;
import java.util.List;

public class GUI extends javax.swing.JFrame {
    Functions functions = new Functions();

    List<String> words = functions.getWords();
    BST<String> dictionaryBST = new BST<>();

    public GUI() {
        initComponents();

        for (String word : words) {
            dictionaryBST.insert(word);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputTextArea = new javax.swing.JTextArea();
        opaquePanel = new javax.swing.JPanel();
        showButton = new javax.swing.JButton();
        cleanButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SPELL CHECK");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(51, 51, 51));
        setName("workFrame"); // NOI18N
        setResizable(false);

        kGradientPanel.setkEndColor(new java.awt.Color(221, 255, 255));
        kGradientPanel.setkStartColor(new java.awt.Color(176, 196, 222));

        inputTextArea.setColumns(20);
        inputTextArea.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        inputTextArea.setLineWrap(true);
        inputTextArea.setRows(5);
        jScrollPane1.setViewportView(inputTextArea);

        outputTextArea.setEditable(false);
        outputTextArea.setBackground(new java.awt.Color(255, 255, 255));
        outputTextArea.setColumns(20);
        outputTextArea.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        outputTextArea.setForeground(new java.awt.Color(0, 102, 51));
        outputTextArea.setLineWrap(true);
        outputTextArea.setRows(5);
        jScrollPane2.setViewportView(outputTextArea);

        opaquePanel.setOpaque(false);

        javax.swing.GroupLayout opaquePanelLayout = new javax.swing.GroupLayout(opaquePanel);
        opaquePanel.setLayout(opaquePanelLayout);
        opaquePanelLayout.setHorizontalGroup(
                opaquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 189, Short.MAX_VALUE));
        opaquePanelLayout.setVerticalGroup(
                opaquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));

        showButton.setBackground(new java.awt.Color(255, 153, 204));
        showButton.setForeground(new java.awt.Color(51, 255, 51));
        showButton.setText("show");
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonActionPerformed(evt);
            }
        });

        cleanButton.setText("clean");
        cleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanelLayout = new javax.swing.GroupLayout(kGradientPanel);
        kGradientPanel.setLayout(kGradientPanelLayout);
        kGradientPanelLayout.setHorizontalGroup(
                kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(kGradientPanelLayout.createSequentialGroup()
                                .addGroup(kGradientPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(kGradientPanelLayout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanelLayout
                                                .createSequentialGroup()
                                                .addGroup(kGradientPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(kGradientPanelLayout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(kGradientPanelLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(opaquePanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                        kGradientPanelLayout.createSequentialGroup()
                                                                                .addGap(58, 58, 58)
                                                                                .addComponent(showButton)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                kGradientPanelLayout.createSequentialGroup()
                                                                        .addGap(56, 56, 56)
                                                                        .addComponent(cleanButton)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(25, Short.MAX_VALUE)));
        kGradientPanelLayout.setVerticalGroup(
                kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(kGradientPanelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(kGradientPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(kGradientPanelLayout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(25, Short.MAX_VALUE))
                                        .addGroup(kGradientPanelLayout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(showButton)
                                                .addGap(12, 12, 12)
                                                .addComponent(opaquePanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cleanButton)
                                                .addGap(51, 51, 51)))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(kGradientPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(kGradientPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_showButtonActionPerformed
        String inputAreaText = inputTextArea.getText().toLowerCase().trim();

        words = Arrays.asList(inputAreaText.split("[^\\p{L}\\d]+"));

        for (String word : words) {
            if (functions.isWordInDictionary(word)) {
                outputTextArea.append(word + " ");
                continue;
            }
            String closestWord = dictionaryBST.getClosestWord(word);
            outputTextArea.append(closestWord + " ");
        }
    }// GEN-LAST:event_showButtonActionPerformed

    private void cleanButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cleanButtonActionPerformed
        outputTextArea.setText("");
    }// GEN-LAST:event_cleanButtonActionPerformed

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
    private javax.swing.JButton cleanButton;
    private javax.swing.JTextArea inputTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel;
    private javax.swing.JPanel opaquePanel;
    private javax.swing.JTextArea outputTextArea;
    private javax.swing.JButton showButton;
    // End of variables declaration//GEN-END:variables
}
