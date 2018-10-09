/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import api.google.translate.EnglishVietnamese;
import api.text.speech.google.Speak;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.json.simple.parser.ParseException;

public class WindowOnline extends javax.swing.JFrame {

    EnglishVietnamese englishVietnamese = new EnglishVietnamese();
    Speak speak = new Speak();

    public WindowOnline() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setLocation(screenWidth / 4 + 450, screenHeight / 4 - 150);
        this.setResizable(false);
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jText = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextTranslate = new javax.swing.JTextArea();
        jBClear = new javax.swing.JButton();
        jBSearch = new javax.swing.JButton();
        jBSpeak = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMExit = new javax.swing.JMenu();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon_Background1.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jText.setBackground(new java.awt.Color(204, 255, 255));
        jText.setColumns(20);
        jText.setRows(5);
        jScrollPane1.setViewportView(jText);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 54, 173, 181));

        jTextTranslate.setBackground(new java.awt.Color(255, 255, 204));
        jTextTranslate.setColumns(20);
        jTextTranslate.setRows(5);
        jScrollPane2.setViewportView(jTextTranslate);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 54, 225, 181));

        jBClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon_Clean.png"))); // NOI18N
        jBClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClearActionPerformed(evt);
            }
        });
        getContentPane().add(jBClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 18, 27, -1));

        jBSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon_Translate.png"))); // NOI18N
        jBSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSearchActionPerformed(evt);
            }
        });
        getContentPane().add(jBSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 18, 29, -1));

        jBSpeak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon_Speak.jpg"))); // NOI18N
        jBSpeak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSpeakActionPerformed(evt);
            }
        });
        getContentPane().add(jBSpeak, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 18, 27, -1));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel1.setText("Vietnamese");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 70, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel2.setText("English");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 68, 30));

        jMExit.setBackground(new java.awt.Color(255, 204, 204));
        jMExit.setText("Exit");
        jMExit.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jMExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMExitMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMExit);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Clear all
    
    private void jBClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClearActionPerformed
        // TODO add your handling code here:
        jText.setText("");
        jTextTranslate.setText("");
    }//GEN-LAST:event_jBClearActionPerformed

    // Search meaning of Text
    
    private void jBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchActionPerformed
        // TODO add your handling code here:
        if (jText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Text doesn't exist. Please press in Text.");
        } else {
            try {
                jTextTranslate.setText(englishVietnamese.translate(jText.getText()));
            } catch (IOException ex) {
                Logger.getLogger(WindowOnline.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(WindowOnline.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBSearchActionPerformed

    // Speak English text
    
    private void jBSpeakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSpeakActionPerformed
        // TODO add your handling code here:
        if (jText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Text doesn't exist. Please press in Text.");
        } else {
            speak.speech(jText.getText());
        }
    }//GEN-LAST:event_jBSpeakActionPerformed

    // Exit program
    
    private void jMExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMExitMouseClicked
        // TODO add your handling code here:
        int click = JOptionPane.showConfirmDialog(null, "Do you want to exit.", "Question", JOptionPane.YES_NO_OPTION);
        if (click == JOptionPane.YES_OPTION) {
            super.dispose();
        }
    }//GEN-LAST:event_jMExitMouseClicked

    public static void openWindowOnline() {
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
            java.util.logging.Logger.getLogger(WindowOnline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowOnline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowOnline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowOnline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowOnline().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBClear;
    private javax.swing.JButton jBSearch;
    private javax.swing.JButton jBSpeak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMExit;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jText;
    private javax.swing.JTextArea jTextTranslate;
    // End of variables declaration//GEN-END:variables
}
