/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package archive.voting.application;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author i_lke
 */
public class HSOForm extends javax.swing.JFrame {

    /**
     * Creates new form HSOForm
     */
    DefaultListModel ECList = new DefaultListModel();
    DefaultListModel EList = new DefaultListModel();
    public HSOForm() {
        initComponents();
        listECs.setModel(ECList);
        listElections.setModel(EList);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        btnRemoveEC = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listECs = new javax.swing.JList();
        lblEC = new javax.swing.JLabel();
        btnCertifyElection = new javax.swing.JButton();
        btnDisqualifyVote = new javax.swing.JButton();
        btnRecountVotes = new javax.swing.JButton();
        btnCreateElection = new javax.swing.JButton();
        lblElections = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listElections = new javax.swing.JList();
        btnRemoveElection = new javax.swing.JButton();
        lblECName = new javax.swing.JLabel();
        txtECID = new javax.swing.JTextField();
        lblECName1 = new javax.swing.JLabel();
        txtEName = new javax.swing.JTextField();
        btnECClear = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRemoveEC.setText("Remove Election Commissioner");
        btnRemoveEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveECActionPerformed(evt);
            }
        });

        listECs.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listECs);

        lblEC.setText("Election Commisioners:");

        btnCertifyElection.setText("Certify Election");
        btnCertifyElection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertifyElectionActionPerformed(evt);
            }
        });

        btnDisqualifyVote.setText("Disqualify Vote");
        btnDisqualifyVote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisqualifyVoteActionPerformed(evt);
            }
        });

        btnRecountVotes.setText("Recount Votes");
        btnRecountVotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecountVotesActionPerformed(evt);
            }
        });

        btnCreateElection.setText("Create Election");
        btnCreateElection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateElectionActionPerformed(evt);
            }
        });

        lblElections.setText("Elections:");

        listElections.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listElections);

        btnRemoveElection.setText("Remove Election");
        btnRemoveElection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveElectionActionPerformed(evt);
            }
        });

        lblECName.setText("ID#:");

        txtECID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtECIDActionPerformed(evt);
            }
        });

        lblECName1.setText("Name:");

        txtEName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtENameActionPerformed(evt);
            }
        });

        btnECClear.setText("Clear");
        btnECClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnECClearActionPerformed(evt);
            }
        });

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel2.setText("Head of Student Organizations Screen");

        jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/archive/voting/application/Logo_S.png"))); // NOI18N

        jRadioButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/archive/voting/application/Logo_C.png"))); // NOI18N
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnRemoveEC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnECClear))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnRemoveElection)
                                .addGap(26, 26, 26)
                                .addComponent(btnCertifyElection))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnDisqualifyVote)
                                .addGap(36, 36, 36)
                                .addComponent(btnRecountVotes))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCreateElection)
                                .addGap(68, 68, 68)
                                .addComponent(btnLogOut))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblEC)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblECName)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtECID, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblElections)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblECName1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtEName, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jRadioButton1)
                        .addGap(66, 66, 66)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblEC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtECID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblECName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRemoveEC)
                            .addComponent(btnECClear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblElections)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblECName1))
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRemoveElection)
                            .addComponent(btnCertifyElection))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRecountVotes)
                            .addComponent(btnDisqualifyVote))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCreateElection)
                            .addComponent(btnLogOut))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveECActionPerformed
        // TODO add your handling code here:
      if(!ECList.isEmpty())
        {
            if(!(txtECID.getText()).isEmpty())
            {
                if(ECList.contains(txtECID.getText()))
                        {
                            ECList.removeElement(txtECID.getText());
                            txtECID.setText("");
                            ECList.removeElement(txtECID.getText());
                        }
                else
                {
                    JOptionPane.showMessageDialog(this, "The specified Election Commissioner is not an active Election Commissioner.");
                }
               
            }
            else if(!listElections.getSelectedValue().toString().isEmpty())
            {
                EList.removeElement(listElections.getSelectedValue());
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Election Commissioner not specified.");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "There are no active Elections Commissioners.");
        }
    }//GEN-LAST:event_btnRemoveECActionPerformed

    private void btnCertifyElectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCertifyElectionActionPerformed
        // TODO add your handling code here:
        if(!EList.isEmpty() || !txtEName.getText().isEmpty())
        {
            if(!listElections.getSelectedValue().toString().isEmpty() || !txtEName.getText().isEmpty())
            {
                if(JOptionPane.showConfirmDialog(this, "Certify Election?") == 0)
                {
                    if(!(txtEName.getText()).isEmpty()){
                       EList.removeElement(txtEName.getText());
                       txtEName.setText("");
                       //demo
                       ECList.removeElement("600192294");
                    }
                    else if(!listElections.getSelectedValue().toString().isEmpty()){
                        EList.removeElement(listElections.getSelectedValue());
                        //demo
                        ECList.removeElement("800192294");
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Election not specified.");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Please create an election, there are no active elections");
        }
        
        
    }//GEN-LAST:event_btnCertifyElectionActionPerformed

    private void btnCreateElectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateElectionActionPerformed
        // TODO add your handling code here:

        CreateElectionDialog createelectiondialog = new CreateElectionDialog(this,true);
        for(int i =0; i < ECList.getSize(); i++)
        {
        createelectiondialog.Commissioner.addElement(ECList.getElementAt(i));
        }
        createelectiondialog.setVisible(true);
        //
        if(!createelectiondialog.getElection().equals("") && !createelectiondialog.getCommissioner().equals(""))
        {
        EList.addElement(createelectiondialog.getElection());
            if(!ECList.contains(createelectiondialog.getCommissioner()))
            {
            ECList.addElement(createelectiondialog.getCommissioner());
            }
        }
        else
        {
            EList.removeElement(createelectiondialog.getElection());
            ECList.removeElement(createelectiondialog.getCommissioner());
        }
    }//GEN-LAST:event_btnCreateElectionActionPerformed

    private void btnRemoveElectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveElectionActionPerformed
        // TODO add your handling code here:
        if(!EList.isEmpty())
        {
            if(!(txtEName.getText()).isEmpty())
            {
                if(EList.contains(txtEName.getText()))
                        {
                            EList.removeElement(txtEName.getText());
                            txtEName.setText("");
                            EList.removeElement(txtEName.getText());
                            //demonstration purpose only
                            ECList.removeElement("900192294");
                        }
                else
                {
                    JOptionPane.showMessageDialog(this, "The specified Election is not an active Election.");
                }
               
            }
            else if(!listElections.getSelectedValue().toString().isEmpty())
            {
                EList.removeElement(listElections.getSelectedValue());
                //demonstratin purpose only
                ECList.removeElement("700192294");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Election not specified.");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "There are no active elections.");
        }
    }//GEN-LAST:event_btnRemoveElectionActionPerformed

    private void btnDisqualifyVoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisqualifyVoteActionPerformed
        // TODO add your handling code here:
        DisqualifyVoteDialog disqualifyvote = new DisqualifyVoteDialog(this, true);
        if(!EList.isEmpty() || !txtEName.getText().isEmpty())
        {
            if(!listElections.getSelectedValue().toString().isEmpty() || !txtEName.getText().isEmpty())
            {
                
                if(!(txtEName.getText()).isEmpty() || !listElections.getSelectedValue().toString().isEmpty()) 
                {
                    if(!(txtEName.getText()).isEmpty()){
                      
                    }
                    else if(!listElections.getSelectedValue().toString().isEmpty()){
                       
                    }
                }
                
                disqualifyvote.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Election not specified.");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Please create an election, there are no active elections");
        }
    }//GEN-LAST:event_btnDisqualifyVoteActionPerformed

    private void txtECIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtECIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtECIDActionPerformed

    private void txtENameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtENameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtENameActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnECClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnECClearActionPerformed
        // TODO add your handling code here:
         if(!ECList.isEmpty())
        {
            ECList.clear();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "There are no active Elections Commissioners.");
        }
    }//GEN-LAST:event_btnECClearActionPerformed

    private void btnRecountVotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecountVotesActionPerformed
        // TODO add your handling code here:
        if(!EList.isEmpty() || !txtEName.getText().isEmpty())
        {
            if(!listElections.getSelectedValue().toString().isEmpty() || !txtEName.getText().isEmpty())
            {
                if(!(txtEName.getText()).isEmpty() || !listElections.getSelectedValue().toString().isEmpty()) 
                {
                    if(!(txtEName.getText()).isEmpty()){
                      
                    }
                    else if(!listElections.getSelectedValue().toString().isEmpty()){
                       
                    }
                }
                JOptionPane.showMessageDialog(this, "Votes recounted");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Election not specified.");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Please create an election, there are no active elections");
        }
    }//GEN-LAST:event_btnRecountVotesActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    public String getElection()
    {
        String strElection = new String();
        
        if(!EList.isEmpty())
        {
            for(int i =0; i < EList.getSize(); i++)
            {
                strElection = strElection + "\n" + EList.getElementAt(i);
            }
        }
        return strElection;
    }
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
            java.util.logging.Logger.getLogger(HSOForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HSOForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HSOForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HSOForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HSOForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCertifyElection;
    private javax.swing.JButton btnCreateElection;
    private javax.swing.JButton btnDisqualifyVote;
    private javax.swing.JButton btnECClear;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnRecountVotes;
    private javax.swing.JButton btnRemoveEC;
    private javax.swing.JButton btnRemoveElection;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblEC;
    private javax.swing.JLabel lblECName;
    private javax.swing.JLabel lblECName1;
    private javax.swing.JLabel lblElections;
    private javax.swing.JList listECs;
    private javax.swing.JList listElections;
    private javax.swing.JTextField txtECID;
    private javax.swing.JTextField txtEName;
    // End of variables declaration//GEN-END:variables
}
