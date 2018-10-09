package view;

import service.SearchCloseCorrect;
import api.text.speech.google.Speak;
import dao.AcessDatabase;
import dao.ExecuteDatabase;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Dictionary;

public class ViewDictionary extends javax.swing.JFrame {

    // Inlitialize variable
    public static List<Dictionary> listDict = new ArrayList<Dictionary>();
    public static WindowInsert windowInsert = new WindowInsert();
    public static HashMap<String, String> hashMapWord = new HashMap<String, String>();
    public String var = "Hello";
    WindowOnline windowOnline = new WindowOnline();
    ExecuteDatabase executeDatabase = new ExecuteDatabase();

    // Inlitialization class
    public ViewDictionary() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setLocation(screenWidth / 4, screenHeight / 4);
        this.setResizable(false);
        initComponents();
        initData("a");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        jTWord = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDetail = new javax.swing.JTextArea();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListWord = new javax.swing.JList<>();
        bInsert = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMOnline = new javax.swing.JMenu();
        jMExit = new javax.swing.JMenu();

        jLabel1.setText("jLabel1");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon_Background.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon_Background1.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dictionary_English-Vietnamese");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon_Translate_1.png"))); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 51, 30, 30));

        jTWord.setBackground(new java.awt.Color(204, 255, 255));
        jTWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTWordKeyPressed(evt);
            }
        });
        getContentPane().add(jTWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 51, 252, 30));

        jTDetail.setBackground(new java.awt.Color(255, 255, 255));
        jTDetail.setColumns(20);
        jTDetail.setLineWrap(true);
        jTDetail.setRows(5);
        jTDetail.setWrapStyleWord(true);
        jTDetail.setSelectedTextColor(new java.awt.Color(204, 255, 204));
        jScrollPane1.setViewportView(jTDetail);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 400, 280));

        button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon_Clean.png"))); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        getContentPane().add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 11, 30, -1));

        button4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon_Speak.jpg"))); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        getContentPane().add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 40, 30));

        jListWord.setBackground(new java.awt.Color(255, 255, 204));
        jListWord.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListWordValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jListWord);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 87, 288, 280));

        bInsert.setBackground(new java.awt.Color(204, 255, 204));
        bInsert.setText("Insert");
        bInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInsertActionPerformed(evt);
            }
        });
        getContentPane().add(bInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 16, 67, -1));

        bEdit.setBackground(new java.awt.Color(204, 255, 204));
        bEdit.setText("Edit");
        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });
        getContentPane().add(bEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 16, 64, -1));

        bDelete.setBackground(new java.awt.Color(204, 255, 204));
        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(bDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 16, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon_Background.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 740, 420));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Cooper Black", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("DICTIONARY ENGLISH - VIETNAMESE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 330, 60));

        jMOnline.setText("Online");
        jMOnline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMOnlineMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMOnline);

        jMExit.setText("Exit");
        jMExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMExitMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMExit);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Search word from database

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:        
        String word = jTWord.getText().trim();
        if (jTWord.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please choose word to translate.");
        } else {
//            java.util.Date date = new java.util.Date(millis);
            if (jListWord.getModel().getSize() == 1) {
                JOptionPane.showMessageDialog(null, "This word doesn't inside my dictionary.");
                jTWord.requestFocus();
            } else {
                String wordDetail = hashMapWord.get(word);
                if (wordDetail != null) {
                    String var1 = wordDetail.replaceAll("<C><F><I><N><Q>", "\n      ");
                    String var2 = var1.replaceAll("<br />", "\n      ");
                    String var3 = var2.replaceAll("</Q></N></I></F></C>", "");
                    jTDetail.setText(word + " : " + var3);
                }
            }
        }
    }//GEN-LAST:event_searchActionPerformed

    // get current Word
    public String getCurrentWord() {
        return var;
    }

    // get current Detail of word
    public String getCurrentDetail() {
        return jTDetail.getText() + "detail";
    }

    // Clear all

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        jTDetail.setText("");
        jTWord.setText("");
        initData("");
    }//GEN-LAST:event_button3ActionPerformed

    // Speak English word or text

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        if (jTWord.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Doesn't exist word. Please choose word to speak.");
        } else {
            Speak speak = new Speak();
            if (jTWord.getText() != null) {
                speak.speech(jTWord.getText());
            }
        }
    }//GEN-LAST:event_button4ActionPerformed

    // Value box search = word is choosen

    private void jListWordValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListWordValueChanged
        // TODO add your handling code here:
        if (jListWord.getSelectedValue() != null) {
            String word = jListWord.getSelectedValue().toString();
            jTWord.setText(word);
        }
    }//GEN-LAST:event_jListWordValueChanged

    // Update listWord

    private void jTWordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTWordKeyPressed
        // TODO add your handling code here:
        String text = jTWord.getText();
        if (evt.getKeyChar() != 8) {
            text = text + evt.getKeyChar();
        } else {
            text = text.substring(0, text.length());
        }
        initData(text);
    }//GEN-LAST:event_jTWordKeyPressed

    // Execute when exit

    private void jMExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMExitMouseClicked
        // TODO add your handling code here:
        int click = JOptionPane.showConfirmDialog(null, "Do you want to exit.", "Question", JOptionPane.YES_NO_OPTION);
        if (click == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMExitMouseClicked

    // Reset list is read from database
    public void resetListDict() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        listDict = AcessDatabase.readDatabase();
        for (Dictionary dict : listDict) {
            hashMapWord.put(dict.getWord(), dict.getDetail());
        }
    }

    // Open window Online

    private void jMOnlineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMOnlineMouseClicked
        // TODO add your handling code here:
        windowOnline.openWindowOnline();
    }//GEN-LAST:event_jMOnlineMouseClicked

    // Open windowInsert

    private void bInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInsertActionPerformed
        // TODO add your handling code here:
        windowInsert.openWindowInsert();
    }//GEN-LAST:event_bInsertActionPerformed

    // Open windowEdit

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
        // TODO add your handling code here:
        if (jTWord.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Doesen't exist word. Please choose word to edit.");
        } else {
            WindowEdit windowEdit = new WindowEdit(jTWord.getText(), jTDetail.getText());
            windowEdit.openWindowEdit();
        }
    }//GEN-LAST:event_bEditActionPerformed

    // Delete word outside database

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        // TODO add your handling code here:
        String text = jTWord.getText();
        if (text.equals("")) {
            JOptionPane.showMessageDialog(null, "Doesn't exist word. Please choose word to delete.");
        } else {
            ExecuteDatabase executeDatabase = new ExecuteDatabase();
            if (hashMapWord.get(text) != null) {
                int click = JOptionPane.showConfirmDialog(null, "Do you want to delete" + "'" + jTWord.getText() + "'", "Question", JOptionPane.YES_NO_OPTION);
                if (click == JOptionPane.YES_OPTION) {
                    if (executeDatabase.deleteElement(text)) {
                        JOptionPane.showMessageDialog(null, "Delete sucess");
                        try {
                            listDict = AcessDatabase.readDatabase();
                        } catch (SQLException ex) {
                            Logger.getLogger(ViewDictionary.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(ViewDictionary.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (InstantiationException ex) {
                            Logger.getLogger(ViewDictionary.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IllegalAccessException ex) {
                            Logger.getLogger(ViewDictionary.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        jTDetail.setText("");
                        jTWord.setText("");
                        initData("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Delete fail");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, text + " doesn't inside database.");
            }
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    // Function get listWord closest with word
    public void initData(String word) {
        DefaultListModel model = new DefaultListModel();
        model.addElement("");
        SearchCloseCorrect searchClosest = new SearchCloseCorrect();
        if (word.equals("")) {
            jListWord.setModel(model);
        } else {
            for (Dictionary dict : listDict) {
                if (searchClosest.Compare(word, dict.getWord())) {
                    model.addElement(dict.getWord());
                }
            }
            jListWord.setModel(model);
        }
    }

    // Set value for Detail area
    public void setText3(String str) {
        jTDetail.setText(str);
    }

    // View
    public static void main(String args[]) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        listDict = AcessDatabase.readDatabase();
        if (listDict.size() > 0) {
            for (Dictionary dict : listDict) {
                hashMapWord.put(dict.getWord(), dict.getDetail());
            }
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDictionary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bInsert;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jListWord;
    private javax.swing.JMenu jMExit;
    private javax.swing.JMenu jMOnline;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTDetail;
    private javax.swing.JTextField jTWord;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables

    private void setResizeable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
