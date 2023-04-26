import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GUI extends javax.swing.JFrame {
   SpellChecker SpellChecker = new SpellChecker();

   BST<String> getSuggestions(String selectedWord, int k) {
      return SpellChecker.getClosestWords(selectedWord, k);
   }

   public GUI() {
      initComponents();

   }

   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated
   // <editor-fold defaultstate="collapsed" desc="Generated
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
      getSuggestionsButton = new javax.swing.JButton();
      showButton = new javax.swing.JButton();
      cleanButton = new javax.swing.JButton();
      jLabel1 = new javax.swing.JLabel();
      kSpinner = new javax.swing.JSpinner();

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

      getSuggestionsButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
      getSuggestionsButton.setText("SUGG");
      getSuggestionsButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            getSuggestionsButtonActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout opaquePanelLayout = new javax.swing.GroupLayout(opaquePanel);
      opaquePanel.setLayout(opaquePanelLayout);
      opaquePanelLayout.setHorizontalGroup(
            opaquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(opaquePanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(getSuggestionsButton,
                              javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addGap(59, 59, 59)));
      opaquePanelLayout.setVerticalGroup(
            opaquePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(opaquePanelLayout.createSequentialGroup()
                        .addComponent(getSuggestionsButton,
                              javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                              javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 151, Short.MAX_VALUE)));

      showButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
      showButton.setText("SHOW");
      showButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            showButtonActionPerformed(evt);
         }
      });

      cleanButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
      cleanButton.setText("CLEAN");
      cleanButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            cleanButtonActionPerformed(evt);
         }
      });

      jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
      jLabel1.setText("K:");

      kSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 4, 1));

      javax.swing.GroupLayout kGradientPanelLayout = new javax.swing.GroupLayout(kGradientPanel);
      kGradientPanel.setLayout(kGradientPanelLayout);
      kGradientPanelLayout.setHorizontalGroup(
            kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(kGradientPanelLayout.createSequentialGroup()
                        .addGroup(kGradientPanelLayout
                              .createParallelGroup(
                                    javax.swing.GroupLayout.Alignment.LEADING,
                                    false)
                              .addGroup(kGradientPanelLayout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(jScrollPane1,
                                          javax.swing.GroupLayout.PREFERRED_SIZE,
                                          550,
                                          javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                    kGradientPanelLayout
                                          .createSequentialGroup()
                                          .addGroup(kGradientPanelLayout
                                                .createParallelGroup(
                                                      javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(kGradientPanelLayout
                                                      .createSequentialGroup()
                                                      .addContainerGap()
                                                      .addComponent(
                                                            opaquePanel,
                                                            javax.swing.GroupLayout.PREFERRED_SIZE,
                                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                                            javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                      kGradientPanelLayout
                                                            .createSequentialGroup()
                                                            .addGap(18, 18,
                                                                  18)
                                                            .addComponent(
                                                                  jLabel1)
                                                            .addGap(18, 18,
                                                                  18)
                                                            .addGroup(kGradientPanelLayout
                                                                  .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                  .addComponent(
                                                                        kSpinner)
                                                                  .addComponent(
                                                                        cleanButton,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        80,
                                                                        Short.MAX_VALUE)
                                                                  .addComponent(
                                                                        showButton,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE))))
                                          .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(jScrollPane2,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                380,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(25, Short.MAX_VALUE)));
      kGradientPanelLayout.setVerticalGroup(
            kGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(kGradientPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241,
                              javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(kGradientPanelLayout
                              .createParallelGroup(
                                    javax.swing.GroupLayout.Alignment.TRAILING,
                                    false)
                              .addGroup(kGradientPanelLayout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(jScrollPane2,
                                          javax.swing.GroupLayout.PREFERRED_SIZE,
                                          342,
                                          javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(kGradientPanelLayout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addComponent(showButton,
                                          javax.swing.GroupLayout.PREFERRED_SIZE,
                                          32,
                                          javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(
                                          javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cleanButton,
                                          javax.swing.GroupLayout.PREFERRED_SIZE,
                                          32,
                                          javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(kGradientPanelLayout
                                          .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(kSpinner,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                32,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(jLabel1))
                                    .addPreferredGap(
                                          javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                          javax.swing.GroupLayout.DEFAULT_SIZE,
                                          Short.MAX_VALUE)
                                    .addComponent(opaquePanel,
                                          javax.swing.GroupLayout.PREFERRED_SIZE,
                                          javax.swing.GroupLayout.DEFAULT_SIZE,
                                          javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(25, Short.MAX_VALUE)));

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

   private void getSuggestionsButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_getSuggestionsButtonActionPerformed
      String selectedWord = inputTextArea.getSelectedText();
      int k = (int) kSpinner.getValue();

      BST<String> suggestions = getSuggestions(selectedWord, k);
   }// GEN-LAST:event_getSuggestionsButtonActionPerformed

   private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_showButtonActionPerformed
      outputTextArea.setText("");

      String inputText = inputTextArea.getText().toLowerCase().trim();

      Pattern pattern = Pattern.compile("[\\p{L}\\p{N}_]+");
      Matcher matcher = pattern.matcher(inputText);

      while (matcher.find()) {
         String word = matcher.group();
         BST<String> closestWords = SpellChecker.getClosestWords(word);

         String closestWord = SpellChecker.getClosestWord(closestWords, word);
         if (closestWord == null) {
            outputTextArea.append(word + " ");
            continue;
         }
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
   private javax.swing.JButton getSuggestionsButton;
   private javax.swing.JTextArea inputTextArea;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private keeptoo.KGradientPanel kGradientPanel;
   private javax.swing.JSpinner kSpinner;
   private javax.swing.JPanel opaquePanel;
   private javax.swing.JTextArea outputTextArea;
   private javax.swing.JButton showButton;
   // End of variables declaration//GEN-END:variables
}
