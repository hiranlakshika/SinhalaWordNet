package WordNet.UI;

import WordNet.Database.DBConnection;
import WordNet.morphology.WordTypeChecker;
import WordNet.morphology.WordsGenerator;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * The type Main frame.
 *
 * @author hiran
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        btnExit = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfieldWord = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Sentencetable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        tfieldBasicForm = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfieldWordType = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuEdit = new javax.swing.JMenu();
        mnuHelp = new javax.swing.JMenu();
        mnuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sinhala WordNet 1.0");

        btnExit.setText("Exit");
        btnExit.setToolTipText("Click here to exit the program");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        btnSearch.setToolTipText("Click here to search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnSearchActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (UnsupportedFlavorException e) {
                    e.printStackTrace();
                }
            }
        });

        jLabel1.setText("Word");

        tfieldWord.setFont(new java.awt.Font("Iskoola Pota", 0, 11)); // NOI18N
        tfieldWord.setToolTipText("Type your word here");
        tfieldWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfieldWordActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.setToolTipText("Click here to clear the word");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        Sentencetable.setPreferredScrollableViewportSize(Toolkit.getDefaultToolkit().getScreenSize());
        Sentencetable.setFont(new java.awt.Font("Iskoola Pota", 0, 11)); // NOI18N
        Sentencetable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Sentences"
                }
        ));
        jScrollPane2.setViewportView(Sentencetable);

        jLabel2.setText("Basic Form");

        tfieldBasicForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfieldBasicFormActionPerformed(evt);
            }
        });

        jLabel3.setText("Type");

        tfieldWordType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfieldWordTypeActionPerformed(evt);
            }
        });

        mnuFile.setText("File");
        jMenuBar1.add(mnuFile);

        mnuEdit.setText("Edit");
        jMenuBar1.add(mnuEdit);

        mnuHelp.setText("Help");

        mnuAbout.setText("About");
        mnuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAboutActionPerformed(evt);
            }
        });
        mnuHelp.add(mnuAbout);

        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(37, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfieldBasicForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                        .addComponent(tfieldWordType, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tfieldWord, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(btnClear)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(btnExit))
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnSearch))
                                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(tfieldWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSearch))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(tfieldBasicForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(tfieldWordType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 220, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnClear)
                                        .addComponent(btnExit))
                                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>

    /**
     * Go.
     */
    public void go() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
                //UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
                //UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
                //UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
                UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");

            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainFrame f = new MainFrame();
                f.setLocationRelativeTo(null);
                f.setVisible(true);
                tfieldWord.getInputMap().put(KeyStroke.getKeyStroke("control C"), "preventCopy");
                tfieldWord.getActionMap().put("preventCopy", new AbstractAction() {
                    public void actionPerformed(ActionEvent e) {
                        try {
                            String clipBoardText = (String) Toolkit.getDefaultToolkit()
                                    .getSystemClipboard().getData(DataFlavor.stringFlavor);
                            tfieldWord.setText(clipBoardText);
                        } catch (UnsupportedFlavorException e1) {
                            e1.printStackTrace();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }
                });
            }
        });
    }

    /**
     * Clear.
     */
    public void clear() {
        DefaultTableModel dm = (DefaultTableModel) Sentencetable.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void mnuAboutActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Sinhala WordNet 1.0\nby Hiran Lakshika");
    }

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {
        tfieldWord.setText("");
        tfieldBasicForm.setText("");
        tfieldWordType.setText("");
        //clearTable(Sentencetable);
        clear();
    }

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) throws IOException, UnsupportedFlavorException {
        clear();
        if (tfieldWord.getText().length() > 1) {
            String sql = "SELECT * FROM `sentence` WHERE text like '" + "%" + tfieldWord.getText() + "%" + "'";

            try {
                Connection connection = DBConnection.getConnection();
                Statement stm = connection.createStatement();
                ResultSet rst = stm.executeQuery(sql);
                DefaultTableModel dtm = (DefaultTableModel) Sentencetable.getModel();
                while (rst.next()) {
                    Object[] rowData = {rst.getString("text")};
                    dtm.addRow(rowData);
                }
                tfieldWordType.setText(WordTypeChecker.checkWordType(tfieldWord.getText()));
                tfieldBasicForm.setText(WordsGenerator.generateWord(tfieldWord.getText()));
            } catch (SQLException | ClassNotFoundException | ArrayIndexOutOfBoundsException ex) {
                System.out.println("" + ex.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(this, "Please insert a valid Sinhala word");
        }

    }


    private void tfieldWordActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void tfieldBasicFormActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void tfieldWordTypeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * Main.
     *
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
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
                //UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
                //UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
                //UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
                UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");

            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify
    private javax.swing.JTable Sentencetable;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem mnuAbout;
    private javax.swing.JMenu mnuEdit;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JTextField tfieldBasicForm;
    private javax.swing.JTextField tfieldWordType;
    private static javax.swing.JTextField tfieldWord;
    // End of variables declaration
}
