package cyber.management.system;

import java.util.ArrayList;
import model.Category;
import model.Item;
import dao.CategoryDao;
import dao.ItemDao;
import javax.swing.table.DefaultTableModel;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author aryan
 */
public class AddNewProject extends javax.swing.JFrame {

    /**
     * Creates new form AddNewProject
     */
    public AddNewProject() {
        initComponents();
        btnSave.setEnabled(false);
    }

    public void validateField() {
        String name = Name.getText();
        String price = Price.getText();
        if (!name.equals("") && !price.equals("")) {
            btnSave.setEnabled(true);
        } else {
            btnSave.setEnabled(false);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NewItem = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Category = new javax.swing.JComboBox<>();
        Price = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 134));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NewItem.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NewItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new product.png"))); // NOI18N
        NewItem.setText("New Item");
        getContentPane().add(NewItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 30, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 83, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Category");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 127, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Price");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        Name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NameKeyReleased(evt);
            }
        });
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 81, 341, -1));

        Category.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 122, 341, -1));

        Price.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PriceKeyReleased(evt);
            }
        });
        getContentPane().add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 168, 341, -1));

        btnSave.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnSave.setText("Sava");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 225, -1, -1));

        btnClear.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clear.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 225, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/small-page-background.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_NameKeyReleased

    private void PriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PriceKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_PriceKeyReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        ArrayList<Category> list = CategoryDao.getAllRecords();
        Iterator<Category> itr = list.iterator();
        while (itr.hasNext()) {
            Category categoryObj = itr.next();
            Category.addItem(categoryObj.getName());
        }
    }//GEN-LAST:event_formComponentShown

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Item item = new Item();
        item.setName(Name.getText());
        item.setCategory((String) Category.getSelectedItem());
        item.setPrice(Price.getText());
        ItemDao.save(item);
        setVisible(false);
        new AddNewProject().setVisible(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AddNewProject().setVisible(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Category;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel NewItem;
    private javax.swing.JTextField Price;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
