/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping_cart;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author a
 */
public class Inventory_List extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form Inventory_List
     */
    Inventory inven = new Inventory();   
    String Item;
    String Price;
    
    public Inventory_List() {
        initComponents();
        tableHeader();
        rowHieght();
    }
    
    public void tableHeader()
    {
        JTableHeader tableHeader = IList.getTableHeader();
        tableHeader.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 24));
    }
    
    public void rowHieght()
    {
        IList.setRowHeight(40);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        itemname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        IList = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        unitprice = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        AButton = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        UButton = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        BButton = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jLabel1.setText("Item Name:");
        jLabel1.setToolTipText("");

        itemname.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        jLabel3.setText("Unit Price:");

        IList.setAutoCreateRowSorter(true);
        IList.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 20));
        IList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Unit Price", "Quantity"
            }
        ));
        IList.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        IList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(IList);

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        jLabel4.setText("Quantity:");

        unitprice.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N

        quantity.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 48)); // NOI18N
        jLabel2.setText("Inventory");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, -1));

        AButton.setBackground(new java.awt.Color(204, 204, 204));
        AButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jLabel5.setText("    Add");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout AButtonLayout = new javax.swing.GroupLayout(AButton);
        AButton.setLayout(AButtonLayout);
        AButtonLayout.setHorizontalGroup(
            AButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
        );
        AButtonLayout.setVerticalGroup(
            AButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        UButton.setBackground(new java.awt.Color(204, 204, 204));
        UButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jLabel6.setText("   Update");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout UButtonLayout = new javax.swing.GroupLayout(UButton);
        UButton.setLayout(UButtonLayout);
        UButtonLayout.setHorizontalGroup(
            UButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        UButtonLayout.setVerticalGroup(
            UButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        BButton.setBackground(new java.awt.Color(204, 204, 204));
        BButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jLabel7.setText("     Back");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout BButtonLayout = new javax.swing.GroupLayout(BButton);
        BButton.setLayout(BButtonLayout);
        BButtonLayout.setHorizontalGroup(
            BButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BButtonLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BButtonLayout.setVerticalGroup(
            BButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(itemname, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitprice, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemname, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unitprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(AButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1413, 817));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IListMouseClicked

        DefaultTableModel tableModel = (DefaultTableModel)IList.getModel();
        
        String itemname1 = tableModel.getValueAt(IList.getSelectedRow(), 0).toString();
        String unitprice1 = tableModel.getValueAt(IList.getSelectedRow(), 1).toString();
        String quantity1 = tableModel.getValueAt(IList.getSelectedRow(), 2).toString();
        
        this.itemname.setText(itemname1);
        this.unitprice.setText(unitprice1);
        this.quantity.setText(quantity1);
        
        
    }//GEN-LAST:event_IListMouseClicked

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered

        Color clr = new Color(153, 153, 153);
        AButton.setBackground(clr);

    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited

        Color clr = new Color(204, 204, 204);
        AButton.setBackground(clr);

    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        try
        {
            inven.setProductName(String.valueOf(itemname.getText()));
            inven.setUnitPrice(Double.parseDouble(unitprice.getText()));
            inven.setQuantity(Integer.parseInt(quantity.getText()));
            
            if (itemname.getText().equals("") || unitprice.getText().equals("") || quantity.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Enter All The Data!");
            }
            else
            {            
                String sql = "INSERT INTO INVENTORY (ITEMNAME, UNITPRICE, QUANTITY)VALUES (?, ?, ?)";
                con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##SEProject", "SEP");
                pst = con.prepareStatement(sql);

                pst.setString(1, itemname.getText());
                pst.setString(2, unitprice.getText());
                pst.setString(3, quantity.getText());

                pst.executeUpdate();
                
                String data[] = {itemname.getText(), unitprice.getText(), quantity.getText()};
                Item = itemname.getText();
                Price = unitprice.getText();

                DefaultTableModel table = (DefaultTableModel)IList.getModel();
                table.addRow(data);

                JOptionPane.showMessageDialog(this, "Added Successfully");
            }
            
            itemname.setText("");
            unitprice.setText("");
            quantity.setText("");
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Enter Information Correctly");
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered

        Color clr = new Color(153, 153, 153);
        UButton.setBackground(clr);

    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited

        Color clr = new Color(204, 204, 204);
        UButton.setBackground(clr);

    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

        DefaultTableModel tableModel = (DefaultTableModel)IList.getModel();
        try 
        {         
            if(IList.getSelectedRowCount() == 1)
            {
                inven.setProductName(String.valueOf(itemname.getText()));
                inven.setUnitPrice(Double.parseDouble(unitprice.getText()));
                inven.setQuantity(Integer.parseInt(quantity.getText()));
                
                String ItemName = itemname.getText();
                String UnitPrice = unitprice.getText();
                String Quantity = quantity.getText();
                
                String sql = "UPDATE INVENTORY SET Unitprice=?, Quantity=? where ItemName=?";
                con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##SEProject", "SEP");
                pst = con.prepareStatement(sql);
                
                pst.setString(1, UnitPrice);
                pst.setString(2, Quantity);
                pst.setString(3, ItemName);
                
                pst.executeUpdate();

                tableModel.setValueAt(ItemName, IList.getSelectedRow(), 0);
                tableModel.setValueAt(UnitPrice, IList.getSelectedRow(), 1);
                tableModel.setValueAt(Quantity, IList.getSelectedRow(), 2);

                JOptionPane.showMessageDialog(this, "Updated Successfully");
                
                itemname.setText("");
                unitprice.setText("");
                quantity.setText("");
            }
            else
            {
                if (IList.getRowCount() == 0)
                {
                    JOptionPane.showMessageDialog(this, "Table is Empty");
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Please Select to Update");
                }
            }
        }
        catch (NumberFormatException NFE)
        {
            JOptionPane.showMessageDialog(this, "Only Number Can Be Entered");
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered

        Color clr = new Color(153, 153, 153);
        BButton.setBackground(clr);

    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited

        Color clr = new Color(204, 204, 204);
        BButton.setBackground(clr);

    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

        Admin_Portal ap = new Admin_Portal();
        ap.setVisible(true);
        dispose();

    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(Inventory_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory_List().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AButton;
    private javax.swing.JPanel BButton;
    protected static javax.swing.JTable IList;
    private javax.swing.JPanel UButton;
    private javax.swing.JTextField itemname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField unitprice;
    // End of variables declaration//GEN-END:variables
}
